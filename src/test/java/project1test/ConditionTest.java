package project1test;

import jdk.jfr.Enabled;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class ConditionTest {

     @Test
     @EnabledOnOs({OS.WINDOWS})
     void testRunOnlyOnWindows(){

     }

     @Test
     @DisabledOnOs({OS.WINDOWS})
     void testDisableOnlyOnWindows(){

     }
}
