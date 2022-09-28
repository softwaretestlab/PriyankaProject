package JavaOOPSconcepts;

import org.junit.jupiter.api.Test;

public class AT07_InHeritance03 {
    @Test
    public void inhMethod05() {
        AT06_InHeritance02 obj = new AT06_InHeritance02();
        //these 2 are called from parent
        obj.inhMethod01();
        obj.inhMethod02();
//these 2 are called from child
        obj.inhMethod03();
        obj.inhMethod04();

    }
    @Test
    public void inhMethod06() {
        AT05_InHeritance01 obj1= new AT05_InHeritance01();
        obj1.inhMethod03();
        }
    }

