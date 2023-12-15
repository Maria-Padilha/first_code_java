import java.util.Scanner;

public class Exercise2 {

    public int[] numeros = {10,20,30};

    public static void main(String args[]){
        
        Scanner scanner = new Scanner(System.in);
        double tempoAntigo = System.currentTimeMillis();
        String s = scanner.nextLine();

        if(Exercise2.convertTime(System.currentTimeMillis() - tempoAntigo) > 2){
            System.out.println(s);
        }
    }

    public static double convertTime(double tempo){
        return tempo/1000;
    }
}