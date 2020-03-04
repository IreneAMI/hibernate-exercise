import org.hibernate.Session;
import org.hibernate.Transaction;

public class ClasaService {
    private ClasaService instance;

    public ClasaService() {
    }

    public ClasaService getInstance() {
        if (instance == null) {
            instance = new ClasaService();
        }
        return instance;
    }

    public void createClasa(Clasa clasa) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            session.save(clasa);

            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public Clasa getClasa(Integer id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Clasa clasa = session.find(Clasa.class, id);
            return clasa;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }
    public void updateClasa(Clasa clasa) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            session.save(clasa);

            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }
    public void deleteClasa(Clasa clasa) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            session.save(clasa);

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



