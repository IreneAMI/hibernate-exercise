import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProfesoriService {
    private static ProfesoriService instance;

    private ProfesoriService() {
    }

    public static ProfesoriService getInstance() {
        if (instance == null) {
            instance = new ProfesoriService();
        }
        return instance;
    }

    public void createProfesori(Profesori profesori) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();
            session.save(profesori);
            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public Profesori getProfesori(Integer id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Profesori profesori = session.find(Profesori.class, id);
            return profesori;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void updateProfesori(Profesori profesori) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            session.save(profesori);

            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public void deleteProfesori(Profesori profesori) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            session.save(profesori);

            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
}
