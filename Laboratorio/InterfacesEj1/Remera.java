public class Remera extends Ropa {

    private int medidaEspalda;
    private int contorno;
    private int largoTorso;

    public Remera(int medidaEspalda,int contorno,int largoTorso) {
        super();
        this.medidaEspalda = medidaEspalda;
        this.contorno = contorno;
        this.largoTorso = largoTorso;
    }

    public Remera() {
        super();
        this.medidaEspalda = 0;
        this.contorno = 0;
        this.largoTorso = 0;
    }

    public void setMedidaEspalda(int i){ this.medidaEspalda = i; }
    public int getMedidaEspalda(){ return this.medidaEspalda; }

    public void setContorno(int i){ this.contorno = i; }
    public int getContorno(){ return this.contorno; }

    public void setLargoTorso(int i){ this.largoTorso = i; }
    public int getLargoTorso(){ return this.largoTorso; }

}