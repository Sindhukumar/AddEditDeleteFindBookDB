import java.util.Scanner;

public class BookDb {

	public static String title = "", author = "", description = "", SKU = "";

	public static double price;

	public static void main(String[] args) {
		while (true) {
			System.out.println(
					"(1) Add a new book, (2) Edit/Update a book (3) Delete a book (4) Find a book. any other key to exit");
			switch (getInput().toLowerCase()) {
			case "1":
				insertBook();
				System.out.println("---" + author.isEmpty());
				break;
			case "2":
				updateBook();
				break;
			case "3":
				break;
			case "4":
				break;
			default:
				return;
			}

		}

	}

	public static void insertBook() {
		System.out.print("Enter SKU: ");
		SKU = getInput();
		System.out.println("Enter Author: ");
		author = getInput();
		System.out.println("Enter Title: ");
		title = getInput();
		System.out.println("Enter Description: ");
		description = getInput();
		System.out.println("Enter the price: ");
		price = new Scanner(System.in).nextDouble();
		QueryUtil.run("insert into book(sku,author,description,price,title) values('" + SKU + "','" + author + "','"
				+ description + "','" + price + "','" + title + "')");

	}

	public static void updateBook() {
		System.out.print("Enter SKU of the book to be updated: ");
		SKU = getInput();
		System.out.println("Enter Author(leave black if you dont want to update this field): ");
		author = getInput();
		System.out.println("Enter Title(leave black if you dont want to update this field): ");
		title = getInput();
		System.out.println("Enter Description(leave black if you dont want to update this field): ");
		description = getInput();
		System.out.println("Enter the price(leave black if you dont want to update this field): ");
		price = new Scanner(System.in).nextDouble();
		QueryUtil.run("update book set author = case when" + author.isEmpty() + "=" + "true then author else " + author
				+ "End,title = case when" + title.isEmpty() + "=" + "true then author else " + title
				+ "End,description = case when" + description.isEmpty() + "=" + "true then author else " + description
				+ "End,price = case when" + price + "=" + "null then price else " + price + "End;");

	}

	public static void deleteBook() {
		System.out.print("Enter SKU of the book to be deleted: ");
		SKU = getInput();
	}

	public static String getInput() {
		String input = "";
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		// sc.close();
		return input;

	}

}
