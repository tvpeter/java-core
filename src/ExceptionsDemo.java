public class ExceptionsDemo {

    public static void main(String[] args) {
        try {

            int c = 30/0;

            System.out.println(c);

        }catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Division is fun");
        }
    }
}
