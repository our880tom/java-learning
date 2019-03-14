package cn.swiftdev.example.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private static Map<String, Object> ioc = new ConcurrentHashMap<String, Object>();

    private ContainerSingleton(){

    }

    //有线程安全问题
    public synchronized static   Object getBean(String className){
        if (!ioc.containsKey(className)){
            Object obj = null;
            try{
                obj = Class.forName(className).newInstance();
                ioc.put(className, obj);
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        return ioc.get(className);
    }


}
