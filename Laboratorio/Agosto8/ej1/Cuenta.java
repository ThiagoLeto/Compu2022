public class Cuenta {
    private String nombre_cliente;
    private int numeroCuenta;
    private double tipo_interes;
    private double saldo;

    public Cuenta(String nombre_cliente, int numeroCuenta, double tipo_interes, double saldo) {
        this.nombre_cliente = nombre_cliente;
        this.numeroCuenta = numeroCuenta;
        this.tipo_interes = tipo_interes;
        this.saldo = saldo;
    }

    public Cuenta(int numeroCuenta, double tipo_interes, double saldo) {
        this.nombre_cliente = "NUMBER#15 BURGERKING NIGGER";
        this.numeroCuenta = numeroCuenta;
        this.tipo_interes = tipo_interes;
        this.saldo = saldo/10;
    }

    public Cuenta() {
        this.nombre_cliente = "";
        this.numeroCuenta = 0;
        this.tipo_interes = 0;
        this.saldo = 1.0;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTipo_interes(double tipo_interes) {
        this.tipo_interes = tipo_interes;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getTipo_interes() {
        return tipo_interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresarDinero(double ingresos){
        this.saldo = this.saldo + ingresos;
    }

    public double extraerDinero(double egresos){
        if(this.saldo - egresos >= 0){this.saldo = this.saldo - egresos;return egresos;}else {
            System.out.printf("No puedes retirar, no tienes el dinero"); return 0;}
    }



}
