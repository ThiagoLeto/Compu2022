import java.util.Date;

;
public abstract class Sensor {
    boolean estado;
    float umbral;
    Date fecha;

    public Sensor(boolean estado, float umbral, Date fecha) {
        this.estado = estado;
        this.umbral = umbral;
        this.fecha = fecha;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public float getUmbral() {
        return umbral;
    }

    public void setUmbral(float umbral) {
        this.umbral = umbral;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
