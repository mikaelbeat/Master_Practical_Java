package streams_Practical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) throws IOException {
		
		IntStream
			.range(1, 10)
			.forEach((x) -> System.out.print(x));
		System.out.println("\n");
		
		
		IntStream
			.range(1, 10)
			.skip(5) // Skips first 5 elements
			.forEach((x) -> System.out.print(x));
		System.out.println("\n");
		
		
		int val = IntStream
					.range(1, 5)
					.sum();
		System.out.println(val + "\n");
		
		
		Stream.of("Hello", "Bottle", "Africa")
			.sorted()
			.findFirst()
			.ifPresent((x) -> System.out.println(x + "\n"));
		
		
		String[] items = {"Car", "Computer", "Toothpaste", "Box", "Pencil", "Tent", "Door", "Toy"};
		Stream.of(items)
			.filter((x) -> x.startsWith("T"))
			.sorted()
			.forEach(x -> System.out.print(x + ", "));
		System.out.println("\n");
		
		
		Arrays.stream(new int[] {2,4,6,8,10})
			.map((x) -> x * x)
			.average()
			.ifPresent(n -> System.out.print(n));
		System.out.println("\n");
		
		
		List<String> listOfItems = Arrays.asList("Car", "Computer", "Toothpaste", "Box", "Pencil", "Tent", "Door", "Toy");
		listOfItems.stream()
			.map(x -> x.toLowerCase())
			.filter(x -> x.startsWith("c"))
			.sorted()
			.forEach(x -> System.out.print(x + ", "));
		System.out.println("\n");
		
		
		Stream<String> lines = Files.lines(Paths.get("files/wordfile.txt"));
		lines.sorted()
			.filter(l -> l.length() > 6)
			.forEach(x -> System.out.print(x + ", "));
		lines.close();
		System.out.println("\n");
		
		
		List<String> words = Files.lines(Paths.get("files/wordfile.txt"))
			.filter(x -> x.contains("th"))
			.collect(Collectors.toList());
		words.forEach(x -> System.out.print(x + ", "));
		System.out.println("\n");
		
		
		Stream<String> rows = Files.lines(Paths.get("files/stockData.txt"));
		int rowCount =(int) rows
				.map(x -> x.split(","))
				.filter(x -> x.length > 3)
				.count();
		System.out.println(rowCount + " good rows.\n");
		rows.close();
		
		
		Stream<String> rows2 = Files.lines(Paths.get("files/stockData.txt"));
		rows2.map(x -> x.split(","))
				.filter(x -> x.length > 3)
				.filter(x -> Integer.parseInt(x[1].trim()) > 15)
				.forEach(x -> System.out.println(x[0].trim() + " " + x[2].trim() + " " + x[3].trim()));
		rows2.close();
		
	}
	
}