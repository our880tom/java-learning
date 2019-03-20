package cn.swiftdev.example.pattern.delegate.simple;

public class EmployeeA implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我加密厉害");
    }
}
