package project1;

public class Calculator {

     // addition scenario
     public Integer add(Integer first, Integer second){
          return first + second;
     }

     // division scenario
     public Integer divide(Integer first,Integer second){
          if(second == 0){
               throw new IllegalArgumentException("Cannot divide by 0");
          } else {
               return first/second;
          }
     }
}
