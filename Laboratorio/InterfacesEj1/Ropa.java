public class Ropa implements ToString,Prestar{

    private Color color;
    private Estado estado;
    private Material material;

    public Ropa(Color color,Estado estado,Material material) {
        this.color = color;
        this.estado = estado;
        this.material = material;
    }

    public Ropa() {
        this.color = Color.AMARILLO;
        this.estado = Estado.NUEVO;
        this.material = Material.ALGODON;
    }

    public void setColor(Color i){ this.color = i; }
    public Color getColor(){ return this.color; }

    public void setEstado(Estado i){ this.estado = i; }
    public Estado getEstado(){ return this.estado; }

    public void setMaterial(Material i){ this.material = i; }
    public Material getMaterial(){ return this.material; }

    @Override
    public String toString() {
        return color.toString() + " " + estado.toString() + " " + material.toString();
    }
    @Override
    public void prestar(){
        if (this.estado != Estado.ROTO) {
            System.out.println("Prestado");
        }else{
            System.out.println("No prestado");
        }
    }

    //@Override
    //agregar elemento
}