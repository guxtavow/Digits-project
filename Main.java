import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner numeroPergunta = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        long numeropergunta = numeroPergunta.nextLong();


        if (numeropergunta <9 && numeropergunta >= 1)
            System.out.println("Este numero tem 1 digito.");
        else if (numeropergunta <99 && numeropergunta >= 10)
            System.out.println("Este numero tem 2 digitos.");
        else if (numeropergunta <999 && numeropergunta >= 100)
            System.out.println("Este numero tem 3 digitos");
        else if (numeropergunta <9999 && numeropergunta >= 1000)
            System.out.println("Este numero tem 4 digitos");
        else
            System.out.println("Este numero tem 5 ou mais digitos");
        }
    }
