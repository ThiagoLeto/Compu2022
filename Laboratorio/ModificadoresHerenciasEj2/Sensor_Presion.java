import java.util.Date;

public class Sensor_Presion extends Sensor{
    float kgf;

    public Sensor_Presion(boolean estado, float umbral, Date fecha) {
        super(estado, umbral, fecha);
        this.kgf = 0;
    }

    public float getKgf() {
        return kgf;
    }

    public void setKgf(float kgf) {
        this.kgf = kgf;
    }
}
