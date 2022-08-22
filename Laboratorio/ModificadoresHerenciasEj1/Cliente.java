public class Cliente extends Persona{
    private int id;
    private String email;
    private int telefono;

    public Cliente(String nombre, String apellido, int edad, int dni) {
        super(nombre,apellido ,edad, dni);
        this.id = id;
        this.email = email;
        this.telefono = telefono;
    }
    public Cliente() {
        super("a", "a",0, 0);
        this.id = 0;
        this.email = "a";
        this.telefono = 0;
    }

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public int getTelefono() {return telefono;}
    public void setTelefono(int telefono) {this.telefono = telefono;}


}
