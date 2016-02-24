package dcll.tbil;


import java.util.ArrayList;
import java.util.EmptyStackException;

/**
 * Created by tbmb on 24/02/16.
 */
public class Stack implements SimpleStack {

    private ArrayList<Item> stack;

    public Stack(){
        stack = new ArrayList<Item>();
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int getSize() {
        return stack.size();
    }

    @Override
    public void push(Item item) {
        stack.add(item);
        System.out.println(stack.isEmpty());
    }

    @Override
    public Item peek() throws EmptyStackException {
        if(this.isEmpty())
            throw new EmptyStackException();
        else
            return stack.get(this.getSize() - 1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        if(this.isEmpty())
            throw new EmptyStackException();
        else{
            Item it = this.peek();
            stack.remove(this.getSize() - 1);
            return it;
        }

    }
}
