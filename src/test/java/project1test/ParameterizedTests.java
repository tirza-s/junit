package project1test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class ParameterizedTests {

     @ParameterizedTest(name = "Run {index} - value : {arguments}") // Improve the display in the console
     @ValueSource(ints = {1, 5, 6})
     void intValue(int theParams){
          System.out.println("theParams = " + theParams);
     }

     @ParameterizedTest
     @NullAndEmptySource
     //@EmptySource --> doesn't work for primitive data type
     @ValueSource(strings = {"firstString", "secondString"})
     void stringValue(String theParams){
          System.out.println("theParams = " + theParams);
     }

     @ParameterizedTest
     @CsvSource(value = {"sponge, bob", "tin, tin", "winnie, the poo"})
     void csvSource_StringsString(String param1, String param2){
          System.out.println("param1 = " + param1 + ", param2 = " + param2);
     }

}
