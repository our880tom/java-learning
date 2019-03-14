package cn.swiftdev.example.pattern.singleton.register;

public enum  EnumSingleton {

    INSTANCE;

    private Object data;

    public EnumSingleton getInstance(){
        return INSTANCE;
    }
}
