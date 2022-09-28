public class Leer implements ToString {

    private Integer codigo;
    private String titulo;
    private Integer añoPublicacion;

    public Leer() {
        this.codigo = 0;
        this.titulo = "a";
        this.añoDePublicacion = 2000;
    }

    public Leer(Integer codigo,String titulo,Integer añoPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
    }

    public void setCodigo(Integer i){ this.codigo = i; }
    public Integer getCodigo(){ return this.codigo; }

    public void setTitulo(String i){ this.titulo = i; }
    public String getTitulo(){ return this.titulo; }

    public void setAñoPublicacion(Integer i){ this.añoPublicacion = i; }
    public Integer getAñoPublicacion(){ return this.añoPublicacion; }

    @Override
    public String toString() {
        return codigo.toString() + " " + titulo + " " + añoPublicacion.toString();
    }
}