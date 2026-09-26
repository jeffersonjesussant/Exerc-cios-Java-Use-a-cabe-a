import java.util.Random;

/**
 *
 * @author Jefferson Js
 */

public class PhraseOMatic {
    public static void main(String[] args) {
         
        String [] wordListOne = {"haptically driven","extensible","dreactive","agent based","functional","AI enabled","strongly typed"};
        String [] wordListTwo = {"six sigma","asynchronous","event driven","pub-sub","IoT","cloudnative","service oriented","containerized","serverless","microservices"};  
        String [] wordListThree = {"framework","library","DSL","REST API","repository","pipeline","servicemesh"};
        
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;
        
        Random randomGenerator = new Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);
        
        //Create phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        
        System.out.println("we need " + phrase);
        
    }
}
