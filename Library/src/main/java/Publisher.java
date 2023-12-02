import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Publishers")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "publisher_id", columnDefinition = "serial")
    private int id; // publisher_id

    @Column(name = "publisher_name", length = 100, nullable = false)
    private String name; // publisher_name

    @Column(name = "establishment_year")
    private int establishmentYear; // establishment_year

    @Column(name = "address", length = 255)
    private String address; // address

    @OneToMany(mappedBy = "publisher" ,  cascade = CascadeType.REMOVE)
    private List<Book> bookList;

    public Publisher() {
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

    public int getEstablishmentYear() {
        return establishmentYear;
    }

    public void setEstablishmentYear(int establishmentYear) {
        this.establishmentYear = establishmentYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}