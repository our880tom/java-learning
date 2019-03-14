package cn.swiftdev.example.pattern.singleton.hungry;

/**
 * 由于在类创建的时候就初始化了，所以，线程是安全的
 */
public class HungryStaticSingleton {

    private static final HungryStaticSingleton instance;

    static {
        instance  = new HungryStaticSingleton();
    }

    private HungryStaticSingleton(){

    }

    private static HungryStaticSingleton getInstance(){
        return instance;
    }
}
