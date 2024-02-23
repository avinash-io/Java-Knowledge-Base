public class Operator_3 {
    public static void main(String args[]){


        //Java Unary Operator Example: ++ and --
        int x=10;
        System.out.println(x++);//10 (11)
        System.out.println(++x);//12
        System.out.println(x--);//12 (11)
        System.out.println(--x);//10

        System.out.println();
        //Java Unary Operator Example 2: ++ and --

        int a=10;
        int b=10;
        System.out.println(a++ + ++a);//10+12=22
        System.out.println(b++ + b++);//10+11=21

        System.out.println();
        //Java Unary Operator Example: ~ and !

        int x1=10;
        int y=-10;
        boolean c=true;
        boolean d=false;
        System.out.println(~x1);//-11 (minus of total positive value which starts from 0)
        System.out.println(~y);//9 (positive of total minus, positive starts from 0)
        System.out.println(!c);//false (opposite of boolean value)
        System.out.println(!d);//true

        System.out.println();
        //Java Arithmetic Operator Example

        int a1=10;
        int b1=5;
        System.out.println(a1+b1);//15
        System.out.println(a1-b1);//5
        System.out.println(a1*b1);//50
        System.out.println(a1/b1);//2
        System.out.println(a1%b1);//0

        System.out.println();
        //Java Arithmetic Operator Example: Expression
        System.out.println(10*10/5+3-1*4/2); //21

        System.out.println();
        //Java Left Shift Operator
        System.out.println(10<<2);//10*2^2=10*4=40
        System.out.println(10<<3);//10*2^3=10*8=80
        System.out.println(20<<2);//20*2^2=20*4=80
        System.out.println(15<<4);//15*2^4=15*16=240

        System.out.println();
        //Java Right Shift Operator
        System.out.println(10>>2);//10/2^2=10/4=2
        System.out.println(20>>2);//20/2^2=20/4=5
        System.out.println(20>>3);//20/2^3=20/8=2

        System.out.println();
        //Java Shift Operator Example: >> vs >>>

        //For positive number, >> and >>> works same
        System.out.println(20>>2);
        System.out.println(20>>>2);
        //For negative number, >>> changes parity bit (MSB) to 0
        System.out.println(-20>>2);
        System.out.println(-20>>>2);


        System.out.println();
        //Java AND Operator Example: Logical && and Bitwise &

        int a2=10;
        int b2=5;
        int c2=20;
        System.out.println(a2<b2&&a2<c2);//false && true = false
        System.out.println(a2<b2&a2<c2);//false & true = false

        System.out.println();
        //Java AND Operator Example: Logical && vs Bitwise &
        int a3=10;
        int b3=5;
        int c3=20;
        System.out.println(a3<b3&&a3++<c3);//false && true = false
        System.out.println(a3);//10 because second condition is not checked
        System.out.println(a3<b3&a3++<c3);//false && true = false
        System.out.println(a3);//11 because second condition is checked

        //Java OR Operator Example: Logical || and Bitwise |

        int a4=10;
        int b4=5;
        int c4=20;
        System.out.println(a4>b4||a4<c4);//true || true = true
        System.out.println(a4>b4|a4<c4);//true | true = true
        //|| vs |
        System.out.println(a4>b4||a4++<c4);//true || true = true
        System.out.println(a4);//10 because second condition is not checked
        System.out.println(a4>b4|a4++<c4);//true | true = true
        System.out.println(a4);//11 because second condition is checked

        //Java Ternary Operator

        int a5=2;
        int b5=5;
        int min=(a5<b5)?a5:b5;
        System.out.println(min);

        //Java Assignment Operator


        int a6=10;
        int b6=20;
        a6+=4;//a=a+4 (a=10+4)
        b6-=4;//b=b-4 (b=20-4)
        System.out.println(a6);
        System.out.println(b6);


        int a7=10;
        a7+=3;//10+3
        System.out.println(a7);
        a7-=4;//13-4
        System.out.println(a7);
        a7*=2;//9*2
        System.out.println(a7);
        a7/=2;//18/2
        System.out.println(a7);
    }
}
