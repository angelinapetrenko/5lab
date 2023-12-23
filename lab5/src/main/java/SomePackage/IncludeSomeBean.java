package SomePackage;
import Injectable.AutoInjectable;

public class IncludeSomeBean {
    @AutoInjectable
    private SomeOtherInterface field;
    public void doSomething(){
        field.doSomeOther();
    }
}
