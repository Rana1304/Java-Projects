import java.time.LocalDateTime;

public class Income {
		
	private int income_id;
	private long amount;
	private String source,description;
	private LocalDateTime date;
	
	public Income(int income_id,long amount,String source,String description) {
		this.income_id = income_id;
		this.amount = amount;
		this.source = source;
		this.description = description;
		this.date = LocalDateTime.now();
	}

	@Override
	public String toString() {
		return "Income [income_id=" + income_id + ", amount=" + amount + ", source=" + source + ", description="
				+ description + ", date=" + date + "]";
	}
	
}
