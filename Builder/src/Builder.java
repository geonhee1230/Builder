import java.util.Scanner;

public class Builder {

	public static void main(String[] args) {

		StringBuilder x = new StringBuilder();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter in \"Java is fun!\"");
		String a = keyboard.nextLine();
		System.out.println("Capacity of the line is " + a.length() + ".\n");
		x.append(a);
		x.append("I love it!");
		System.out.println("Enter in \"Yes,\"");
		String b = keyboard.nextLine();
		x.deleteCharAt(11);
		x.insert(11, ". " + b + " ");
		System.out.println(x.toString());
	}
}
