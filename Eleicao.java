import java.util.Scanner;

public class Eleicao {
    public static void main(String[] args) {
        // os números dos partidos
        final int numero_do_psdb = 45;
        final int numero_do_pmdb = 15;

        // Leitura do número de eleitores
        Scanner scanner = new Scanner(System.in);
        System.out.print("Número de eleitores: ");
        int total_eleitores = scanner.nextInt();

        // Variáveis para armazenar os votos
        int votos_psdb = 0;
        int votos_pmdb = 0;
        int nulo = 0;

        // Loop para receber os votos de cada eleitor
        for (int i = 0; i < total_eleitores; i++) {
            System.out.print("Digite o voto do eleitor " + (i + 1) + ": ");
            int voto = scanner.nextInt();

            if (voto == numero_do_psdb) {
                votos_psdb++;
            } else if (voto == numero_do_pmdb) {
                votos_pmdb++;
            } else {
                nulo++;
            }
        }

        scanner.close();

        // Cálculo dos votos válidos
        int validos = votos_psdb + votos_pmdb;

        // Verificação do resultado da eleição
        if (nulo > validos / 2) {
            System.out.println("Eleição cancelada devido ao alto número de votos nulos!");
        } else {
            System.out.println("Resultado da eleição:");

            // Verificação do partido vencedor
            if (votos_psdb > votos_pmdb) {
                System.out.println("Partido vencedor: PSDB (" + numero_do_psdb + ")");
                System.out.println("Número de votos do PSDB: " + votos_psdb);
                System.out.println("Número de votos do PMDB: " + votos_pmdb);
            } else if (votos_pmdb > votos_psdb) {
                System.out.println("Partido vencedor: PMDB (" + votos_pmdb + ")");
                System.out.println("Número de votos do PMDB: " + votos_pmdb);
                System.out.println("Número de votos do PSDB: " + votos_psdb);

            } else {
                System.out.println("Empate! Não há partido vencedor.");
            }

            System.out.println("Número de votos nulos: " + nulo);
            System.out.println("Número de votos válidos: " + validos);
        }
    }
}
