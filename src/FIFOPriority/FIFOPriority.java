package FIFOPriority;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class FIFOPriority {
    private final List<FIFOElement> values = new ArrayList<>();

    public void push(String element, int priority){
        this.values.add(new FIFOElement(element,priority));
    }

    public String popFirst(){
        if(values.size()==0){
            throw new EmptyStackException();
        }
        String result=this.values.get(0).getValue();
        this.values.remove(0);
        return result;
    }

    public String popHighThree(){
        return popHighestInRange(3);
    }

    public String popHighest(){
        return popHighestInRange(this.values.size());
    }

    private String popHighestInRange(int n){
        if(values.size()==0){
            throw new EmptyStackException();
        }
        FIFOElement max= this.values.get(0);
        for(int i=1;i<n;i++){
            if(i==values.size()){
                break;
            }
            FIFOElement actualEl= values.get(i);
            if(max.getPriority()<actualEl.getPriority()){
                max=actualEl;
            }
        }
        return max.getValue();
    }
}
