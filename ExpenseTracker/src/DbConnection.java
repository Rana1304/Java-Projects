import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/expensetracker";
        String user = "root";
        String password ="Your password";

        return DriverManager.getConnection(url, user, password);
    }
}



//Use This SQL ENTRIES


//create DATABASE expenseTracker;
//
//USE expenseTracker;
//
//CREATE TABLE Expense (
//    expense_id INT PRIMARY KEY AUTO_INCREMENT,
//    amount DECIMAL(10, 2) NOT NULL,
//    category VARCHAR(100) NOT NULL,
//    description VARCHAR(255),
//    expense_date DATE NOT NULL
//);
//
//CREATE TABLE Income (
//    income_id INT PRIMARY KEY AUTO_INCREMENT,
//    amount DECIMAL(10, 2) NOT NULL,
//    source VARCHAR(100) NOT NULL,
//    description VARCHAR(255),
//    income_date DATE NOT NULL
//);
//
//
//INSERT INTO Expense (amount, category, description, expense_date) VALUES
//(150.00, 'Food', 'Lunch at restaurant', '2026-10-01'),
//(50.00, 'Transport', 'Bus fare', '2026-10-02'),
//(1200.00, 'Shopping', 'New clothes', '2026-10-03'),
//(300.00, 'Entertainment', 'Movie ticket', '2026-10-04'),
//(800.00, 'Bills', 'Electricity bill', '2026-10-05'),
//(200.00, 'Food', 'Dinner', '2026-10-06'),
//(100.00, 'Transport', 'Auto fare', '2026-10-07'),
//(500.00, 'Education', 'Java course materials', '2026-10-08'),
//(250.00, 'Health', 'Medicines', '2026-10-09'),
//(1500.00, 'Shopping', 'Shoes purchase', '2026-10-10'),
//(600.00, 'Bills', 'Internet bill', '2026-10-11'),
//(80.00, 'Food', 'Breakfast', '2026-10-12'),
//(120.00, 'Transport', 'Petrol', '2026-10-13'),
//(400.00, 'Entertainment', 'Gaming subscription', '2026-10-14'),
//(1000.00, 'Education', 'Programming books', '2026-10-15'),
//(350.00, 'Food', 'Groceries', '2026-10-16'),
//(700.00, 'Health', 'Doctor consultation', '2026-10-17'),
//(200.00, 'Transport', 'Train ticket', '2026-10-18'),
//(900.00, 'Bills', 'Mobile and utility bills', '2026-10-19'),
//(450.00, 'Shopping', 'Accessories', '2026-10-20');
//
//INSERT INTO Income (amount, source, description, income_date) VALUES
//(25000.00, 'Salary', 'Monthly salary', '2026-10-01'),
//(1500.00, 'Freelancing', 'Website development', '2026-10-02'),
//(500.00, 'Investment', 'Dividend received', '2026-10-03'),
//(2000.00, 'Business', 'Online product sales', '2026-10-04'),
//(1000.00, 'Freelancing', 'Java programming task', '2026-10-05'),
//(25000.00, 'Salary', 'Monthly salary advance', '2026-10-06'),
//(800.00, 'Tutoring', 'Java tutoring', '2026-10-07'),
//(300.00, 'Investment', 'Mutual fund dividend', '2026-10-08'),
//(3500.00, 'Freelancing', 'Portfolio website project', '2026-10-09'),
//(1200.00, 'Business', 'Online sales profit', '2026-10-10'),
//(700.00, 'Tutoring', 'Programming class', '2026-10-11'),
//(5000.00, 'Bonus', 'Performance bonus', '2026-10-12'),
//(900.00, 'Freelancing', 'Bug fixing project', '2026-10-13'),
//(600.00, 'Investment', 'Stock dividend', '2026-10-14'),
//(1800.00, 'Business', 'Freelance product sales', '2026-10-15'),
//(1000.00, 'Tutoring', 'Computer science tuition', '2026-10-16'),
//(2500.00, 'Freelancing', 'Java application project', '2026-10-17'),
//(400.00, 'Investment', 'Interest received', '2026-10-18'),
//(1500.00, 'Business', 'Online service revenue', '2026-10-19'),
//(3000.00, 'Bonus', 'Festival bonus', '2026-10-20');
//
//INSERT INTO Income (amount, source, description, income_date) VALUES
//(25000.00, 'Salary', 'Monthly salary', '2026-01-01'),
//(1200.00, 'Freelancing', 'Website fixes', '2026-01-08'),
//(450.00, 'Investment', 'Dividend received', '2026-01-19'),
//(1800.00, 'Tutoring', 'Java tutoring', '2026-01-25'),
//(25000.00, 'Salary', 'Monthly salary', '2026-02-01'),
//(2200.00, 'Freelancing', 'Landing page project', '2026-02-06'),
//(600.00, 'Investment', 'Interest received', '2026-02-14'),
//(900.00, 'Business', 'Online sales', '2026-02-23'),
//(25000.00, 'Salary', 'Monthly salary', '2026-03-01'),
//(3000.00, 'Freelancing', 'Java application task', '2026-03-05'),
//(750.00, 'Tutoring', 'Programming classes', '2026-03-12'),
//(1200.00, 'Business', 'Product sales', '2026-03-27'),
//(25000.00, 'Salary', 'Monthly salary', '2026-04-01'),
//(1700.00, 'Freelancing', 'Bug fixing project', '2026-04-09'),
//(500.00, 'Investment', 'Dividend received', '2026-04-16'),
//(1100.00, 'Tutoring', 'Computer science tuition', '2026-04-24'),
//(25000.00, 'Salary', 'Monthly salary', '2026-05-01'),
//(4200.00, 'Freelancing', 'Portfolio website', '2026-05-07'),
//(800.00, 'Business', 'Online sales', '2026-05-15'),
//(1300.00, 'Tutoring', 'Java tutoring', '2026-05-28'),
//(25000.00, 'Salary', 'Monthly salary', '2026-06-01'),
//(2500.00, 'Freelancing', 'Database project', '2026-06-04'),
//(650.00, 'Investment', 'Interest received', '2026-06-18'),
//(2000.00, 'Business', 'Service revenue', '2026-06-26'),
//(25000.00, 'Salary', 'Monthly salary', '2026-07-01'),
//(3500.00, 'Freelancing', 'Desktop app project', '2026-07-10'),
//(1000.00, 'Tutoring', 'Programming class', '2026-07-17'),
//(900.00, 'Investment', 'Dividend received', '2026-07-29'),
//(25000.00, 'Salary', 'Monthly salary', '2026-08-01'),
//(2800.00, 'Freelancing', 'Java coding task', '2026-08-06'),
//(1400.00, 'Business', 'Online sales', '2026-08-13'),
//(700.00, 'Tutoring', 'Computer lessons', '2026-08-22'),
//(25000.00, 'Salary', 'Monthly salary', '2026-09-01'),
//(5000.00, 'Freelancing', 'Expense tracker project', '2026-09-08'),
//(550.00, 'Investment', 'Interest received', '2026-09-16'),
//(1600.00, 'Business', 'Service revenue', '2026-09-25'),
//(25000.00, 'Salary', 'Monthly salary', '2026-10-01'),
//(3200.00, 'Freelancing', 'Website development', '2026-10-05'),
//(800.00, 'Tutoring', 'Java tutoring', '2026-10-12'),
//(1500.00, 'Business', 'Online product sales', '2026-10-20'),
//(1800.00, 'Freelancing', 'November prep task', '2026-11-03'),
//(500.00, 'Investment', 'Interest received', '2026-11-11'),
//(900.00, 'Tutoring', 'Java class', '2026-11-19'),
//(2500.00, 'Business', 'Online sales', '2026-11-27'),
//(25000.00, 'Salary', 'Monthly salary', '2026-12-01'),
//(2100.00, 'Freelancing', 'Website maintenance', '2026-12-07'),
//(650.00, 'Investment', 'Dividend received', '2026-12-15'),
//(1200.00, 'Tutoring', 'Programming class', '2026-12-22'),
//(4000.00, 'Freelancing', 'Annual project payment', '2026-12-28'),
//(1000.00, 'Business', 'Year-end sales', '2026-12-30');
//
//INSERT INTO Expense (amount, category, description, expense_date) VALUES
//(1800.00, 'Rent', 'Room rent', '2026-01-02'),
//(250.00, 'Food', 'Lunch and snacks', '2026-01-06'),
//(500.00, 'Transport', 'Fuel', '2026-01-14'),
//(700.00, 'Bills', 'Electricity bill', '2026-01-22'),
//(2000.00, 'Rent', 'Room rent', '2026-02-02'),
//(320.00, 'Food', 'Groceries', '2026-02-07'),
//(450.00, 'Transport', 'Bus and auto fare', '2026-02-15'),
//(600.00, 'Bills', 'Internet bill', '2026-02-25'),
//(1800.00, 'Rent', 'Room rent', '2026-03-02'),
//(400.00, 'Food', 'Restaurant meal', '2026-03-08'),
//(350.00, 'Education', 'Programming book', '2026-03-17'),
//(800.00, 'Bills', 'Electricity bill', '2026-03-26'),
//(1800.00, 'Rent', 'Room rent', '2026-04-02'),
//(280.00, 'Food', 'Groceries', '2026-04-05'),
//(600.00, 'Transport', 'Petrol', '2026-04-13'),
//(300.00, 'Health', 'Medicines', '2026-04-21'),
//(1800.00, 'Rent', 'Room rent', '2026-05-02'),
//(550.00, 'Shopping', 'Clothes', '2026-05-09'),
//(400.00, 'Food', 'Dinner', '2026-05-16'),
//(750.00, 'Bills', 'Electricity bill', '2026-05-27'),
//(1800.00, 'Rent', 'Room rent', '2026-06-02'),
//(300.00, 'Food', 'Groceries', '2026-06-06'),
//(900.00, 'Transport', 'Vehicle service', '2026-06-14'),
//(500.00, 'Bills', 'Internet and mobile', '2026-06-24'),
//(1800.00, 'Rent', 'Room rent', '2026-07-02'),
//(450.00, 'Food', 'Restaurant meal', '2026-07-08'),
//(250.00, 'Health', 'Medicines', '2026-07-16'),
//(650.00, 'Bills', 'Electricity bill', '2026-07-25'),
//(1800.00, 'Rent', 'Room rent', '2026-08-02'),
//(600.00, 'Shopping', 'Shoes', '2026-08-07'),
//(350.00, 'Food', 'Groceries', '2026-08-15'),
//(500.00, 'Transport', 'Fuel', '2026-08-26'),
//(1800.00, 'Rent', 'Room rent', '2026-09-02'),
//(800.00, 'Education', 'Online course', '2026-09-06'),
//(420.00, 'Food', 'Dinner', '2026-09-14'),
//(700.00, 'Bills', 'Electricity bill', '2026-09-23'),
//(1800.00, 'Rent', 'Room rent', '2026-10-02'),
//(350.00, 'Food', 'Groceries', '2026-10-06'),
//(600.00, 'Transport', 'Fuel', '2026-10-13'),
//(900.00, 'Shopping', 'Clothing', '2026-10-21'),
//(1800.00, 'Rent', 'Room rent', '2026-11-02'),
//(500.00, 'Food', 'Restaurant meal', '2026-11-07'),
//(400.00, 'Transport', 'Bus fare', '2026-11-15'),
//(650.00, 'Bills', 'Internet bill', '2026-11-24'),
//(1800.00, 'Rent', 'Room rent', '2026-12-02'),
//(700.00, 'Shopping', 'Winter clothes', '2026-12-08'),
//(450.00, 'Food', 'Groceries', '2026-12-16'),
//(800.00, 'Bills', 'Electricity bill', '2026-12-23'),
//(300.00, 'Health', 'Medicines', '2026-12-27'),
//(550.00, 'Entertainment', 'Movie tickets', '2026-12-30');