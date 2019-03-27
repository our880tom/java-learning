package cn.swiftdev.example.pattern.template.work.v1;

public class StudyEnglish implements StudyTemplate {
    @Override
    public void readBook() {
        System.out.println("读英语");
    }

    @Override
    public void doHomework() {
        System.out.println("做英语作业");
    }
}
