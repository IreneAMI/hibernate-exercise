import javax.persistence.*;
import java.util.Set;

@Entity
public class Materii {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idMaterie;

    String numeMaterie;

    @Override
    public String toString() {
        return "Materii{" +
                "idMaterii=" + idMaterie +
                ", numeMaterii='" + numeMaterie + '\'' +
                '}';
    }

}
