import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        System.out.println("hola vamos a sumar");
        int a;
        int b;
        int k;
        System.out.println("ingrese el primer valor : ");
        a=leer.nextInt();
        System.out.println("ingrese el segundo valor : ");
        b= leer.nextInt();
        Suma  Suma1 = new Suma();
        k=Suma1.Sumar(a, b);
        System.out.println("la suma es : "+k);
    }
}
