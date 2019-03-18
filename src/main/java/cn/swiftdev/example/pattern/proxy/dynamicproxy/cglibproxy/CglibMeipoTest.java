package cn.swiftdev.example.pattern.proxy.dynamicproxy.cglibproxy;

public class CglibMeipoTest {

    public static void main(String[] args) throws Exception {
        Customer customer = (Customer) new CglibMeipo().getInstance(Customer.class);
        customer.findLove();
    }
}
