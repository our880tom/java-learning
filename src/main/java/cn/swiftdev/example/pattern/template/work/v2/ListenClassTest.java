package cn.swiftdev.example.pattern.template.work.v2;

public class ListenClassTest {
    public static void main(String[] args) {
        ListenClass listenClass = new ListenClass();
        listenClass.listen(new ListenCallback() {
            @Override
            public void readbook() {
                System.out.println("读英语书");
            }

            @Override
            public void doHomework() {
                System.out.println("写英语作业");
            }
        });
    }
}
