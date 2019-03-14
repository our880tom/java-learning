package cn.swiftdev.example.pattern.prototype.simple;

import java.util.ArrayList;

public class PrototypeTest {

    public static void main(String[] args){
        ConcretePrototype prototype = new ConcretePrototype();
        prototype.setAge(18);
        prototype.setName("prototype");
        prototype.setHobbies(new ArrayList<String>());

        Client client = new Client();
        ConcretePrototype prototypeClone = (ConcretePrototype) client.startClone(prototype);

        System.out.println(prototypeClone);
        System.out.println("克隆对象中引用的值：" + prototypeClone.getHobbies());
        System.out.println("原对象中引用的值：" + prototype.getHobbies());
        System.out.println("对象地址比较：" + (prototype.getHobbies() == prototypeClone.getHobbies()));

    }
}
