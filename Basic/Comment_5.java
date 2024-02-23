

/**
 * <h2> Calculation of numbers </h2>
 * This program implements an application
 * to perform operation such as addition of numbers
 * and print the result
 * <p>
 * <b>Note:</b> Comments make the code readable and
 * easy to understand.
 *
 * @author Avinash Menon
 * @version 1.0
 * @since 2024-02-23
 */
public class Comment_5 {

    /**
     * This method calculates the summation of two integers.
     * @param input1 This is the first parameter to sum() method
     * @param input2 This is the second parameter to the sum() method.
     * @return int This returns the addition of input1 and input2
     */
    public int sum(int input1, int input2){
        return input1 + input2;
    }
    /**
     * This is the main method uses of sum() method.
     * @param args Unused
     * @see IOException
     */
    public static void main(String args[]) {


        //Single Line Comment

        int i=10; // i is a variable with value 10
        System.out.println(i);  //printing the variable i

        //Multi Line Comment


        /* Let's declare and
        print variable in java. */
        int i2=10;
        System.out.println(i2);
        /* float j = 5.9;
            float k = 4.4;
            System.out.println( j + k ); */

        //Documentation Comment

        Comment_5 obj = new Comment_5();
        int result = obj.sum(40, 20);

        System.out.println("Addition of numbers: " + result);

    }
}
