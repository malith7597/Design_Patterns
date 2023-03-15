package Momento;

import java.util.ArrayList;
import java.util.List;

public class History {
    // needs to have a list to keep the changes.
    List<EditorState> states=  new ArrayList<>();

    // two methods.  1. push  2. pop

    public void push (EditorState state){

        states.add(state);

    }

    public EditorState pop(){
        // find last index of states
        var lastIndex= states.size()-1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }




}
