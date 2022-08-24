import java.util.Date;

public class Sensor_humo extends Sensor {
    private  float humo;

    public Sensor_humo(boolean estado, float umbral, Date fecha) {
        super(estado, umbral, fecha);
        this.humo = 0;
    }

    public float getHumo() {
        return humo;
    }

    public void setHumo(float humo) {
        this.humo = humo;
    }
}
