package cn.swiftdev.example.pattern.observer.gperadvice;

/**
 * 单例非线程安全的
 */
public class GPer {


    private static GPer gPer= null;

    private GPer(){

    }

    public static GPer getInstance(){
        if (gPer == null){
            gPer = new GPer();
        }

        return gPer;
    }

}
