package saojudas.sixthexercise;

import java.util.Scanner;

/**
 *
 * @author Gabriel Jerônimo dos Santos
 * RA: 818125147
 *
 */
public class SixthExercise {
    public static void main(String[] args) {
        double radius;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do raio: ");

        radius = scanner.nextDouble();
        area = Math.PI * radius * radius;

        System.out.println("O valor da area é: " + area);
    }
}
