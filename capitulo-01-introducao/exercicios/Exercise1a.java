/**
 *
 * @author Jefferson Js
 */

public class Exercise1a {

    public static void main(String[] args) {
        int x = 1;
        while (x < 10) {

            //adicionada linha para adicionar uma unidade a "x" para que o loop funcione e ao mesmo tempo não seja infinito
            x = x + 1;
            if (x > 3) {

                System.out.println("big x");
            }
        }
    }

}
