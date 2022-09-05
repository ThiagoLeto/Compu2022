import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static boolean bounds_index( int index, Sistema_Alarma sis ) throws IndexOutOfBoundsException{ if(index >= sis.getLista_dispositivos().size()){throw new IndexOutOfBoundsException("boliviano");}return true; }

    public static void main(String[] args) {

        Sistema_Alarma sis = new Sistema_Alarma();
        boolean no_es_numero = true;
        while (no_es_numero) {
            try {
                Scanner scan = new Scanner(System.in);
                int index = scan.nextInt();
                if (index < 0){throw new ScannerArgumentException("Negativo");}
                no_es_numero = bounds_index(index,sis);

            } catch (InputMismatchException e){
                no_es_numero = true;
                System.out.println("ESO NO ES UN NUMERO CABRON ");
            } catch (IndexOutOfBoundsException e){
                no_es_numero = true;
                System.out.println("EL INDICE SELECCIONADO NO SE ENCUENTRA DENTRO DEL SISTEMA");
            } catch (ScannerArgumentException e){ no_es_numero = true;
                System.out.println("NO HAY POSICIONES NEGATIVAS"); }
    }

    }
}
