import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        float soma = 0;
        for (int i = 1; i <= 4; i++) {

            System.out.println("Digite a " + i + "º nota");
            float n = s.nextFloat();

            soma += n;
        }

        float media = soma/4;

        if (media >= 7) {
            System.out.println("APROVADO");
        } else if (media >= 5) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("REPROVADO");
        }
    }
}