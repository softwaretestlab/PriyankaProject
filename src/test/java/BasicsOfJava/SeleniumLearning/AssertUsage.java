package BasicsOfJava.SeleniumLearning;

import BasicsOfJava.SeleniumLearning.AssertsUsage.AssertTypes;
import org.junit.Test;

public class AssertUsage {
    @Test
    public void compareLearning(){
        String expectedValue="test";
        String actualValue="tesgt";
        AssertTypes.CompareNassert(expectedValue,actualValue);

    }
        @Test
        public void containsLearning(){
        String TitleName= "Software Test Lab";
        String ExpectedVal= "Test";
        AssertTypes.ContainsCheck(TitleName,ExpectedVal);

    }


}
