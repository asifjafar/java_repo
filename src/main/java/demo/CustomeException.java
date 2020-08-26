package demo;

/**
 * Created by User on 21-06-2019.
 */
public class CustomeException {

    public static void main(String[] args) {



            try {
                System.out.println("Testing Exception");
                throw new MyException("Runtime");
            } catch (MyException e) {
                e.printStackTrace();
            }

    }




}

class MyException extends Throwable  {

    public MyException(String s){
        if (s.equals("Runtime")){
            this.Myruntimeexception();
        }
    }
      RuntimeException Myruntimeexception(){
        System.out.println("RuntimException");
        return null;
    }
}
