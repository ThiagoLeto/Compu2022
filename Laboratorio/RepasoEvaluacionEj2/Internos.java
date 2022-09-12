import java.util.ArrayList;

public class Internos extends  Voluntarios{
    private ArrayList<AccionSolidaria> acciones;
    private float puntuacion;

    public Internos(String nombre, String apellido, int edad, int dni, ArrayList<AccionSolidaria> acciones) {
        super(nombre, apellido, edad, dni);
        this.acciones = acciones;
    }

    private void hacer_puntuacion(){/* formula para sacar los puntos*/}


}
