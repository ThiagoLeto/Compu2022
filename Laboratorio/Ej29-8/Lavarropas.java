import java.util.ArrayList;

public class Lavarropas extends Electrodomestico{
    private float carga;

    public Lavarropas(float precio, String color, char consumo, float peso, float carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
    }

    public Lavarropas(float carga) {
        this.carga = carga;
    }

    public Lavarropas(float precio, float peso, float carga) {
        super(precio, peso);
        this.carga = carga;
    }

    @Override
    public float precioFinal(ArrayList<Character> Consumos_Posibles, ArrayList<Float> Precio_Consumo){
        float precio = 0;
        if (this.carga >= 30){ precio+=2300; }
        this.comprobarConsumoEnergetico(this.getConsumo(), Consumos_Posibles);
        for (int i = 0; i < Consumos_Posibles.size(); i++) {
            if(this.getConsumo() == Consumos_Posibles.get(i) ){precio += Precio_Consumo.get(i); }
        }
        if (this.getPeso() > 80){precio+=10000;} else if (this.getPeso()>= 50 && this.getPeso() <=79) { precio+=8000;} else if (this.getPeso()>= 20 && this.getPeso()<=49) { precio+=5000; } else if (this.getPeso() > 0 && this.getPeso() <= 19) { precio+=1000 ;}
        return precio;
    }
}
