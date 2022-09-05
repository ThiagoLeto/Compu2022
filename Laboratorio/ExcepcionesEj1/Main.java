
//Leto y García
public class Main {

    public static int tamano_strinJ (String estrin) throws NullPointerException{
        return estrin.length();
    }
    public static int tamano_strin_custom(String estrin)throws nullPositionException{
        if(estrin==null){
            throw new nullPositionException("Veto y Carcios") ;
        } else {return estrin.length();}
    }


    public static void main(String[] args) {
        // A
        try {
            String nombre = null;
            System.out.println("El nombre es: " + nombre.length());
        }catch(NullPointerException e){
            System.out.println("LEPOT && GARSUS");
        }

        // B
        try {
            String nombre = null;
            if(nombre == null){throw new NullPointerException("petot y garcus");}
            System.out.println("El nombre es: " + nombre.length());
        }catch(NullPointerException e){
            System.out.println("petot y garcus");
        }

        // C
        try{
            String nombre = null;
            System.out.println("El nombre es: " + tamano_strinJ(nombre));
        }catch(NullPointerException e){
            System.out.println("Letongus y Morbcia");
        }

        // D
        try{String nombre = null;
            System.out.println("El nombre es: " + tamano_strin_custom(nombre));
        }catch(nullPositionException e){
            System.out.println("mr.whieto y Jercia");
        }

    }
}