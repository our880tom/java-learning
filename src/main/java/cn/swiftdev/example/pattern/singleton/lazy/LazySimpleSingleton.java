package cn.swiftdev.example.pattern.singleton.lazy;

/**
 * 非线程安全的懒汉式单例
 */
public class LazySimpleSingleton {

    private static LazySimpleSingleton instance = null;

    private LazySimpleSingleton(){

    }

//    public static LazySimpleSingleton getInstance(){
//        if (instance == null){
//            instance = new LazySimpleSingleton();
//        }
//
//        return instance;
//    }

    //jdk1.8之后对synchronized性能优化了不少
    //不可避免地还是存在性能的问题
    public synchronized static LazySimpleSingleton getInstance(){
        if (instance == null){
            instance = new LazySimpleSingleton();
        }

        return instance;
    }


}
