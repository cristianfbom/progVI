package main.java.com.backend.prog.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JPAUtil {

    public static final EntityManagerFactory emf 
        = Persistence.
            createEntityManagerFactory("prog-back-end");
    
    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
}














