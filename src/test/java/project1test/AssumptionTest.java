package project1test;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class AssumptionTest {

     @ParameterizedTest(name = "Run {index} - value : {arguments}") // Improve the display in the console
     @ValueSource(ints = {1, 5, 6})
     void intValue(int theParams){
          Assumptions.assumeTrue(theParams > 4);
          System.out.println("theParams = " + theParams);
     }

     @ParameterizedTest
     @CsvSource(value = {"sponge, bob", "tin, tin", "winnie, the poo"})
     void csvSource_StringsString(String param1, String param2){
          Assumptions.assumeFalse(param1.equals("sponge"), "The assumption failed for the " +
                  " following param : "+ param2);
          System.out.println("param1 = " + param1 + ", param2 = " + param2);
     }

}
