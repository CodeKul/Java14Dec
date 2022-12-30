package statickeyword;

public class Outer {
    int i=10;

    class Inner{
         static class Show{
            int i=20;
         }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        System.out.println(outer.i);

        Inner inner = new Outer().new Inner();

        Inner.Show show = new Inner.Show();
        System.out.println(show.i);

//        Inner inner = new Outer.Inner();
//        System.out.println(inner.i);

//        System.out.println(Outer.Inner.i);
    }
}
