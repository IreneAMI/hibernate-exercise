import javax.persistence.*;

@Entity
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idNota;

    Integer valoareNota;

    @ManyToOne
    @JoinColumn(name = "idPredare")
    ProfesoriMaterie profesoriMaterie;

    @ManyToOne
    @JoinColumn(name = "idElev")
    private Elevi elevi;


    @Override
    public String toString() {
        return "Note{" +
                "idNota=" + idNota +
                ", valoareNota='" + valoareNota + '\'' +
                ", idElev=" + elevi.idElev +
                ", numeElev=" + elevi.numeElev +
                ", materie : " + profesoriMaterie.materii.numeMaterie +
                ", prof : " + profesoriMaterie.profesori.numeProfesor +
                '}';
    }
}

