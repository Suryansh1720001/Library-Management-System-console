import java.util.Scanner;

import javax.sql.rowset.spi.SyncResolver;

// import javax.swing.plaf.basic.BasicLookAndFeel;
// import Libaray;
// import Library.Online_Books;

class Library {
    String[] books;
    int no_of_books;
    int total_space = 100;

    Library() {

        this.books = new String[total_space];
        books[0] = "maths";
        books[1] = "java";
        books[2] = "python";
        books[3] = "COA";
        this.no_of_books = 4;
    }

    void addBooks() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the book name you want to add in Centeral Library: ");
        String addB = sc.nextLine();
        this.books[no_of_books] = addB;
        no_of_books++;
        System.out.println(addB + " has been added");

    }

    void ShowAvailableBooks() {
    
        // for(String book : this.books){
        // if(book == null){
        // break;
        // }
        // System.out.println("==> "+book);
        if(no_of_books==1){
            System.out.println("Sorry No books here");
        }else{
            System.out.println("Available books are: ");

        for (int i = 0; i < no_of_books; i++) {
            if (books[i] == null) {
                continue;
            }
            System.out.println("==> " + books[i]);

        }
    }

        
    }

    void return_book() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the book name you want to return: ");
        String returnB = sc.nextLine();
        int i;
        for (i = 0; i < no_of_books; i++) {
            if (books[i] == null) {
                books[i] = returnB;
                break;
            }
        }

        if (i == no_of_books) {
            System.out.println(
                    "This book is not of Central Library \n\n **** you can add this book if you want to be be and for this book you get money *****");
        }

        // System.out.println(Books[number].append(returnB));

    }

    void issue_book() {

        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book name you wish to issued: ");
        String issue_book = sc.nextLine();
        int i, j;
        System.out.println(no_of_books);

        for (i = 0; i < no_of_books; i++) {
            if (issue_book.equalsIgnoreCase(books[i])) {
                System.out.println("Book is available -- You can take this book");
                flag = true;
                books[i] = null;
                no_of_books--;
                System.out.println(no_of_books);
                break;
            }
        }

        // System.out.println(no_of_books);
        // if(flag== true){
        // for( j=i; j<no_of_books-1; j++){
        // books[j]= books[j+1];

        // }
        // System.out.println("The Book has been issued ! ");
        // no_of_books--;
        // }
        if (flag == false) {
            System.out.println("Sorry ! your book is not present \n * Please refer other books for issue");

        }

    }

}

public class Online_Library_Exercise {

    public static void main(String[] main) {
        Scanner sc = new Scanner(System.in);
        Library centerLibrary = new Library();
        boolean flag = true;
        while (flag) {

            System.out.println("\n\n\n\t\t\t***************Welcome to the Centeral Library*************************");
            System.out.println("\n*******************************************************");
            System.out.println("\t\t\tPress 1 to add the New book in Central Library");
            System.out.println("\t\t\tPress 2 for issue the Book ");
            System.out.println("\t\t\tPress 3 for seeing the Available book");
            System.out.println("\t\t\tPress 4 for return the book");
            System.out.println("\t\t\tPress 5 for exit from the Central Library");
            System.out.println("*******************************************************\n\n\n");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    centerLibrary.addBooks();
                    break;
                case 2:
                    centerLibrary.issue_book();
                    break;
                case 3:
                    centerLibrary.ShowAvailableBooks();
                    break;
                case 4:
                    centerLibrary.return_book();
                    break;
                case 5:
                    flag = false;
                    System.out.println("Good Bye Sir/Mam! Have a nice Day ❤️");
                    break;
                default:
                    System.out.println("You entered the wrong value \n Please try again ::: ");
                    break;
            }

            // centerLibrary.ShowAvailableBooks();
            // centerLibrary.issue_book();
            // centerLibrary.ShowAvailableBooks();
            // centerLibrary.return_book();
            // centerLibrary.ShowAvailableBooks();

        }

    }
}