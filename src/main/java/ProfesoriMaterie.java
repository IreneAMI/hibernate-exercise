import javax.persistence.*;
import java.util.List;

@Entity
public class ProfesoriMaterie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idPredare;

    @ManyToOne
    @JoinColumn(name = "idProfesor")
    Profesori profesori;

    @ManyToOne
    @JoinColumn(name = "idMaterie")
    Materii materii;

    @OneToMany(mappedBy = "profesoriMaterie")
    List<Note> note;


    @Override
    public String toString() {
        return "Profesori{" +
              //  "idPredare=" + idPredare +
              //  ", idProfesor=" + profesori.idProfesor + '\'' +
            //    ", idMaterie=" + materie.idMaterie +
                '}';
    }
}

