import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
	public static void main(String args[]) throws FileNotFoundException {
		Scanner in = new Scanner(new File("src/dataFile.txt"));
		
		LList<Integer> list = new LList<Integer>();
		//initialize the list 0 - 7
		for(int i = 0; i <= 7; i++)
			list.append(i);
		
		System.out.print("Initial list: ");
		list.print();
		
		while(in.hasNextInt()) {
			list.MTF(in.nextInt());
		}
		
		System.out.print("Final list using MTF: ");
		list.print();
		System.out.println("Comparisons: " + list.getComp());
		
		in.close();
	}
}
