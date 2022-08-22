import java.util.ArrayList;

public class Compra {
 private Tarjeta metodo_pago;
 private float Plata;
 private Computadora pc;

    public Compra(Tarjeta metodo_pago, Computadora pc) {
        this.metodo_pago = metodo_pago;
        this.Plata = 0;
        this.pc = pc;
    }

    public Tarjeta getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(Tarjeta metodo_pago) {
        this.metodo_pago = metodo_pago;
    }

    public float getPlata() {
        return Plata;
    }

    public void setPlata(float plata) {
        Plata = plata;
    }

    public float comprar(float monto) {
        if (this.metodo_pago == null) { return monto ;} monto = monto + monto *5/100; return monto;
    } // public false|| this.fornite_while_we_evita


}
