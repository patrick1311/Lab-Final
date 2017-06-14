import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner in = new Scanner(new File("src/data.txt"));
		
		HashDictionary hash = new HashDictionary(13);
		
		while(in.hasNextInt()) {
			int num = in.nextInt();
			System.out.println("Insert key: " + num);
			hash.insert(num, 0);
			hash.print();
			System.out.println();
		}
		
		System.out.println("Testing clear() method: ");
		hash.clear();
		hash.print();
		
		in.close();
	}
}
