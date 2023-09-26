import java.util.Scanner;

public class Contador {

    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro.");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro.");
        int parametroDois = terminal.nextInt();
        terminal.close();

        try {
            contar(parametroUm,parametroDois);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro.");
        }
    }

    static void contar(int parametroUm, int parametroDois) throws  ParametrosInvalidosException {
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        else{
            int contagem = parametroDois - parametroUm;
            for(int x=1; x <= contagem; x++){
                System.out.println("Imprimindo o número: " + x);
            }
        }
    }   
}
