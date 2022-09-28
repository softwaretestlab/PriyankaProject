package JavaOOPSconcepts;

import org.junit.jupiter.api.Test;

public class AT04_Encapsulation02 {
    @Test
    public void envMethod03(){
        AT03_Encapsulation01 obj = new AT03_Encapsulation01();
        obj.envMethod01(10,20);
        obj.envMethod01(30,40);
        //method 2 of AT03_Encapsulation01 which is returing an integer
        int p = obj.envMethod02(50,50);
        System.out.println("p value : "+p);
        int z = 50*p;
        System.out.println("Value of Z is : "+ z);
    }
}
