package project1test;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS) // Class level annotation
public class FirstTestClass {

     @BeforeAll
     void beforeAll(){
          System.out.println("-- Before all method --");
     }

     @BeforeEach
     void beforeEach(){
          System.out.println("-- Before each method --");
     }

     @AfterAll
     void afterAll(){
          System.out.println("-- After all method --");
     }

     @AfterEach
     void afterEach(){
          System.out.println("-- After each method --");
     }

     @Test
     void firstMethod(){
          System.out.println("This is the first test method");
     }

     @Test
     @DisplayName("BE1234 - TC12 - this method is the second one") // test case scenario to provide more info
     void secondMethod(){
          System.out.println("This is the second test method ");
     }
}
