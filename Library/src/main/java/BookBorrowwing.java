import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "BookBorrowings")
public class BookBorrowwing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrowing_id", columnDefinition = "serial")
    private int id; // borrowing_id

    @Column(name = "borrower_name", length = 100, nullable = false)
    private String borrowerName; // borrower_name

    @Column(name = "borrowing_date" , nullable = false)
    private LocalDate borrowingDate; // borrowing_date

    @Column(name = "return_date")
    private LocalDate returnDate; // return_date

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookborrowing_book_id" , referencedColumnName = "book_id")
    private Book book;

    public BookBorrowwing() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public LocalDate getBorrowingDate() {
        return borrowingDate;
    }

    public void setBorrowingDate(LocalDate borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDate returnDate) {
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}