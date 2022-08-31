import java.util.ArrayList;

public abstract class Electrodomestico {
    private float precio;
    private String color;
    private char consumo;
    private float peso;



    /*Crear un constructor por defecto done el color será blanco,
     el consumoF, el precio base $5000 y el peso de 5kg*/

    public Electrodomestico(float precio, String color, char consumo, float peso) {
        this.precio = precio;
        this.color = "blanco";
        this.consumo = consumo;
        this.peso = peso;
        if(color == "negro" || color == "gris" || color == "rojo" || color == "azul"){this.color = color;}
    }
    public Electrodomestico() {
        this.precio = 5000;
        this.color = "blanco";
        this.consumo = 'F';
        this.peso = 5;
    }
    public Electrodomestico(float precio, float peso) {
        this.precio = precio;
        this.peso = peso;
        this.color = "blanco";
        this.consumo = 'F';
    }


    public float getPrecio() {return precio;}
    public void setPrecio(float precio) {this.precio = precio;}

    public String getColor() {return color;}
    public void setColor(String color) {this.color = color;}

    public char getConsumo() {return consumo;}
    public void setConsumo(char consumo) {this.consumo = consumo;}

    public float getPeso() {return peso;}
    public void setPeso(float peso) {this.peso = peso;}

    public char comprobarConsumoEnergetico(char consumo, ArrayList<Character> Consumos_posibles){
        for (char x:Consumos_posibles
             ) {
            if(x == consumo){return consumo;}
        }return 'F';}
     public String comprobarColor(String color){
         if(color == "negro" || color == "gris" || color == "rojo" || color == "azul"){return color;}return "blanco";
     }

     public float precioFinal(ArrayList<Character> Consumos_Posibles,ArrayList<Float> Precio_Consumo){
        float precio = 0;
        this.comprobarConsumoEnergetico(this.consumo, Consumos_Posibles);
        for (int i = 0; i < Consumos_Posibles.size(); i++) {
             if(this.consumo == Consumos_Posibles.get(i) ){precio += Precio_Consumo.get(i); }
         }
        if (this.peso > 80){precio+=10000;} else if (this.peso>= 50 && this.peso <=79) { precio+=8000;} else if (this.peso>= 20 && this.peso<=49) { precio+=5000; } else if (this.peso > 0 && this. peso <= 19) { precio+=1000 ;}
    return precio;
    }
}
