import java.util.ArrayList;

public class Tv extends Electrodomestico{
    private Float Pulgadas;
    private boolean smart;

    public Tv(float precio, String color, char consumo, float peso, Float pulgadas, boolean smart) {
        super(precio, color, consumo, peso);
        Pulgadas = pulgadas;
        this.smart = smart;
    }

    public Tv(Float pulgadas, boolean smart) {
        Pulgadas = pulgadas;
        this.smart = smart;
    }

    public Tv(float precio, float peso, Float pulgadas, boolean smart) {
        super(precio, peso);
        Pulgadas = pulgadas;
        this.smart = smart;
    }

    @Override
    public float precioFinal(ArrayList<Character> Consumos_Posibles, ArrayList<Float> Precio_Consumo){
        float precio = 0;
        if (this.smart){ precio+=12340; }
        this.comprobarConsumoEnergetico(this.getConsumo(), Consumos_Posibles);
        for (int i = 0; i < Consumos_Posibles.size(); i++) {
            if(this.getConsumo() == Consumos_Posibles.get(i) ){precio += Precio_Consumo.get(i); }
        }
        if (this.getPeso() > 80){precio+=10000;} else if (this.getPeso()>= 50 && this.getPeso() <=79) { precio+=8000;} else if (this.getPeso()>= 20 && this.getPeso()<=49) { precio+=5000; } else if (this.getPeso() > 0 && this.getPeso() <= 19) { precio+=1000 ;}
        if(this.Pulgadas >= 55){ precio+=precio*25/100; }
        return precio;
    }

}
