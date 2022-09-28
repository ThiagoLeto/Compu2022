public class Pantalon extends Ropa {

    private int medidaCintura;
    private int medidaCadera;
    private int largo;

    public Pantalon(int medidaCintura,int medidaCadera,int largo) {
        super();
        this.medidaCintura = medidaCintura;
        this.medidaCadera = medidaCadera;
        this.largo = largo;
    }

    public Pantalon() {
        super();
        this.medidaCintura = 0;
        this.medidaCadera = 0;
        this.largo = 0;
    }

    public void setMedidaCintura(int i){ this.medidaCintura = i; }
    public int getMedidaCintura(){ return this.medidaCintura; }

    public void setMedidaCadera(int i){ this.medidaCadera = i; }
    public int getMedidaCadera(){ return this.medidaCadera; }

    public void setLargo(int i){ this.largo = i; }
    public int getLargo(){ return this.largo; }

}