import java.util.ArrayList;
import java.util.Date;

public class Personal_Administrativo extends Asalariados{
    private String codigo;
    private String userName;
    private String password;

    public Personal_Administrativo(String nombre, String apellido, int edad, int dni, float salario, String banco, Date fecha_cobro, Date fecha_alta, String codigo, String userName, String password) {
        super(nombre, apellido, edad, dni, salario, banco, fecha_cobro, fecha_alta);
        this.codigo = codigo;
        this.userName = userName;
        if(verificar_password(password) ){
        this.password = password;
        }else{this.password="123456789";}
    }

    public boolean verificar_password(String password){if(password.length() >= 8){
        String password_aux;
        boolean mayuscula = false;
        boolean caracter = false;
        for (char x:password.toCharArray()
             ) {
            if(x>= 65 && x<= 90){mayuscula = true;} else if ( !(x>= 97 && x<= 122) ) {
                caracter = true;
            }
        }
        if (mayuscula && caracter){return true;}
        

    }return false; }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
