import java.util.ArrayList;

public class Sistema_alarma {
    ArrayList<Sensor_humo> sensores_humo;
    ArrayList<Sensor_Presion> sensores_presion;
    ArrayList<Sensor_Temperatura> sensores_temperatura;

    public Sistema_alarma(ArrayList<Sensor_humo> sensores_humo, ArrayList<Sensor_Presion> sensores_presion, ArrayList<Sensor_Temperatura> sensores_temperatura) {
        this.sensores_humo = sensores_humo;
        this.sensores_presion = sensores_presion;
        this.sensores_temperatura = sensores_temperatura;
    }

    public ArrayList<Sensor_humo> getSensores_humo() {
        return sensores_humo;
    }

    public void setSensores_humo(ArrayList<Sensor_humo> sensores_humo) {
        this.sensores_humo = sensores_humo;
    }

    public ArrayList<Sensor_Presion> getSensores_presion() {
        return sensores_presion;
    }

    public void setSensores_presion(ArrayList<Sensor_Presion> sensores_presion) {
        this.sensores_presion = sensores_presion;
    }

    public ArrayList<Sensor_Temperatura> getSensores_temperatura() {
        return sensores_temperatura;
    }

    public void setSensores_temperatura(ArrayList<Sensor_Temperatura> sensores_temperatura) {
        this.sensores_temperatura = sensores_temperatura;
    }
    public void iniciar() {
        float prom= 0;
        float umbral= 0;
        while (true) {
        for (Sensor_humo x:sensores_humo) { prom += x.getHumo();umbral = x.getUmbral(); }; prom= prom/sensores_humo.size();if(prom >= umbral  ) {
                System.out.println("Llamando a la policia"); return;
            } prom = 0; umbral = 0; for (Sensor_Temperatura x:sensores_temperatura) { prom += x.getTemperatura();umbral = x.getUmbral(); }; prom= prom/sensores_humo.size();if(prom >= umbral  ) {
                System.out.println("Altas temperaturas");
            } prom = 0; umbral = 0; for (Sensor_Presion x:sensores_presion) { prom += x.getKgf();umbral = x.getUmbral(); }; prom= prom/sensores_humo.size();if(prom >= umbral  ) {
                System.out.println("Se detecto presion");
            } }
}
}
