package polymorphism;

public class PolymorphismDemo {

    public static void main(String[] args) {
        PolymorphismDemo obj = new PolymorphismDemo();
        obj.add(7, 9,8);
        obj.add(7, 9,8);

    }

    public void add(int i, int j) {
        System.out.println(i + j);
    }

    public void add(int i, int j,int k) {
        System.out.println(i + j+k);
    }
}
