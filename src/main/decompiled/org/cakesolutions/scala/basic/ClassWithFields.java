package org.cakesolutions.scala.basic;

import scala.reflect.*;

@ScalaSignature(bytes = "\u0006\u0001}2A!\u0001\u0002\u0001\u0017\ty1\t\\1tg^KG\u000f\u001b$jK2$7O\u0003\u0002\u0004\t\u0005)!-Y:jG*\u0011QAB\u0001\u0006g\u000e\fG.\u0019\u0006\u0003\u000f!\tQbY1lKN|G.\u001e;j_:\u001c(\"A\u0005\u0002\u0007=\u0014xm\u0001\u0001\u0014\u0005\u0001a\u0001CA\u0007\u0010\u001b\u0005q!\"A\u0003\n\u0005Aq!AB!osJ+g\rC\u0003\u0013\u0001\u0011\u00051#\u0001\u0004=S:LGO\u0010\u000b\u0002)A\u0011Q\u0003A\u0007\u0002\u0005!9q\u0003\u0001b\u0001\n\u0003A\u0012aA1hKV\t\u0011\u0004\u0005\u0002\u000e5%\u00111D\u0004\u0002\u0004\u0013:$\bBB\u000f\u0001A\u0003%\u0011$\u0001\u0003bO\u0016\u0004\u0003bB\u0010\u0001\u0001\u0004%\t\u0001I\u0001\u0005]\u0006lW-F\u0001\"!\t\u0011s%D\u0001$\u0015\t!S%\u0001\u0003mC:<'\"\u0001\u0014\u0002\t)\fg/Y\u0005\u0003Q\r\u0012aa\u0015;sS:<\u0007b\u0002\u0016\u0001\u0001\u0004%\taK\u0001\t]\u0006lWm\u0018\u0013fcR\u0011Af\f\t\u0003\u001b5J!A\f\b\u0003\tUs\u0017\u000e\u001e\u0005\ba%\n\t\u00111\u0001\"\u0003\rAH%\r\u0005\u0007e\u0001\u0001\u000b\u0015B\u0011\u0002\u000b9\fW.\u001a\u0011\t\u000fQ\u0002!\u0019!C\u00051\u00051q/Z5hQRDaA\u000e\u0001!\u0002\u0013I\u0012aB<fS\u001eDG\u000f\t\u0005\bq\u0001\u0001\r\u0011\"\u0003!\u0003\u001d\u0019XO\u001d8b[\u0016DqA\u000f\u0001A\u0002\u0013%1(A\u0006tkJt\u0017-\\3`I\u0015\fHC\u0001\u0017=\u0011\u001d\u0001\u0014(!AA\u0002\u0005BaA\u0010\u0001!B\u0013\t\u0013\u0001C:ve:\fW.\u001a\u0011")
public class ClassWithFields
{
    private final int age;
    private String name;
    private final int weight;
    private String surname;
    
    public int age() {
        return this.age;
    }
    
    public String name() {
        return this.name;
    }
    
    public void name_$eq(final String x$1) {
        this.name = x$1;
    }
    
    private int weight() {
        return this.weight;
    }
    
    private String surname() {
        return this.surname;
    }
    
    private void surname_$eq(final String x$1) {
        this.surname = x$1;
    }
    
    public ClassWithFields() {
        this.age = 21;
        this.name = "John";
        this.weight = 90;
        this.surname = "Doe";
        this.name_$eq("Jane");
        this.surname_$eq("Fonda");
    }
}
