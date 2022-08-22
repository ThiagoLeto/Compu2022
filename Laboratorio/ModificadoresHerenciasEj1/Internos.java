public class Internos extends Componentes {
    private String tipo;

    public Internos(String nombre, int id, String fabricante, Float precio, String tipo) {
        super(nombre, id, fabricante, precio);
        this.tipo = tipo;
    }

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}


}
