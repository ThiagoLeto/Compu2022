import java.util.Date;

public abstract class Asalariados extends Empleados{
    private float salario;
    private String banco;
    private Date fecha_cobro;
    private Date fecha_alta;

    public Asalariados(String nombre, String apellido, int edad, int dni, float salario, String banco, Date fecha_cobro, Date fecha_alta) {
        super(nombre, apellido, edad, dni);
        this.salario = salario;
        this.banco = banco;
        this.fecha_cobro = fecha_cobro;
        this.fecha_alta = fecha_alta;
    }

}
