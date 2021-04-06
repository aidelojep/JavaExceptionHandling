public class JavaExceptionHandling {
    public static void main(String[] args) {
       try {
           int[] myNumbers = {2, 4, 6, 8, 8, 10};
           System.out.println(myNumbers[10]);
       } catch (Exception e) {
           System.out.println("You typed an incorrect value sir!");
       } finally {
           System.out.println("The try and catch error is finished");
       }
    }




}
