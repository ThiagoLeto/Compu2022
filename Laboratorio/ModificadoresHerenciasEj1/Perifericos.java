public class Perifericos extends Componentes{
    private String tipo;
    private boolean salida;

    public Perifericos(String nombre, int id, String fabricante, Float precio, String tipo, boolean salida) {
        super(nombre, id, fabricante, precio);
        this.tipo = tipo;
        this.salida = salida;
    }

    public String getTipo() {return tipo;}
    public void setTipo(String tipo) {this.tipo = tipo;}

    public boolean isSalida() {return salida;}
    public void setSalida(boolean salida) {this.salida = salida;}

}