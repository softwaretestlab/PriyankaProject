package BasicsOfJava;

import org.junit.Test;

public class AT03_StringInt {

    @Test
    public void test03(){
        //declare local variables
        int i=10;
        int j=20;
        int k = i+j; //op-->30
        System.out.println("Value of K is : "+k);

    }

    @Test
    public void test04(){
        //declare local variables
        String test01 ="Software";
        String test02 ="testlab";
        String test03 = test01 + test02;
        System.out.println("value of Test03 is : " + test03);

    }

}
