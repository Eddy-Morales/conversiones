import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //conversion implicita, donde no haya perdidas de nadtos
        int numeroEntero= 42;
        double numeroDecimal = numeroEntero; //conversion implicita de int a double
        System.out.println(numeroDecimal);

        //int a long
        long numeroLargo= numeroEntero; // conversion implicita de int a log
        System.out.println(numeroLargo);

        //char a int
        char letra ='M';
        int codigoAscii= letra;
        System.out.println(codigoAscii);

        String texto = "123";
        int numero = Integer.parseInt(texto); //conversion de String a int utiizando un metodo
        System.out.println(numero);

        long numeroLong = 1000000L;
        int numerolong= (int) numeroLong;
        System.out.println(numerolong);

        //riesgos
        double valorDecimal= 123.456;
        int valorEntero= (int) valorDecimal; //se pierde la parte decimal
        System.out.println(valorEntero);

        float flotante= 585.326F;
        int valorEntero2= (int) flotante;
        System.out.println(valorEntero2);

        byte valor1= 56;
        int valor2= (int) valor1;
        System.out.println(valor2);
        double valor3= valor1;
        System.out.println(valor3);
        char valor4= (char)valor1;
        System.out.println(valor4);
    }
}