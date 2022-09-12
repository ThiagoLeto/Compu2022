import java.util.Date;

public abstract class Profesor extends Asalariados{
    private int horas;

    public Profesor(String nombre, String apellido, int edad, int dni, float salario, String banco, Date fecha_cobro, Date fecha_alta, int horas) {
        super(nombre, apellido, edad, dni, salario, banco, fecha_cobro, fecha_alta);
        this.horas = horas;
    }
}
