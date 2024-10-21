package metalurgica;

import java.util.Scanner;

public class Util {
    public void menu(int tamanho, String... opcoes) {
        for (int x = 0; x < tamanho; x++) {
            System.out.println("[" + (x + 1) + "] - " + opcoes[x]);
        }
    }

    public int keyboardInt(String msg) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(msg);
        int text = keyboard.nextInt();
        return text;

    }

    public String keyboardString(String msg) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(msg);
        String text = keyboard.next();
        return text;
    }

    public Float keyboardFloat(String msg) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println(msg);
        Float text = keyboard.nextFloat();
        return text;
    }
}
