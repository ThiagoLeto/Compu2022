import java.util.Scanner;

public class Fecha {
    private int año,mes,dia;

    public Fecha(int año,int mes,int dia){
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }
    public Fecha(){
        this.año = 0;
        this.mes = 0;
        this.dia = 0;
    }

    public int getAño() {return año;}
    public void setAño(int año) {this.año = año;}

    public int getMes() {return mes;}
    public void setMes(int mes) {this.mes = mes;}

    public int getDia() {return dia;}
    public void setDia(int dia) {this.dia = dia;}

    private static int scanner(){
        return new Scanner(System.in).nextInt();
    }

    public void mostrar() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.año);
    }


    public boolean esAñoBisiesto() {
        return this.año%4 == 0;
    }


    public Fecha diaSiguiente() {
        int dia_ = this.dia;
        int mes_ = this.mes;
        int año_ = this.año;
        dia++;

        if(diasPorMes(this.mes) < this.dia+1){
            mes_ += 1;
            dia_  = 1;
        }
        if(this.mes>12){
            dia_ = 1;
            mes_ = 1;
            año_ ++;
        }

        Fecha f1 = new Fecha(año_,mes_,dia_);
        return f1;
    }


    private int diasPorMes(int mes){
        int diasPorMes = 0;
        switch(mes){
            case 2:   if(esAñoBisiesto()){ diasPorMes = 29; }else{ diasPorMes = 28; } break;
            case 4:   diasPorMes = 30; break;
            case 6:   diasPorMes = 30; break;
            case 9:   diasPorMes = 30; break;
            case 11:  diasPorMes = 30; break;
            default:  diasPorMes = 31; break;
        }
        return diasPorMes;
    }


    public static void main(String [] args){

        int dia = 0,mes = 0,año = 0;

        System.out.println("Ingrese el año: ");    año = scanner();
        System.out.println("Ingrese el mes: ");    mes = scanner();
        System.out.println("Ingrese el dia: ");    dia = scanner();

        Fecha fecha = new Fecha(año,mes,dia);

        for(int i=0;i<10;i++){
            fecha.diaSiguiente();
            fecha = fecha.diaSiguiente();
            fecha.mostrar();
        }
    }

}
