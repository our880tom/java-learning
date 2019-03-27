package cn.swiftdev.example.pattern.adapter.work;

public class NewspaperAdapter  implements paper{

    private Newspaper newspaper;

    public NewspaperAdapter(Newspaper newspaper) {
        this.newspaper = newspaper;
    }

    @Override
    public void read() {
        newspaper.readNewPaper();
    }


}
