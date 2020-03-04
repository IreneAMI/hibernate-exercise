import javax.persistence.*;
import java.util.Set;

@Entity
public class Profesori {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idProfesor;

    String numeProfesor;

    @Override
    public String toString() {
        return "Profesori{" +
                "idProfesor=" + idProfesor +
                ", numeProfesor='" + numeProfesor + '\'' +
                '}';
    }

}
