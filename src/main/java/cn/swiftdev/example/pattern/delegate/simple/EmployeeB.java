package cn.swiftdev.example.pattern.delegate.simple;

public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("登陆我做的");
    }
}
