import java.util.ArrayList;

public class Heladera extends Electrodomestico{
    private boolean freezer;
    private float centimetros_cubicos_heladera; // es el interior de la heladera, no cuenta el freezer para eso hay un metodo

    public Heladera(float precio, String color, char consumo, float peso, boolean freezer, float centimetros_cubicos_heladera) {
        super(precio, color, consumo, peso);
        this.freezer = freezer;
        this.centimetros_cubicos_heladera = centimetros_cubicos_heladera;
    }

    public Heladera(boolean freezer, float centimetros_cubicos_heladera) {
        this.freezer = freezer;
        this.centimetros_cubicos_heladera = centimetros_cubicos_heladera;
    }

    public Heladera(float precio, float peso, boolean freezer, float centimetros_cubicos_heladera) {
        super(precio, peso);
        this.freezer = freezer;
        this.centimetros_cubicos_heladera = centimetros_cubicos_heladera;

    }

    public float interior_freezer(){
        if(this.freezer){return centimetros_cubicos_heladera/3 ;}
    return 0;}
    public float interior_freezer(float x){
        if(this.freezer){return centimetros_cubicos_heladera/x ;}
        return 0;}
    public float precioFinal(ArrayList<Character> Consumos_Posibles, ArrayList<Float> Precio_Consumo,float x){
        float precio = 0;
        this.comprobarConsumoEnergetico(this.getConsumo(), Consumos_Posibles);
        for (int i = 0; i < Consumos_Posibles.size(); i++) {
            if(this.getConsumo() == Consumos_Posibles.get(i) ){precio += Precio_Consumo.get(i); }
        }
        if (this.getPeso() > 80){precio+=10000;} else if (this.getPeso()>= 50 && this.getPeso() <=79) { precio+=8000;} else if (this.getPeso()>= 20 && this.getPeso()<=49) { precio+=5000; } else if (this.getPeso() > 0 && this.getPeso() <= 19) { precio+=1000 ;}
        precio+=precio*this.interior_freezer(x)/10;
        return precio;
    }
    @Override
    public float precioFinal(ArrayList<Character> Consumos_Posibles, ArrayList<Float> Precio_Consumo){
        float precio = 0;
        this.comprobarConsumoEnergetico(this.getConsumo(), Consumos_Posibles);
        for (int i = 0; i < Consumos_Posibles.size(); i++) {
            if(this.getConsumo() == Consumos_Posibles.get(i) ){precio += Precio_Consumo.get(i); }
        }
        if (this.getPeso() > 80){precio+=10000;} else if (this.getPeso()>= 50 && this.getPeso() <=79) { precio+=8000;} else if (this.getPeso()>= 20 && this.getPeso()<=49) { precio+=5000; } else if (this.getPeso() > 0 && this.getPeso() <= 19) { precio+=1000 ;}
        precio+=precio*this.interior_freezer()/10;
        return precio;
    }

}
