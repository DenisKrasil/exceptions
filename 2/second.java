public class second {
    private static final int[] intArray = {1,2,3,4,5,6,7,8,9};

    public static void main(String[] args) {
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        } catch(NullPointerException e){
            System.out.println("Catching exception: " + e);
        }
    }
}
