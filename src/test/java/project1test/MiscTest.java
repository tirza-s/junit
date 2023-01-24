package project1test;

import org.junit.jupiter.api.*;

// Inner nested test

public class MiscTest {

     @Test
     @Timeout(5)
     void timeOut() throws InterruptedException {
          System.out.println("This is the test with timeout");
          Thread.sleep(6000);
     }

     @Test
     @Timeout(90)
     @DisplayName("This is the nice method")
     @Tag("theTag")
     void annotatedMethod1(){
          System.out.println("This is the annotated method");
     }

    @MyAnnotation
     void annotatedMethod2 () throws InterruptedException {
          System.out.println("This is the custom annotated method");
          Thread.sleep(3000);
     }

     @TestInstance(TestInstance.Lifecycle.PER_CLASS) // with this annotation you don't need to put public static at @beforeAll method
     @Nested
     class nestedTest{

          @BeforeAll
          void beforeAll(){
               System.out.println("Before all in nested test");
          }

          @Test
          void nestedTestMethod(){
               System.out.println("Nested test method");
          }
     }
}
