package cn.swiftdev.example.pattern.prototype.deep;

public class DeepCloneTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();


        QiTianDaSheng clone = (QiTianDaSheng) qiTianDaSheng.clone();
        System.out.println("深克隆：" + (qiTianDaSheng.jinGuBang == clone.jinGuBang));

        QiTianDaSheng m = new QiTianDaSheng();
        QiTianDaSheng n = m.shallowClone();

        System.out.println("浅克隆：" + (m.jinGuBang == n.jinGuBang));


    }
}
