import java.util.Date;

public class Sensor_Temperatura extends Sensor{
    float temperatura;

    public Sensor_Temperatura(boolean estado, float umbral, Date fecha, float temperatura) {
        super(estado, umbral, fecha);
        this.temperatura = temperatura;
    }

    public float getTemperatura() {
        return temperatura;
    }
}
