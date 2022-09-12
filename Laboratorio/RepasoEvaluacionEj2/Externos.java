public class Externos extends Voluntarios{
    private institucion_externa trabaja_en;

    public Externos(String nombre, String apellido, int edad, int dni, institucion_externa trabaja_en) {
        super(nombre, apellido, edad, dni);
        this.trabaja_en = trabaja_en;
    }
}
