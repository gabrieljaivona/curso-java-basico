import java.util.Scanner;


public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro parametro: ");
        int parametroUm = scanner.nextInt();
        System.out.println("Digite o segundo parametro: ");
        int parametroDois = scanner.nextInt();

        try{
                //chamando o metodo contendo a logica de contagem
            contar(parametroUm, parametroDois);

        }catch(ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção

        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }


        int contador = parametroDois - parametroUm;
        //realizar o for para imprimir os números com base na variável contagem
        for(int i = 0; i <= contador; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}