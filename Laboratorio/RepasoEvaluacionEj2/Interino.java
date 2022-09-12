import java.util.ArrayList;
import java.util.Date;

public class Interino extends Profesor{
    ArrayList<String> materias;

    public Interino(String nombre, String apellido, int edad, int dni, float salario, String banco, Date fecha_cobro, Date fecha_alta, int horas, ArrayList<String> materias) {
        super(nombre, apellido, edad, dni, salario, banco, fecha_cobro, fecha_alta, horas);
        this.materias = materias;
    }
}
