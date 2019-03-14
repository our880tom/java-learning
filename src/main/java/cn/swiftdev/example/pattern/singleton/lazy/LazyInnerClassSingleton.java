package cn.swiftdev.example.pattern.singleton.lazy;

//理解内部类的执行逻辑
public class LazyInnerClassSingleton {

    private static class LazyHolder{
        private static final LazyInnerClassSingleton instance = new LazyInnerClassSingleton();
    }
    private LazyInnerClassSingleton(){
        //不允许反射对象
        if (LazyHolder.instance != null){
            throw new RuntimeException("不允许构建多个实例");
        }
    }

    public static final LazyInnerClassSingleton getInstance(){
        return LazyHolder.instance;
    }

    //重写readResole方法，只不过是覆盖了反序列化出来的对象
    //还是创建了两次，发生在jvm层面，相对来说比较安全
    //之前反序列化出来的对象会被GC掉
    private Object readResolve(){
        return LazyHolder.instance;
    }


}
