import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema_Alarma {
    private ArrayList<dispositivos> lista_dispositivos;
    private dispositivo_preferido dispostivio_actual;

    public Sistema_Alarma(ArrayList<dispositivos> lista_dispositivos) {
        this.lista_dispositivos = lista_dispositivos;
        this.dispostivio_actual = null;
    }
    public Sistema_Alarma() {
        this.lista_dispositivos = new ArrayList<>();
        this.dispostivio_actual = null;
    }

    public ArrayList<dispositivos> getLista_dispositivos() {
        return lista_dispositivos;
    }

    public void setLista_dispositivos(ArrayList<dispositivos> lista_dispositivos) {
        this.lista_dispositivos = lista_dispositivos;
    }

    public dispositivo_preferido getDispostivio_actual() {
        return dispostivio_actual;
    }

    public void setDispostivio_actual(dispositivo_preferido dispostivio_actual) {
        this.dispostivio_actual = dispostivio_actual;
    }

    public void ingresar_dispositivo(dispositivos ingreso){ this.lista_dispositivos.add(ingreso); }
    public void asignar_dispositivo_preferido( int index ){ this.dispostivio_actual.setNombre( this.lista_dispositivos.get(index).getNombre());this.dispostivio_actual.setIndex(index); }
}

