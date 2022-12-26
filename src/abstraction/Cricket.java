package abstraction;

import java.util.Arrays;

public class Cricket extends AbstractSports{
    @Override
    public void absPlay() {
        System.out.println("In abs play");
    }

    public static void main(String[] args) {
        Cricket obj = new Cricket();
        obj.exercise();
        obj.absPlay();

    }

    @Override
    public void play() {
        System.out.println("In play");
    }
}
