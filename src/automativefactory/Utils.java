/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automativefactory;
import java.util.Scanner;
/**
 * Utils
 *
 * Esta classe contém métodos utilitários para manipulação de detalhes.
 * 
 * @author 0041432213010
 */
public class Utils {
    
    /**
     * Cria um array bidimensional para armazenar detalhes.
     *
     * @param tamanho O tamanho do array.
     * @return Um array bidimensional de detalhes.
     */
    public static String[][] criarArrayDetalhes(int tamanho) {
        return new String[tamanho][2];
    }
    /**
     * Adiciona detalhes ao array.
     *
     * @param array  informa o array para adicionar os dados
     */
    public static void adicionarDetalhes(String[][] array) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("informe o " + array[i][0] + ": ");
            array[i][1] = scanner.nextLine();
        }
    }
}
