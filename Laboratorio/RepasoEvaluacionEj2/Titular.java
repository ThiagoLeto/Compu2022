import java.util.Date;

public class Titular extends Profesor{
    private String materia;

    public Titular(String nombre, String apellido, int edad, int dni, float salario, String banco, Date fecha_cobro, Date fecha_alta, int horas, String materia) {
        super(nombre, apellido, edad, dni, salario, banco, fecha_cobro, fecha_alta, horas);
        this.materia = materia;
    }

}
