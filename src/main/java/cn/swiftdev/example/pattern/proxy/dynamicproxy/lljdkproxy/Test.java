package cn.swiftdev.example.pattern.proxy.dynamicproxy.lljdkproxy;

public class Test {

    public static void main(String[] args) throws Exception {
        Human human  = (Human) new LLMeipo().getInstance(new HumanImpl());
        human.live("xxx");
    }
}
