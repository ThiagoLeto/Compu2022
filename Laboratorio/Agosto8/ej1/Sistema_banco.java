import java.util.ArrayList;

public class Sistema_banco {
    //
    private ArrayList<Cuenta> cuentas;

    public Sistema_banco() {
        this.cuentas = new ArrayList<>();

    }
    public Cuenta encontrar_cuenta(int numeroCuenta ){
        for (Cuenta x:cuentas
             ) {
            if(x.getNumeroCuenta() == numeroCuenta){return x;}
        }
        System.out.println("No se encuentra el numero de cuenta");
        return null;
    }

    public void transaccion(int numeroTransactor, int numeroReceptor,double dinero){Cuenta transactor = encontrar_cuenta(numeroTransactor);
        Cuenta Receptor = encontrar_cuenta(numeroReceptor);transactor.extraerDinero(dinero);Receptor.ingresarDinero(dinero);}

}
