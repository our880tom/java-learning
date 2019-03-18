package cn.swiftdev.example.pattern.proxy.staticproxy;

import cn.swiftdev.example.pattern.proxy.Person;

public class Father implements Person {
    private Son son;

    public Father(Son son){
        this.son = son;
    }
    public void findLove() {
        System.out.println("父母物色对象");
        son.findLove();
        System.out.println("双方父母统一，确立关系");
    }
}
