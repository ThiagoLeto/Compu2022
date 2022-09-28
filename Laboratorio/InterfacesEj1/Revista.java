import java.time.LocalDate;

public class Revista extends Leer implements Prestar {

    private LocalDate publicacion;

    public Revista() {
        super();
        this.publicacion = LocalDate.now();
    }

    public Revista(LocalDate publicacion) {
        super();
        this.publicacion = publicacion;
    }

    public void setPublicacion(LocalDate i){ this.publicacion = i; }
    public LocalDate getPublicacion(){ return this.publicacion; }

    @Override
    public void prestar(){
        this.publicacion.minusMonths(3);
        if(0 > LocalDate.now().compareTo(this.publicacion)){
            System.out.println("Prestado");
        }else{
            System.out.println("No prestado");
        }
    }
    //@Override
    //agregar elemento
}