/**
 *
 * @author Jefferson Js
 */

public class PoolPuzzleOne {
    public static void main(String[] args) {
        
        int x = 0;
        while(x < 4){
            //essa linha será repetida no loop
            System.out.print("a");
            //se a condicao for atendida e incluso o espaço 
            if(x < 1){
            System.out.print(" ");
            }
            //essa linha sera repetida no loop
            System.out.print("n");
            /**
             * a condicao sera atendida no ultimo loop a adicao de 2 unidades ao "x" esta dentro da codicao
             * (essa linha estava me deixando maluco)
            */
            if(x > 1){
                System.out.print(" oyster");
                x = x + 2;
            }
            
            if(x == 1){
                System.out.print("noys");
            }
            
           if(x < 1){
                System.out.print("oise");
            }
            System.out.println();
            x = x + 1;
        }
    }
} 
