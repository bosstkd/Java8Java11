package J8.supplier;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Developer {
	private String name;
	private BigDecimal salary;
	private LocalDate start;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	public LocalDate getStart() {
		return start;
	}
	public void setStart(LocalDate start) {
		this.start = start;
	}
	public Developer(String name) {
		super();
		this.name = name;
	}
	public Developer() {
		super();
	}
	@Override
	public String toString() {
		return "Developer [name=" + name + ", salary=" + salary + ", start=" + start + "]";
	}
	
	
}
