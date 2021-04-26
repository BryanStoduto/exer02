package excicio2tarde;
import java.util.Scanner;

public class ParImpar3 {
    
public static void main(String[] args){
     int n1;
     
     Scanner ler = new Scanner(System.in);
     
     System.out.println("Digite um número");
     n1 = ler.nextInt();
     
     if(n1%2 == 0){
        System.out.println("Número par");
     }else{
         System.out.println("Número ímpar");
     }

}
}


