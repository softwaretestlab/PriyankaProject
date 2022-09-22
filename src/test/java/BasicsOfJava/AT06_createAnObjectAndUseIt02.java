package BasicsOfJava;

import org.junit.jupiter.api.Test;

public class AT06_createAnObjectAndUseIt02 {
    @Test
    public void test10(){
        AT02_LearnAboutMethod_JUnit obj = new AT02_LearnAboutMethod_JUnit();
        obj.test01();
        obj.test02();

        AT05_createAnObjectAndUseIt01 obj1=new AT05_createAnObjectAndUseIt01();
        obj1.test07();

    }
}
