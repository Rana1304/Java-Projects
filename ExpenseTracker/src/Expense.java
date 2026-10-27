import java.time.LocalDateTime;

public class Expense {

	int expense_id;
	private long amount;
	private String cateogry,description;
	private LocalDateTime date;
	
	public Expense(int expense_id,long amount,String cateogry,String description) {
		this.expense_id = expense_id;
		this.amount = amount;
		this.cateogry = cateogry;
		this.description = description;
		this.date = LocalDateTime.now();
	}
	
	
	@Override
	public String toString() {
		return "Expense [expense_id=" + expense_id + ", amount=" + amount + ", cateogry=" + cateogry + ", description="
				+ description + ", date=" + date + "]";
	}
	
}
