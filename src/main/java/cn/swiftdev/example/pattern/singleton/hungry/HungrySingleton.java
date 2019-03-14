package cn.swiftdev.example.pattern.singleton.hungry;

/**
 * 由于在类创建的时候就初始化了，所以，线程是安全的
 */
public class HungrySingleton {

    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton(){

    }

    private static HungrySingleton getInstance(){
        return instance;
    }
}
