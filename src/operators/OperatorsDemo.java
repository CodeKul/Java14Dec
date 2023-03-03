package operators;

/**
 * arithmetic -> +,-,*,/,%
 * boolean -> true false
 * ternary -> ? :
 * logical - && , || NOT
 * bitwise - & |
 * unary -> post increment a++,pre increment ++a,--a,a--
 * relational -> < > ,<= ,>=
 * assignment -> = ==
 * shift -> << ,>>
 */
public class OperatorsDemo {
    public static void main(String[] args) {


//        System.out.println(i+j);
//        System.out.println(i-j);
//        System.out.println(i/j);
//        System.out.println(i*j);
//        System.out.println(i%j);

//        System.out.println(i++); //i = i + 1
//        System.out.println(i);

//        System.out.println(i--);//i = i - 1
//        System.out.println(i);

//        System.out.println(++i); //i+1 = i
//        System.out.println(--i); //i-1 = i
//        System.out.println(i<j);
//        System.out.println(i>j);
//        System.out.println(i>=j);
        int i = 10;
//        System.out.println(i<<3);//i*2^2 = 10*4=40
//        System.out.println(i>>2);//i/2^2 = 10/4=2

//        System.out.println(i&j); //1010
//                                10100
//                                -----
//                                00000
//        System.out.println(i|j);
        /**
         *      1010
         *      1010
         *     -----
         *     1010
         *
         */

        int j = 0;
//
//        if(i>0 || j>0){
//            System.out.println("both are not zero");
//        }else {
//            System.out.println("in else");
//        }

        String ot = i>0 || j>0?"both are not zero":"in else";
        System.out.println(ot);

    }
}
