import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Report {
//	calculateTotalIncome()
//	calculateTotalExpense()
//	calculateBalance()
//	showMonthlyReport()
//	showCategoryWiseExpenses()

	private final Scanner input;
	private final Connection c;
	
	
	public Report(Connection c, Scanner input) {
		this.input = input;
		this.c = c;
	}

	public long calculateTotalIncome() throws SQLException{
		String sql = "SELECT COALESCE(SUM(amount), 0) FROM income";

        try (PreparedStatement p = c.prepareStatement(sql);
             ResultSet rs = p.executeQuery()) {
            rs.next();
            return rs.getLong(1);
        }
	}
	
	public long calculateTotalExpense() throws SQLException {
        String sql = "SELECT COALESCE(SUM(amount), 0) FROM expense";

        try (PreparedStatement p = c.prepareStatement(sql);
             ResultSet rs = p.executeQuery()) {
            rs.next();
            return rs.getLong(1);
        }
    }
	public void calculateBalance() {
        try {
            long income = calculateTotalIncome();
            long expense = calculateTotalExpense();

            System.out.println("Total Income: " + income);
            System.out.println("Total Expense: " + expense);
            System.out.println("Current Balance: " + (income - expense));
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

	public void showMonthlyReport() {
        try {
            System.out.println("Enter month (1-12):");
            int month = Integer.parseInt(input.nextLine());

            System.out.println("Enter year:");
            int year = Integer.parseInt(input.nextLine());

            if (month < 1 || month > 12 || year < 1) {
                System.out.println("Invalid month or year.");
                return;
            }

            String sqlIncome =
            	    "SELECT COALESCE(SUM(amount), 0) FROM Income " +
            	    "WHERE MONTH(income_date) = ? AND YEAR(income_date) = ?";
            String sqlExpense =
            	    "SELECT COALESCE(SUM(amount), 0) FROM Expense " +
            	    "WHERE MONTH(expense_date) = ? AND YEAR(expense_date) = ?";
            long income;
            long expense;

            try (PreparedStatement p = c.prepareStatement(sqlIncome)) {
                p.setInt(1, month);
                p.setInt(2, year);
                try (ResultSet rs = p.executeQuery()) {
                    rs.next();
                    income = rs.getLong(1);
                }
            }

            try (PreparedStatement p = c.prepareStatement(sqlExpense)) {
                p.setInt(1, month);
                p.setInt(2, year);
                try (ResultSet rs = p.executeQuery()) {
                    rs.next();
                    expense = rs.getLong(1);
                }
            }

            System.out.println("Monthly Income: " + income);
            System.out.println("Monthly Expense: " + expense);
            System.out.println("Monthly Balance: " + (income - expense));

        } catch (SQLException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void showCategoryWiseExpenses() {
        String sql = "SELECT category, SUM(amount) AS total " +
                     "FROM expense GROUP BY category";

        try (PreparedStatement p = c.prepareStatement(sql);
             ResultSet rs = p.executeQuery()) {

            while (rs.next()) {
                System.out.println(
                    rs.getString("category") + ": " +
                    rs.getLong("total")
                );
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
