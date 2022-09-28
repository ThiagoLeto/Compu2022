
public class Libro extends Leer implements Prestar{

    private int paginasCapitulo;

    public Libro() {
        super();
        this.paginasCapitulo = 50;
    }

    public Libro(int paginasCapitulo) {
        super();
        this.paginasCapitulo = paginasCapitulo;
    }

    public void setPaginasCapitulo(int i){ this.paginasCapitulo = i; }
    public int getPaginasCapitulo(){ return this.paginasCapitulo; }

    @Override
    public void prestar(){
        if (this.paginasCapitulo % 2 == 0){
            System.out.println("Prestado");
        }else{
            System.out.println("No prestado");
        }
    }
    //@Override
    //agregar elemento
}