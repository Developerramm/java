package Exception;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exception  handling here ");

       try{
           int arr[] = new int[5];
           arr[6] = 10;
       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }catch (ArrayIndexOutOfBoundsException e){
           System.out.println(e.getMessage());
       }

    }
}
