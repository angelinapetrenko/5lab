package manyParent;

import Injectable.AutoInjectable;

public class Many extends ManyParent {
    @AutoInjectable
    private IManyParentField field;
    @Override
    public int getValue(){
        return field.getValue() + super.getValue();
    }
}
