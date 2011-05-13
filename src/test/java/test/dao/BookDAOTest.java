package test.dao;

import dao.BookDAO;
import domain.Book;
import org.junit.Before;
import org.junit.Test;
import util.SessionManager;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BookDAOTest {

    private static final String ISBN_1 = "PBN123";
    private static final String ISBN_2 = "PBN456";
    private static final String TITLE_1 = "Spring Recipes";
    private static final String TITLE_2 = "Hibernate Recipes";
    private static final String PUBLISHER_CODE_1 = "001";
    private static final String PUBLISHER_CODE_2 = "002";
    private static final Date PUBLISHER_DATE_1 = new GregorianCalendar(2008, GregorianCalendar.FEBRUARY, 2).getTime();
    private static final Date PUBLISHER_DATE_2 = new GregorianCalendar(2008, GregorianCalendar.NOVEMBER, 2).getTime();
    private static final Long PRICE_1 = new Long(30);
    private static final Long PRICE_2 = new Long(40);
    private BookDAO bookDAO;

    @Before
    public void createSampleBooks() {
        bookDAO = new BookDAO(SessionManager.getEntityManager());
        Book book1 = new Book(ISBN_1, TITLE_1, PUBLISHER_CODE_1, PUBLISHER_DATE_1, PRICE_1);
        bookDAO.saveBook(book1);
        Book book2 = new Book(ISBN_2, TITLE_2, PUBLISHER_CODE_2, PUBLISHER_DATE_2, PRICE_2);
        bookDAO.saveBook(book2);
    }

    @Test
    public void getAllBooksFromDatabase() {
        List<Book> list = bookDAO.getAllBooks();
        assertThat("Number of books", list.size(), is(equalTo(2)));
    }
}
