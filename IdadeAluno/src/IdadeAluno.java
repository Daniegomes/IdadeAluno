public class IdadeAluno {
    public static void main(String[] args) {
        // Definindo a idade do aluno em dias
        int idadeEmDias = 4325; 

        // Calculando anos, meses e dias
        int anos = idadeEmDias / 365;
        int diasRestantes = idadeEmDias % 365;
        int meses = diasRestantes / 30;
        int dias = diasRestantes % 30;

        // Exibindo o resultado
        System.out.println("Idade do aluno:");
        System.out.println(anos + " anos, " + meses + " meses e " + dias + " dias");
    }
}
