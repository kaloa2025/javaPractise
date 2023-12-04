package BuilderPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
	public static void main(String[] args) {

		List<Integer> number = new ArrayList<>();

		number.add(23);
		number.add(3);
		number.add(2);
		number.add(33);

		for (int x : number) {
			System.out.println(x);
		}
		System.out.println("--------------------");
		number.forEach(x -> System.out.println(x));
		System.out.println("--------------------");
		Consumer<Integer> c = new Consumer<Integer>() {

			@Override
			public void accept(Integer x) {
				System.out.println(x);

			}

		};

		number.forEach(c);
	}
}
