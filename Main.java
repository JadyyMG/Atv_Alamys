import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = scanner.nextInt();
        scanner.close();

        try {
            FileWriter escritor = new FileWriter("tabuada_" + num + ".txt");
            for (int n = 1; n <= 10; n++) {
                String linha = num + " X " + n + " = " + (num * n) + "\n";
                System.out.print(linha);
                escritor.write(linha); 
            }

            escritor.close();
            System.out.println("Tabuada salva em: tabuada_" + num + ".txt");

        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo: " + e.getMessage());
        }
    }
}
