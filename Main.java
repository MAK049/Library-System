package Labs.Assignment_1;

import java.util.*;


public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Library L = new Library();
        int choice = 0,search;
        //Variables for books
        String genre,title,author,book_id;  
        
        //Variables for user
        String name,c_info,user_id;

        //for controlling while loop
        boolean flag = true;
        System.out.println("------------------- Welcome to Library Management System ----------------------");
        
        //Asking user to choose a command
        while(flag)
        {
            System.out.println("1.Add Book   2.Borrow Book   3.Add User     4.Search Book   5.Exit");
            choice = input.nextInt();
            input.nextLine();
            switch(choice)
            {
                
                case 1:
                System.out.println("Enter the Book Title: ");
                title = input.nextLine();
                System.out.println("Enter the Book ID: ");
                book_id = input.nextLine();
                System.out.println("Enter the name of Book's author: ");
                author = input.nextLine();
                System.out.println("Enter the Book's Genre: ");
             genre = input.nextLine();
             L.addBooks(title, book_id, author, genre);
             L.addBooks(L.book);
             break;
             case 2:
             L.borrowBooks();
             break;
             case 3:
             //Taking user's information
             System.out.println("Enter your username: ");
             name = input.nextLine();
             System.out.println("Enter your User ID: ");
             user_id = input.nextLine();
             System.out.println("Enter your contact information: ");
             c_info = input.nextLine();
             L.addUser(name, c_info, user_id);
             L.addUser(L.user);
             
             L.addUser(name, c_info, user_id);
             break;
             case 4:
             System.out.println("Enter the book id: ");
             book_id = input.nextLine();
             L.searchBooks(book_id);
             case 5:
            System.out.println("Enter Book ID: ");
            book_id = input.nextLine();
            L.searchBooks(book_id);
                
             break;
            }
           
        }
        input.close();
    }

}
