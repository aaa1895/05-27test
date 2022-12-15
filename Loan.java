public class Loan {
    private static String catalogNumber;
    private boolean isReturn = false;
    private boolean isOverdue = false;
    private Book book;
    private Borrower borrower;

    public Loan(Book book , Borrower borrower)
    {
        this.book = book;
        this.borrower = borrower;
    }

    public String getTitle()
    {
        return this.book.getTitle();
    }

    public boolean checkSelfInfo()
    {
        return this.isOverdue;
    }

    public Book getBook()
    {
        return this.book;
    }

    public Borrower getBorrower()
    {
        return this.borrower;
    }
}
