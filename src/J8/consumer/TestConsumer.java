package J8.consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer {

	public static void main(String[] args) {

		Consumer<String> cons1 = System.out::print;
		Consumer<String> cons = new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		};
		
		List<String> lst = new ArrayList<>();
		lst.add("a");
		lst.add("b");
		lst.add("c");
		
		lst.forEach(cons1);
		System.out.println();
		lst.forEach(cons);
		
	}
	
	

}
