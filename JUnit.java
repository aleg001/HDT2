import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class JUnit {

    ImplementacionStack<Integer> op = new ImplementacionStack<Integer>();
    @Test
    public void StackUsar(){
        op.push(10);
        assertEquals(op.peek(), 10);
        
    }    
    

}
