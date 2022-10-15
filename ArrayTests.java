import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

@Test 
	public void testReverseInPlaceEvenNumList() {
    int[] input1 = {2,3,4,5,6,7,8,9};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 9,8,7,6,5,4,3,2 }, input1);
	}

@Test 
	public void testReverseInPlaceOddNumList() {
    int[] input1 = {3,4,5,6,7,8,9};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 9,8,7,6,5,4,3}, input1);
	}

  @Test
  public void testReversed2() {
    int[] input1 = {1,2,3,4 };
    assertArrayEquals(new int[]{ 4,3,2,1}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReversed3() {
    int[] input1 = {100,300,500, 700};
    assertArrayEquals(new int[]{ 700,500,300,100}, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] inputArray1 = {5,6,7,8,9,4,9,6,5};
    assertEquals(6.875, ArrayExamples.averageWithoutLowest(inputArray1),0.000);
  }

  @Test
  public void testAverageWithoutLowestMultipleLowests() {
    double[] inputArray1 = {5,6,7,8,9,4,9,6,5,4,4,4};
    assertEquals(6.875, ArrayExamples.averageWithoutLowest(inputArray1),0.000);
  }



}
