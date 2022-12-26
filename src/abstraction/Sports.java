package abstraction;

public interface Sports extends Sports2{

    public abstract void play();//declared , incomplete

//  public abstract void play2();
}

/**
 *       abstract class                              interface
 *
 * 1.abstract class can extends to another class    1. implements
 *
 * 2.partial abstraction                            2. 100% abstraction
 *
 * 3.private,protected methods allowed              3.only public(from java 9 private)
 *
 * 4.multiple inheritance not supported             4.multiple inheritance supported
 *
 * 5.abstract and non-abstract methods              5. only abstract(from java 8 default and static)
 *
 */