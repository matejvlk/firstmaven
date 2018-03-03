package cz.tul.matejvlk;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String p = "Hello world!";
        System.out.println(p);
    }

    public int add(int a, int b){
        return a+b;
    }

    //vrátí počet "a" ve slově
    public int countA(String text){
        int count = 0;
        for (char c: text.toCharArray()) {
            if(c == 'a' || c == 'A'){
                count++;
            }
        }
        return count;
    }
}
