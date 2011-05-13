package dao;

import domain.Book;
import util.SessionManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import java.util.List;

public class BookDAO {

    private EntityManager em;

    public BookDAO(EntityManager em) {
        this.em = em;
    }

    public void saveBook(Book book) {
        em.getTransaction().begin();
        em.persist(book);
        em.getTransaction().commit();
    }

    public List<Book> getAllBooks() {
        em.getTransaction().begin();
        Query query = em.createQuery("from Book");
        List<Book> list = query.getResultList();
        em.getTransaction().commit();
        return list;
    }

}