import java.nio.channels.ClosedByInterruptException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedDeque;



  /*Ven y sana mi dolor, tienes la cura de este amor
    Hago este llamado, para que tú vuelvas
    Tú no ves que yo estoy sufriendo
    Es muy dura esta prueba,
    hay un hombre moribundo aquí dime quien lo puede revivir
    Hay un hombre moribundo aquí dime quien lo puede revivir
    Tú tienes la receta, la formula secreta */

public class Computadora {
    private ArrayList<Internos> componentes_internos;
    private ArrayList<Perifericos> periferics;
    private HashMap<Compra,Cliente> compras;

    private static int scannerInt(){
        return new Scanner(System.in).nextInt();
    }
    private static String scannerString(){
        return new Scanner(System.in).nextLine();
    }

    public Computadora(ArrayList<Internos> componentes_internos, ArrayList<Perifericos> periferics) {
        this.componentes_internos = componentes_internos;
        this.periferics = periferics;
        this.compras = new HashMap<>();
    }

    private boolean verificacion_compra() throws componentesException {
        boolean entrada = false;
        boolean salida = false;
        boolean cpu = false;


        for (Internos x : componentes_internos
        ) {
            if (x.getTipo() == "cpu") {
                cpu = true;
            }
        }
        for (Perifericos x : periferics) {
            if (x.getTipo() != null && x.isSalida()) {
                salida = true;
            }
            if (x.getTipo() != null && !x.isSalida()) {
                entrada = true;
            }
        }
        if (salida && entrada && cpu) { return true;}throw new componentesException("Error");
    }
    public  void comprar(Cliente comprador){ try {if (verificacion_compra()) {Tarjeta metodo_pago = null;if(scannerString() == "tarjeta"){ ;int num = scannerInt(); String banco = scannerString(); String tipo = scannerString();boolean credito = false ;if(tipo == "debito"){credito = true;} metodo_pago = new Tarjeta(num,banco,credito) ;}  Compra esta_compra = new Compra(metodo_pago,this); float compra = 0;
        for (Internos x: componentes_internos
        ) {
            compra += x.getPrecio();
        }
        for (Perifericos x:periferics
        ) {
            compra += x.getPrecio();
        }  compra = esta_compra.comprar(compra);esta_compra.setPlata(compra);compras.put(esta_compra,comprador); }
    }catch (componentesException e ) {
        System.out.println("Ingrese una cpu, dispositivo de entrada y salida");
    }
    }

}