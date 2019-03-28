package cn.swiftdev.example.pattern.observer.gperguava;

import com.google.common.eventbus.EventBus;

public class ObserverTest {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new Teacher("liang"));
        GPer gPer = GPer.getInstance();
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者设计模式适用于哪些场景？");
        gPer.publishQuestion(question);
        eventBus.post(question);




    }
}
