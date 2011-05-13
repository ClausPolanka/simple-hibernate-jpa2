package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "BOOK")
public class Book {
    @Column(name = "isbn")
    @Id
    String isbn;

    @Column(name = "book_Name")
    String bookName;

    @Column(name = "publisher_code")
    String publisherCode;

    @Column(name = "publish_date")
    Date publishDate;

    @Column(name = "price")
    Long price;

    public Book(String isbn, String bookName, String publisherCode, Date publishDate, Long price) {
        this.isbn = isbn;
        this.bookName = bookName;
        this.publisherCode = publisherCode;
        this.publishDate = publishDate;
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisherCode() {
        return publisherCode;
    }

    public void setPublisherCode(String publisherCode) {
        this.publisherCode = publisherCode;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
