import java.util.Scanner;

public class codigo_morse {
  public static void main(String[] args) {
    String abecedario[] = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", " "};

    String claves[] = {
      ".-",
      "-...",
    "-.-.",
      "-..",
      ".",
      "..-.",
      "--.",
      "....",
      "..",
      ".---",
      "-.-",
      ".-..",
      "--",
      "-.",
      "---",
      ".--.",
      "--.-",
      ".-.",
      "...",
      "-",
      "..-",
      "...-",
      ".--",
      "-..-",
      "-.--",
      "--..",
      "   "
    };

    String characters[];
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingresa la cadena.");
    String cadena = entrada.nextLine();
    cadena = cadena.toLowerCase();

    if ((cadena.contains(".") || cadena.contains("-"))){
      characters = cadena.split(" ");
      for (int i = 0; i < characters.length; i++) {
        for (int j = 0; j < abecedario.length; j++) {
          String letra = characters[i];
          if (letra.equals(claves[j])) {
            System.out.print(abecedario[j]);
          }
        }
        System.out.print(" ");
      }
    }else{
      characters = cadena.split("");
      for (int i = 0; i < characters.length; i++) {
        for (int j = 0; j < abecedario.length; j++) {
          String letra = characters[i];
          if (letra.equals(abecedario[j])) {
            System.out.print(claves[j] + " ");
          }
        }
      }
    }
  }
}
