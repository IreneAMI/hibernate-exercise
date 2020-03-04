import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class NoteServicii {
    public NoteServicii instance;

    public NoteServicii() {
    }

    public NoteServicii getInstance() {
        if (instance == null) {
            instance = new NoteServicii();
        }
        return instance;
    }

    public void createNote(Note note) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            session.save(note);

            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    // afiseze nota cea mai mare dintr-o clasa.
    public List<Elevi> getAllElevi(Integer idClasa) {
        //select e.idElev, max(n.valoareNota) as maxNota from clasa join elevi e on clasa.idClasa = e.idClasa join note n on e.idElev = n.idElev
        //where clasa.idClasa = 1 group by e.idElev order by maxNota desc limit 1;
        String hql = "select e.numeElev, max(n.valoareNota) as maxNota " +
                "from Clasa c join c.elevi e join e.note n where c.idClasa = :idClasa " +
                "group by e order by maxNota desc";
        ;
        Query query = HibernateUtil.getSessionFactory().openSession().createQuery(hql);
        query.setParameter("idClasa", idClasa);
        query.setMaxResults(1);
        List<Elevi> elev = query.list();
        System.out.println(elev);
        return elev;
    }


    public Note getNote(Integer id) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Note note = session.find(Note.class, id);
            return note;
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public void updateNote(Note note) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            session.save(note);

            transaction.commit();
            session.close();
        } catch (Exception ex) {
            if (transaction != null) {
                transaction.rollback();
            }
            ex.printStackTrace();
        }
    }

    public void deleteNote(Note note) {
        Transaction transaction = null;
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            transaction = session.beginTransaction();

            session.save(note);

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
