package exec1;

import java.util.Scanner;

public class Exec1 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int entrada = 0;

    System.out.println("Insira um numero entre 1-9");
    entrada = sc.nextInt();
    int tentativa = 1;

    if (entrada < 1 || entrada > 9) {
      do {

        if (tentativa >= 3) {
          entrada = 9;
        } else {

          System.out.println("Numero invalido, tente novamente:");
          entrada = sc.nextInt();
          tentativa++;
        }
      } while (entrada <= 0 || entrada >= 10);

      if (tentativa >= 3) {
        System.out.println("Saindo...");
      } else {

        multiplicar(entrada);
      }
    }

  }

  private static void multiplicar(int entrada) {
    for (int i = 1; i <= entrada; i++) {
      System.out.println(" ");
      for (int j = 1; j <= i; j++) {
        System.out.print(i * j + "  ");
      }

    }
  }
}
