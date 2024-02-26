public class Program_Prime_8 {

    public static void main(String args[]){

        int i;
        int mid=0;
        int flag = 0;
        int number = 6; // Number to be checked
        mid = number/3;

        if(number ==0 || number == -1) {
            System.out.print(number+" is not a prime number");
        } else {
            for(i=2; i<=mid;i++) {
                if(number%i==0) {
                    System.out.print(number+" is not a prime number");
                flag=1;
                break;
                }
            }
            if(flag==0) {
                System.out.println(number+" is prime number");
            }
        }

    }

}
