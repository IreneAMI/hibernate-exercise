import javax.persistence.*;
import java.util.List;

@Entity
public class Clasa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idClasa;

    @Column
    String numeClasa;

    @OneToMany(mappedBy = "clasa")
    private List<Elevi> eleviList;

    @Override
    public String toString() {
        return "Clasa{" +
                "idClasa=" + idClasa +
                ", numeClasa='" + numeClasa + '\'' +
                '}';
    }

}


