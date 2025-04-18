package LibraryManagement;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Member member1 = new Member(1, "Alice");

        member1.showBorrowedBook();
        member1.borrowBook(book1);
        member1.showBorrowedBook();
        member1.returnBook();
        member1.showBorrowedBook();
    }
}
