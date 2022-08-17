import java.lang.Math;
import java.util.ArrayList;


public class raices {
    double a,b,c;
    public raices(double a, double b, double c) {
        if(a!= 0){ this.a = a;} else {System.out.println("a no puede ser 0");}
        if (b*b >= 4*c*a ) {this.b = b;} else {System.out.println("error, b tiene que ser mayor que 'a' y 'b' ");}
        this.c = c;
    }

    public double determinante (){ return b*b -4*a*c; }
    public ArrayList<Double> resolvente () {double raiz = Math.sqrt(determinante()) ;double x1=(-b + raiz)/2*a ; double x2= (-b-Math.sqrt(determinante()))/2*a;ArrayList<Double> valor_resolvente = new ArrayList<>(); valor_resolvente.add(x1); if(x1!=x2){valor_resolvente.add(x2);}return valor_resolvente; }
    }

