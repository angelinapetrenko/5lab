package manyParent;

import Injectable.AutoInjectable;

public class ManyParent {

    @AutoInjectable
    private IManyParentField parentField;

    public int getValue(){
        return parentField.getValue();
    }

}
