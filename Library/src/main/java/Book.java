import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id" , columnDefinition = "serial")
    private int id; //book_id

    @Column(name = "book_name" , length = 100 , nullable = false)
    private String name; //book_name

    @Column(name = "publication_year")
    private int publicationYear; //publication_year

    @Column(name = "book_stock" , nullable = false)
    private int stock; //book_stock

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name = "book_author_id" , referencedColumnName = "author_id")
    private Author author;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "BookCategories" ,
            joinColumns = {
                    @JoinColumn(name = "BookCategories_book_id")
            },
            inverseJoinColumns = {@JoinColumn(name = "BookCategories_category_id")})
    private List<Category> categoryList;

    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name = "book_publisher_id" , referencedColumnName = "publisher_id")
    private Publisher publisher;

    @OneToMany(mappedBy = "book" , cascade = CascadeType.REMOVE)
    private List<BookBorrowwing> bookBorrowwingList;

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public List<BookBorrowwing> getBookBorrowwingList() {
        return bookBorrowwingList;
    }

    public void setBookBorrowwingList(List<BookBorrowwing> bookBorrowwingList) {
        this.bookBorrowwingList = bookBorrowwingList;
    }
}