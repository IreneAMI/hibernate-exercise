import javax.persistence.*;
import java.util.List;

@Entity
public class Elevi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idElev;

    String numeElev;


    @ManyToOne
    @JoinColumn(name = "idClasa")
    private Clasa clasa;

    @OneToMany(mappedBy = "elevi")
    private List<Note> noteList;

    @Override
    public String toString() {
        return "Elevi{" +
                "idElev=" + idElev +
                ", numeElev='" + numeElev + '\'' +
                ", idClasa=" + clasa.idClasa +
                '}';
    }
}
