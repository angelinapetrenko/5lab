package oneParent;

import Injectable.AutoInjectable;

public class One extends OneParent {

    @AutoInjectable
    private IOneParentField field;

    @Override
    public int getValue(){
        return field.getValue() + super.getValue();
    }

}
