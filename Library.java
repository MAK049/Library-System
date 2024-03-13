package Labs.Assignment_1;

import java.util.*;

public class Library {
   //Object Creation
    Scanner input = new Scanner(System.in);
    User user = new User();
    //Dynamic Arrays to store users and books
     ArrayList<User> users = new ArrayList<User>();  
     ArrayList<Book> books = new ArrayList<Book>();
    
    //Methods to add users
public void addUser(String name,String c_info,String user_id)
{
 user.name = name;
 user.c_info = c_info;
 user.user_id = user_id;
}
public  void addUser(User user)
{
  users.add(user);
}

//Methods to add books
 public void addBooks(String title,String book_id,String author,String genre)
{
    Book book = new Book();
    book.title = title;
    book.book_id = book_id;
    book.author = author;
    book.genre = genre;
    
    books.add(book);
}


//Methods for searching books by Title and Book ID.

String searchBooks(String id)
{
    for(Book book:books)
    {
        if(book.id == id )
        {
            if(book.availability_status == true)
            {
                System.out.println("Your Book is available for borrowing");
                break;
            }
            else{
                System.out.println("Your book is already borrowed.");
                break;
            }
        }
        else{
            continue;
        }
    System.out.println("This book does not exist in our Library. ");
    }
}
String displayBooks()
{
    System.out.println("Enter book id: ");
    String id = input.nextLine();
    for(Book book:books)
    {
        if(book.id == id)
        {
            System.out.println("\tTitle\tAuthor\tGenre\tBook ID\tAvailability Status");
            System.out.printf("\t%s\t%s\t%s\t%s\t%b\t",book.title,book.author,book.genre,book.book_id,book.availability_status);
        }
    }
}


}



