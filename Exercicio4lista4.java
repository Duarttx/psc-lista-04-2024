import java.util.Scanner;
public class Exercicio4lista4{
        public static void main(String[] args) {
            Scanner imput= new Scanner(System.in);
            double paisUm = 80000;
            double paisDois = 200000;
    
            System.out.println(" Vamos calcular os anos necessários para que a população A ultrapasse ou iguale a B");
        
            int ano = 0;
            for (double index = paisUm * 0.03; index < paisDois * 0.015; index++) {
                ano++;
    
                System.out.print(ano + ", ");
            }
    
            imput.close();
        }
    }