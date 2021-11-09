import java.util.Random;
import java.util.Scanner;

public class JogoSorte {
	static Scanner ler = new Scanner(System.in);
	public static void main(String[] args) {
		
		Random gerador = new Random();

        int numTentativas = 0;

        int numSorteado = gerador.nextInt(49);

        numSorteado = numSorteado + 1;
        
        System.out.println("O n�mero sorteado �: " + numSorteado); 

        
        for (int valorDigitado = 0; valorDigitado != numSorteado; numTentativas++){
            System.out.println("Chute um n�mero: ");
            valorDigitado = ler.nextInt();
            
            int aux = 0;
            aux = aux + valorDigitado;

            if (valorDigitado < numSorteado){
                System.out.println("� um valor menor que o sorteado, tente novamente");
                
            } else if (valorDigitado > numSorteado){
                System.out.println("� um valor maior que o sorteado, tente novamente");
                
            } else {
                System.out.println("Uhull voc� Acertou!!");
                System.out.printf("Voc� tentou: %d vezes", (numTentativas + 1));
            }
        }
    }

}
