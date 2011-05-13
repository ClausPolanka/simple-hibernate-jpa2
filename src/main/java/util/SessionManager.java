package util;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SessionManager {
    public static EntityManager getEntityManager() {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("book");
        return managerFactory.createEntityManager();
    }
}
