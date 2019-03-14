package cn.swiftdev.example.pattern.singleton.lazy;

/**
 * Double Check的懒汉式单例
 */
public class LazyDoubleCheckSingleton {

    private static volatile LazyDoubleCheckSingleton instance = null;

    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getInstance(){
        if (instance == null){
            synchronized (LazySimpleSingleton.class){
                if (instance == null){
                    instance = new LazyDoubleCheckSingleton();
                    //CPU转换成指令jvm指令执行
                    //2、3可能重排
                    //1、分配内存给对象
                    //2、初始化对象
                    //3、将初始化好的内存地址和内存地址建立关联，赋值
                    //4、用户初次使用
                }
            }

        }

        return instance;
    }


}
