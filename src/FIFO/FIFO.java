package FIFO;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class FIFO {
    private final List<String> values = new ArrayList<>();

    public void push(String w){
        this.values.add(w);
    }

    public String pop(){
        if(this.values.size()==0){
            throw new EmptyStackException();
        }
        String result=this.values.get(0);
        this.values.remove(0);
        return result;
    }
}
