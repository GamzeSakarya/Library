import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", columnDefinition = "serial")
    private int id; // category_id

    @Column(name = "category_name", length = 100, nullable = false)
    private String name; // category_name

    @Column(name = "description", length = 255)
    private String description; // description

    @ManyToMany(mappedBy = "categoryList" , cascade = CascadeType.REMOVE)
    private List<Book> bookList;

    public Category() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}