package cn.swiftdev.example.pattern.prototype.simple;

public class Client {
    public Prototype startClone(Prototype conretePrototype){
        return conretePrototype.clone();
    }
}
