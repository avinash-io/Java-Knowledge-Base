public class ControlStatment_4 {

    public static void main(String args[]) {

        //Decision Making statements

            //if statements
            int x = 10;
            int y = 12;

            if(x+y > 20) {
                System.out.println("x + y is greater than 20");
            }

            //if else statements
            if(x+y < 20) {
                System.out.println("x + y is greater than 20"); //executes when condition is true
            }
            else{
                System.out.println("x + y is not lesser than 20"); //executes when condition is false
            }

            //if-else-if ladder:
            String city = "Delhi";
            if(city == "Meerut") {
                System.out.println("city is meerut");
            }else if (city == "Noida") {
                System.out.println("city is noida");
            }else if(city == "Agra") {
                System.out.println("city is agra");
            }else {
                System.out.println(city);
            }



            String address = "Delhi, India";

            if(address.endsWith("India")) {
                if(address.contains("Meerut")) {
                    System.out.println("Your city is Meerut");
                }else if(address.contains("Noida")) {
                    System.out.println("Your city is Noida");
                }else {
                    System.out.println(address.split(",")[0]);
                }
            }else {
                System.out.println("You are not living in India");
            }





    //switch statement

        int num = 1;
        switch (num){
            case 0:
                System.out.println("number is 0");
                break;
            case 1:
                System.out.println("number is 1");
                break;
            default:
                System.out.println(num);
        }


        //Loop statements

            //do while loop

        int i = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        do {
            System.out.println(i);
            i = i + 2;
        }while(i<=10);


        //while loop

        int i1 = 0;
        System.out.println("Printing the list of first 10 even numbers \n");
        while(i1<=10) {
            System.out.println(i1);
            i1 = i1 + 2;
        }


            //for loop

        int sum = 0;
        for(int j = 1; j<=10; j++) {
            sum = sum + j;
        }
        System.out.println("The sum of first 10 natural numbers is " + sum);

            //for-each loop

        String[] names = {"Java","C","C++","Python","JavaScript"};
        System.out.println("Printing the content of the array names:\n");
        for(String name:names) {
            System.out.println(name);
        }

        //Jump statements

            //break statement

        for(int i2 = 0; i2<= 10; i2++) {
            System.out.println(i2);
            if(i2==6) {
                break;
            }
        }



        a:
        for(int i2 = 0; i2<= 10; i2++) {
            b:
            for(int j = 0; j<=15;j++) {
                c:
                for (int k = 0; k<=20; k++) {
                    System.out.println(k);
                    if(k==5) {
                        break a;
                    }
                }
            }

        }
        //continue statement

        for(int i3 = 0; i3<= 2; i3++) {

            for (int j = i; j<=5; j++) {

                if(j == 4) {
                    continue;
                }
                System.out.println(j);
            }
        }
    }
}
