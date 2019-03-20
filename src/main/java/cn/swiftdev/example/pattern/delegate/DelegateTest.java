package cn.swiftdev.example.pattern.delegate;

import cn.swiftdev.example.pattern.delegate.simple.Boss;
import cn.swiftdev.example.pattern.delegate.simple.Leader;

public class DelegateTest {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.cammand("登陆", new Leader());
    }
}
