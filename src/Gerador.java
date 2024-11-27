import java.util.Random;
import java.util.Scanner;

public class Gerador {
    int numGerado;
    int numTentativas;
    int num;

    public void geradorNum(){
        Random rand = new Random();
        numGerado = rand.nextInt(100) + 1;
    }

    public void advinhaNum(){
        geradorNum();
        numTentativas = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero aleatorio de 1 a 100");
        do {
            System.out.println("Digite o numero ");
            num = scan.nextInt();
            numTentativas ++;

            if (num == numGerado){
                System.out.println("Voce acertou");
                System.out.println("Voce tentou" + " " + numTentativas + " " +"tentaivas");
                System.out.println("O numero era " + " " + numGerado);
            } else if (num < numGerado) {
                System.out.println("Muito baixo");
            }else {
                System.out.println("Muito alto");
            }
        }while (num != numGerado);
        scan.close();
    }

}
