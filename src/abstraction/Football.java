package abstraction;

import java.io.FileOutputStream;

/**
 * abstraction - hiding details and showing functionality
 *
 */
public class Football implements Sports,Sports2{
    @Override
    public void play() {
        System.out.println("in football");
    }

    public static void main(String[] args) {
        Football obj = new Football();
        obj.play();
    }

}
