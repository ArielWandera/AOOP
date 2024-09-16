package LibraryMS;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("HarryPotter","Steve","001",6);
        Book book2 = new Book("GOT","Greg","002",9);
        Member member1 = new Member("Jeff","001");
        Member member2 = new Member("Eddie","002");
        Library library= new Library();
        library.registerMember(member1);
        library.registerMember(member2);
        library.addBook(book1);
        library.addBook(book2);
        library.lendBook("001", "001");
        library.lendBook("002", "002");

        

        System.out.println("Available copies of Harry Potter: " + book1.getCopiesAvailable());
        System.out.println("Available copies of GOT: " + book2.getCopiesAvailable());

        System.out.println("Name:" + member1.name);
        System.out.println("Books borrowed:" + member1.getBorrowedBooks());
        System.out.println("Name:" + member1.name);
        System.out.println("Books borrowed:" + member2.getBorrowedBooks());


        

    }
}