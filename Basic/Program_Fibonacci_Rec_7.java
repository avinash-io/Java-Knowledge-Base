public class Program_Fibonacci_Rec_7 {


    static int number1=0, number2=1, number3=0;

    static void printFibonacci(int count) {
        if(count > 0) {
            number3 = number1 + number2;
            number1 = number2;
            number2 = number3;
            System.out.print(" "+number3);
            printFibonacci(count-1);
        }
    }
    public static void main(String args[])
    {
        int count = 10;
        System.out.print(number1+" "+number1); //Print 0 and 1
        printFibonacci(count-2); //n-2 because 2 number are already printed
    }

}
