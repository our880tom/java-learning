package cn.swiftdev.example.pattern.delegate.simple;

public class Boss {

    public void cammand(String command, Leader leader){
        leader.doing(command);
    }
}
