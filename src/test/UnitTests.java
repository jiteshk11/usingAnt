package test;

import org.junit.Test;
import math.MyMath;
import static org.junit.Assert.assertEquals;

public class UnitTests {
  @Test
  public void testMulti() {
    MyMath math = new MyMath();
    assertEquals(50, math.multi(5, 10));
  }
} 