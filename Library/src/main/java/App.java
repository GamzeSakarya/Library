import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) {
        EntityManagerFactory entityManager = Persistence.createEntityManagerFactory("Library");
        EntityManager entityManager1 = entityManager.createEntityManager();
        EntityTransaction transaction = entityManager1.getTransaction();
        transaction.begin();
        Author author = new Author();
        author.setName("Hakan Günday");
        author.setBirthday(LocalDate.parse("1976-05-29"));
        author.setCountry("Rodos");
        entityManager1.persist(author);

        Author author1 = new Author();
        author1.setName("Friedrich Nietzsche");
        author1.setBirthday(LocalDate.parse("1844-10-15"));
        author1.setCountry("Lützen");
        entityManager1.persist(author1);

        Author author2 = new Author();
        author2.setName("George Orwell");
        author2.setBirthday(LocalDate.parse("1903-06-25"));
        author2.setCountry("Motihari");
        entityManager1.persist(author2);

        Publisher publisher = new Publisher();
        publisher.setName("Yayınevi");
        publisher.setEstablishmentYear(1985);
        publisher.setAddress("Ankara");
        entityManager1.persist(publisher);

        Publisher publisher1 = new Publisher();
        publisher1.setName("Kitapevi");
        publisher1.setEstablishmentYear(1995);
        publisher1.setAddress("Adana");
        entityManager1.persist(publisher1);



        Book book = new Book();
        book.setName("Kinyas Ve Kayra");
        book.setPublicationYear(2000);
        book.setStock(200);
        book.setAuthor(author);
        book.setPublisher(publisher);
        entityManager1.persist(book);

        Book book1 = new Book();
        book1.setName("Böyle Buyurdu Zerdüşt");
        book1.setPublicationYear(1885);
        book1.setStock(50);
        book1.setAuthor(author1);
        book1.setPublisher(publisher);
        entityManager1.persist(book1);

        Book book2 = new Book();
        book2.setName("1984");
        book2.setPublicationYear(1949);
        book2.setStock(75);
        book2.setAuthor(author2);
        book2.setPublisher(publisher1);
        entityManager1.persist(book2);

        BookBorrowwing bookBorrowwing = new BookBorrowwing();
        bookBorrowwing.setBorrowerName("Gamze Sakarya");
        bookBorrowwing.setBorrowingDate(LocalDate.parse("2023-10-20"));
        bookBorrowwing.setBook(book);
        entityManager1.persist(bookBorrowwing);

        BookBorrowwing bookBorrowwing1 = new BookBorrowwing();
        bookBorrowwing1.setBorrowerName("Gamze Sakarya");
        bookBorrowwing1.setBorrowingDate(LocalDate.parse("2023-08-12"));
        bookBorrowwing1.setBook(book1);
        entityManager1.persist(bookBorrowwing1);

        BookBorrowwing bookBorrowwing2 = new BookBorrowwing();
        bookBorrowwing2.setBorrowerName("Ebru İzlimek");
        bookBorrowwing2.setBorrowingDate(LocalDate.parse("2023-11-29"));
        bookBorrowwing2.setBook(book1);
        entityManager1.persist(bookBorrowwing2);

        Category category1 = new Category();
        category1.setName("Siyasi");
        category1.setDescription("Siyasi Konular");
        Category category2 = new Category();
        category2.setName("Kültürel");
        category2.setDescription("Kültürel Konular");
        Category category3 = new Category();
        category3.setName("Gizem");
        category3.setDescription("Dedektiflik Konuları");
        Category category4 = new Category();
        category4.setName("Yasak Aşk");
        category4.setDescription("Aşk Konuları");
        Category category5 = new Category();
        category5.setName("Entrika");
        category5.setDescription("Entrika konuları");

        entityManager1.persist(category1);
        entityManager1.persist(category2);
        entityManager1.persist(category3);
        entityManager1.persist(category4);
        entityManager1.persist(category5);

        List<Category> categoryList = new ArrayList<>();
        categoryList.add(category1);
        categoryList.add(category2);
        book.setCategoryList(categoryList);

        List<Category> categoryList1 = new ArrayList<>();
        categoryList1.add(category3);
        book1.setCategoryList(categoryList1);

        List<Category> categoryList2 = new ArrayList<>();
        categoryList2.add(category4);
        categoryList2.add(category5);
        book2.setCategoryList(categoryList2);
        transaction.commit();

    }

}
