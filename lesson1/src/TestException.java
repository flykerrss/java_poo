public class TestException {

    public static void main(String[] args){

        try{
            getExceptionB();
        }catch(ExceptionA ae){
            ae.printStackTrace();
        }

        try{
            getExceptionC();
        }catch(ExceptionA ae){
            ae.printStackTrace();
        }

    }

    public static void  getExceptionB() throws ExceptionB{
        throw new ExceptionB("Exception B");
    }

    public static void  getExceptionC() throws ExceptionC{
        throw new ExceptionC("Exception C");
    }

}