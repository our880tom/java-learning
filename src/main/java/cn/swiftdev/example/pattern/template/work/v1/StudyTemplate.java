package cn.swiftdev.example.pattern.template.work.v1;

public interface StudyTemplate {
    void readBook();

    void doHomework();

    default void study(){
        readBook();
        doHomework();
    }
}
