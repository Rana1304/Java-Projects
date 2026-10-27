import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TransactionManager {
	
	private final Scanner input;
	private final Connection c;
	
	public TransactionManager(Scanner input,Connection c) {
		this.input = input;
		this.c = c;
	}
	
	private Expense readExpense(ResultSet rs) throws SQLException {
        return new Expense(
        	rs.getInt("expense_id"),
            rs.getLong("amount"),
            rs.getString("category"),
            rs.getString("description")
        );
    }
	
	private Income readIncome(ResultSet rs) throws SQLException {
        return new Income(
        	rs.getInt("income_id"),
            rs.getLong("amount"),
            rs.getString("source"),
            rs.getString("description")
        );
    }
	
	public void addExpense() {
        try {
            System.out.println("Enter Amount:");
            Long amount = Long.parseLong(input.nextLine());

            System.out.println("Enter cateogry:");
            String cateogry = input.nextLine();

            System.out.println("Enter description:");
            String description = input.nextLine();

            if (cateogry.isBlank() || description.isBlank() || amount < 0) {
                System.out.println("Invalid details.");
                return;
            }

            String sql = "INSERT INTO expense (amount,category,description) VALUES (?, ?, ?)";

            try (PreparedStatement p = c.prepareStatement(sql)) {
                p.setLong(1, amount);
                p.setString(2, cateogry);
                p.setString(3, description);

                p.executeUpdate();
                System.out.println("Expense created successfully.");
            }
        } catch (SQLException | NumberFormatException e) {
            System.out.println("Could not create expense: " + e.getMessage());
        }
    }
	
	public void addIncome() {
        try {
            System.out.println("Enter Amount:");
            Long amount = Long.parseLong(input.nextLine());

            System.out.println("Enter Source:");
            String source = input.nextLine();

            System.out.println("Enter description:");
            String description = input.nextLine();

            if (source.isBlank() || description.isBlank() || amount < 0) {
                System.out.println("Invalid details.");
                return;
            }

            String sql = "INSERT INTO income (amount,source,description) VALUES (?, ?, ?)";

            try (PreparedStatement p = c.prepareStatement(sql)) {
                p.setLong(1, amount);
                p.setString(2, source);
                p.setString(3, description);

                p.executeUpdate();
                System.out.println("Income Added successfully.");
            }
        } catch (SQLException | NumberFormatException e) {
            System.out.println("Could not create Income: " + e.getMessage());
        }
    }
	
	public Expense findExpense() {
        System.out.println("Enter Expense number:");

        try {
            int accNo = Integer.parseInt(input.nextLine());

            String sql = "SELECT * FROM expense WHERE expense_id = ?";

            try (PreparedStatement p = c.prepareStatement(sql)) {
                p.setInt(1, accNo);

                try (ResultSet rs = p.executeQuery()) {
                    if (rs.next()) {
                        return readExpense(rs);
                    }
                }
            }

            System.out.println("Expense not found.");
        } catch (SQLException | NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        }

        return null;
    }
	
	 public void removeExpense() {
	        Expense exp = findExpense();
	        if (exp == null) return;

	        try (PreparedStatement p = c.prepareStatement(
	                "DELETE FROM expense WHERE expense_id = ?")) {
	            p.setInt(1, exp.expense_id);

	            if (p.executeUpdate() > 0) {
	                System.out.println("Expense removed successfully.");
	            }
	        } catch (SQLException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	 
	 public void showAllExpense() {
	        String sql = "SELECT * FROM expense";

	        try (PreparedStatement p = c.prepareStatement(sql);
	             ResultSet rs = p.executeQuery()) {

	            boolean found = false;

	            while (rs.next()) {
	                System.out.println(readExpense(rs));
	                found = true;
	            }

	            if (!found) {
	                System.out.println("No Expense found.");
	            }
	        } catch (SQLException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	 
	 public void showAllIncome() {
	        String sql = "SELECT * FROM income";

	        try (PreparedStatement p = c.prepareStatement(sql);
	             ResultSet rs = p.executeQuery()) {

	            boolean found = false;

	            while (rs.next()) {
	                System.out.println(readIncome(rs));
	                found = true;
	            }

	            if (!found) {
	                System.out.println("No Expense found.");
	            }
	        } catch (SQLException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	
	 public void searchTransaction() {
		    System.out.println("1. Search Expense");
		    System.out.println("2. Search Income");
		    System.out.print("Enter your choice: ");

		    int choice = input.nextInt();

		    System.out.print("Enter Transaction ID: ");
		    int id = input.nextInt();

		    String sql;

		    if (choice == 1) {
		        sql = "SELECT * FROM Expense WHERE expense_id = ?";
		    } else if (choice == 2) {
		        sql = "SELECT * FROM Income WHERE income_id = ?";
		    } else {
		        System.out.println("Invalid choice.");
		        return;
		    }

		    try (PreparedStatement p = c.prepareStatement(sql)) {
		        p.setInt(1, id);

		        try (ResultSet rs = p.executeQuery()) {
		            if (rs.next()) {
		                System.out.println(rs.getInt(1) + " | "
		                        + rs.getBigDecimal(2) + " | "
		                        + rs.getString(3) + " | "
		                        + rs.getString(4) + " | "
		                        + rs.getDate(5));
		            } else {
		                System.out.println("Transaction not found.");
		            }
		        }
		    } catch (SQLException e) {
		        e.printStackTrace();
		    }
		}
	 
	 
}
