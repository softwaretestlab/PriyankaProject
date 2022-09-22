package BasicsOfJava;

import org.junit.jupiter.api.Test;

public class AT02_LearnAboutMethod_JUnit {
    // this is how we create a method  test01,test02
    //here @Test is junit annotation--this is used for executing test cases
    @Test
    public void test01(){
        System.out.println("this is method 01");
    }

    @Test
    public void test02(){
        System.out.println("this is method 02");
    }
}
