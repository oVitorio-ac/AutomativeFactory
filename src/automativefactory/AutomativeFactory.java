package automativefactory;
import java.util.Scanner;

public class AutomativeFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Utils utilitis = new Utils ();

        String[][] detalhesCarros = utilitis.criarArrayDetalhes(5); // Criando um array para armazenar os detalhes dos carros
        detalhesCarros[0][0] = "Modelo";
        detalhesCarros[1][0] = "Motor";
        detalhesCarros[2][0] = "cor";
        detalhesCarros[3][0] = "quantidade de portas";
        detalhesCarros[4][0] = "quantidade de rodas"; 
                
    // Pedindo ao usuário que insira os detalhes do primeiro carro
        System.out.println("Insira os detalhes do primeiro carro:");
        utilitis.adicionarDetalhes(detalhesCarros);

        // Criando o primeiro objeto Car com os valores fornecidos pelo usuário
        Car carro1 = new Car(
                detalhesCarros[0][1],
                detalhesCarros[1][1],
                detalhesCarros[2][1],
                Integer.parseInt(detalhesCarros[3][1]),
                Integer.parseInt(detalhesCarros[4][1])
        );
 
        // Exibindo informações do primeiro carro
        System.out.println("\nInformacoes do primeiro carro:");
        System.out.println(carro1.toString());
        scanner.close();
    
    }  
}
