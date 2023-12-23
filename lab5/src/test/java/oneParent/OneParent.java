package oneParent;

import Injectable.AutoInjectable;

public class OneParent {

    @AutoInjectable
    private IOneParentField parentField;

    public int getValue(){
        return parentField.getValue();
    }

}
