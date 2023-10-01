package AssignmentTwo;
import java.util.Scanner;
public class Book {
	 String Author;
	 String Title;
	 int PublicationYear;
	 
	 Scanner sc= new Scanner(System.in);
	 
		void GetDetails(String Author, String Title, int PublicationYear)
		{	
			System.out.println("Enter the Author: ");
			this.Author = sc.nextLine();
			System.out.println("Enter the Title: ");
			this.Title = sc.nextLine();
			System.out.println("Enter the PublicationYear: ");
			this.PublicationYear = sc.nextInt();
			}
		
		void ShowDetails()
		{
			System.out.println("Author: "+Author+ ", Title: "+Title+ ", PublicationYear: "+PublicationYear);
		}
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Book b = new Book();
		b.GetDetails(b.Author, b.Title, b.PublicationYear);
		b.ShowDetails();
	}
}