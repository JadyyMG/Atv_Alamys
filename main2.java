import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = scanner.nextInt();
        scanner.close();

        // Monta o nome do arquivo igual ao anterior
        String nomeArquivo = "tabuada_" + num + ".txt";
        File arquivo = new File(nomeArquivo);

        // Verifica se o arquivo existe
        if (arquivo.exists()) {
            try {
                // Lê o conteúdo linha por linha
                Scanner leitor = new Scanner(arquivo);

                while (leitor.hasNextLine()) {
                    String linha = leitor.nextLine();
                    System.out.println(linha);
                }

                leitor.close();
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        } else {
            System.out.println("O arquivo " + nomeArquivo + " não existe!");
        }
    }
}
