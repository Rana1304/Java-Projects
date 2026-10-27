
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Connection c = DbConnection.getConnection();
             Scanner input = new Scanner(System.in)) {

            TransactionManager manager =
                new TransactionManager(input, c);
            Report report = new Report(c, input);

            int choice =0;

            do {
                System.out.println("\n--- EXPENSE TRACKER ---");
                System.out.println("1. Add Expense");
                System.out.println("2. Add Income");
                System.out.println("3. Remove Expense");
                System.out.println("4. Show All Expenses");
                System.out.println("5. Show All Income");
                System.out.println("6. Search Transaction");
                System.out.println("7. Calculate Balance");
                System.out.println("8. Monthly Report");
                System.out.println("9. Category-wise Expenses");
                System.out.println("0. Exit");
                System.out.print("Enter choice: ");

                try {
                    choice = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Enter a valid number.");
                    continue;
                }

                switch (choice) {
                    case 1 -> manager.addExpense();
                    case 2 -> manager.addIncome();
                    case 3 -> manager.removeExpense();
                    case 4 -> manager.showAllExpense();
                    case 5 -> manager.showAllIncome();
                    case 6 -> manager.searchTransaction();
                    case 7 -> report.calculateBalance();
                    case 8 -> report.showMonthlyReport();
                    case 9 -> report.showCategoryWiseExpenses();
                    case 0 -> System.out.println("Goodbye!");
                    default -> System.out.println("Invalid choice.");
                }

            } while (choice != 0);

        } catch (SQLException e) {
            System.out.println("Database connection error: "
                    + e.getMessage());
        }
    }
}
