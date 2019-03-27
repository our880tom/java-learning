package cn.swiftdev.example.pattern.template.work.v2;

public class ListenClass {
    void listen(ListenCallback listenCallback){
        listenCallback.readbook();
        listenCallback.doHomework();
    }
}
