public abstract class Componentes {
    private String nombre;
    private int id;
    private String fabricante;
    private Float precio;

    public Componentes(String nombre, int id, String fabricante, Float precio) {
        this.nombre = nombre;
        this.id = id;
        this.fabricante = fabricante;
        this.precio = precio;
    }

    public Float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
}
