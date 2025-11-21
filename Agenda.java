import java.io.*;
import java.util.*;

public class Agenda {

    private List<Contatinho> lista = new ArrayList<>();

    public void addContatinho(Contatinho c) {
        lista.add(c);
    }

    public void ordenarLista() {
        Collections.sort(lista, Comparator.comparing(Contatinho::getNome));
    }

    public void salvarLista(String nomeArquivo) {
        try (FileWriter fw = new FileWriter(nomeArquivo)) {
            for (Contatinho c : lista) {
                fw.write(c.toString() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Contatinho lerContatinho(String nomeBuscado, String nomeArquivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                String[] dados = linha.split("#");
                if (dados[0].equalsIgnoreCase(nomeBuscado)) {
                    return new Contatinho(dados[0], dados[1], dados[2], dados[3]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}