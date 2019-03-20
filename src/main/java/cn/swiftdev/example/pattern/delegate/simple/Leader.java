package cn.swiftdev.example.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

public class Leader implements IEmployee{
    private Map<String, IEmployee> commands = new HashMap<>();
    public Leader(){
        commands.put("加密",new EmployeeA());
        commands.put("登陆", new EmployeeB());
    }
    @Override
    public void doing(String command) {
        commands.get(command).doing(command);
    }
}
