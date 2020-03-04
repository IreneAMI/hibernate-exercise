import org.hibernate.Session;
import org.hibernate.Transaction;

public class MateriiService {
    private MateriiService instance;

    private MateriiService() {
    }

    public MateriiService getInstance() {
        if (instance == null) {
            instance = new MateriiService();
        }
        return instance;
    }

    public void createMaterii(Materii materii) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            session.save(materii);

            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public Materii getMaterii(Integer id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Materii materii = session.find(Materii.class, id);
            return materii;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void updateMaterii(Materii materii) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            session.save(materii);

            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public void deleteMaterii(Materii materii) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            session.save(materii);

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
