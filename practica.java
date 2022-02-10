import java.util.Scanner;

public class practica {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Kiubo What's your name?");
    String name = scan.nextLine();
    System.out.println("Hola " + name);
    System.out.println("Cuantos años tienes");
    int age = scan.nextInt();
    if (age >= 18) {
        System.out.println("Hola, " + name + " eres mayor de edad");
    } else {
        System.out.println("Hola, " + name + " no eres mayor de edad");
    }
    }
}