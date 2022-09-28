package LoopsNConditionalStatments;

import org.junit.jupiter.api.Test;

public class AT03_DoWhileLoop {
    @Test
    public void DoWhileLoopLearn() {
        int ticket = 74;
        do {
            System.out.println("Current Ticket Number is : "+ticket);
            ticket++;
        } while (ticket<=80);
    }
}

