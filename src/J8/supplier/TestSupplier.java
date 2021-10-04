package J8.supplier;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class TestSupplier {

	public static void main(String[] args) {
		
		
		//Example 1
		Supplier<LocalDateTime> toDay = ()->LocalDateTime.now();
		
		System.out.println(toDay.get());
		
		//Example 2
		 Developer obj = factory(Developer::new);
	     System.out.println(obj.toString());

	     Developer obj2 = factory(() -> new Developer("Amine"));
	     System.out.println(obj2.toString());
		
	}
	
	public static Developer factory(Supplier<? extends Developer> s) {
		Developer developer = s.get();
        if (developer.getName() == null || "".equals(developer.getName())) {
            developer.setName("default");
        }
        developer.setSalary(BigDecimal.ONE);
        developer.setStart(LocalDate.now());
		return developer;
	}
	
}
