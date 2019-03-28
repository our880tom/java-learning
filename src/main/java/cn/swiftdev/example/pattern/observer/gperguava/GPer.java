package cn.swiftdev.example.pattern.observer.gperguava;

public class GPer {
    private String name = "GPer生态圈";

    private static GPer gPer = null;

    public String getName() {
        return name;
    }

    private GPer(){}

    public static GPer getInstance(){
        if (gPer == null){
            gPer = new GPer();
        }

        return gPer;
    }

    public void publishQuestion(Question question){
        System.out.println(question.getUserName() + "在" + this.name + "上提交了一个问题。");
    }

}
