package project1test;

import org.junit.jupiter.api.*;
import org.opentest4j.TestAbortedException;
import project1.Calculator;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;

@DisplayName("Test for calculator class")
public class CalculatorTest {

     public Calculator calculator = new Calculator();

     @BeforeAll
     public static void beforeAll(){
          System.out.println("-- Before all -- ");
     }

     @AfterAll
     public static void afterAll(){
          System.out.println("-- After all --");
     }

     @BeforeEach
     void setUp(){
          System.out.println("-- Before each -- ");
     }

     @AfterEach
     void tearDown(){
          System.out.println("-- After each--");
     }

     @Test
     @DisplayName("Scenario success for addition method(integer, integer ")
     void testAddSuccess(){
          int result = calculator.add(10, 15);
          assertEquals(25, result);
     }

     @Test
     @DisplayName("Scenario success for division method(integer, integer")
     void testDivisionSuccess(){
          int result = calculator.divide(10, 2);
          assertEquals(5, result);
     }

     @Test
     @DisplayName("Scenario failed for division method(integer, integer")
     void testDivisionFailed(){
          assertThrows(IllegalArgumentException.class, () -> {
               calculator.divide(10, 0);
          });
     }

     //If we want to cancel the test for whatever reason use TestAbortedException (manual approach)
     @Test
     void testAborted(){
          var profile = System.getenv("PROFILE");
          if(!"DEV".equals(profile)){
               throw new TestAbortedException("Test aborted. Not DEV");
          }
     }

     // If we want to test the assumption for whatever reason use assumption.
     // It will throw TestAbortedException we don't have to do it manually
     @Test
     void testAssumption(){
          assumeTrue("DEV".equals(System.getenv("PROFILE")));
     }


}
