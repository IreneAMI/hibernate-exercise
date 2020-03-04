import org.hibernate.Session;

public class HibernateRunner {

    public static void main(String[] args) {
        ClasaService obiectNou = new ClasaService().getInstance();
        Clasa clasa1 = obiectNou.getClasa(2);
        System.out.println(clasa1);
        NoteServicii obiectNout = new NoteServicii().getInstance();
        Note note = obiectNout.getNote(3);
        //System.out.println(note);

        //System.out.println("nume prof: " + note.profesoriMaterie.profesori.numeProfesor);
        System.out.println("valoare nota : " + note);
      //  System.out.println("materie: " + note.profesoriMaterie.materie.numeMaterie);

      // System.out.println(clasa1);

        HibernateUtil.shutdown();
    }
}
