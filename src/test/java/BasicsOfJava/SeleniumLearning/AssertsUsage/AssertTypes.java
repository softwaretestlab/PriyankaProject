package BasicsOfJava.SeleniumLearning.AssertsUsage;


import org.junit.Assert;

public class AssertTypes {

        public static void CompareNassert(String ExpectedValue, String ActualValue) {

                Assert.assertEquals(ExpectedValue, ActualValue);
        }

        public static void ContainsCheck(String EntireString, String ValueToappear ) {

                Assert.assertTrue(EntireString.contains(ValueToappear));
        }
}