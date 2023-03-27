public class Main {

    public static void main(String[] args) {
        suma(10,20,30);
        Coche miCoche = new Coche();
        miCoche.aggPuerta();
        System.out.println("el numero de puertas del cohce es: "+miCoche.puertas);
    }
    public static void suma(int num1, int num2, int num3){
        int resultado;
        resultado =num1+num2+num3;
        System.out.println("el resultado de la suma de los numeros "+num1+"+"+num2+"+"+num3+"="+resultado);
    }


}
class Coche{
    int puertas;
    public void aggPuerta(){
        puertas++;
    }

}