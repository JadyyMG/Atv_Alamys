public class Main {
    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        agenda.addContatinho(new Contatinho("Nick Ferreira", "nick@gmail.com", "839888888", "Professor"));
        agenda.addContatinho(new Contatinho("Ana", "ana@gmail.com", "99999999", "Amiga"));

        agenda.ordenarLista();
        agenda.salvarLista("contatinhos.txt");

        Contatinho c = agenda.lerContatinho("Ana", "contatinhos.txt");

        if (c != null)
            System.out.println("Encontrado: " + c);
        else
            System.out.println("Não encontrado!");
    }
}