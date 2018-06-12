package codingdojo.fizzbuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {
  /**
   * Given I have input 1
   * When I call FizzBuzz
   * Then I will be able to get 1
   */
  @Test
  public void testGivenInput1WhenFizzBuzzThenCanGet1() {
    final int input = 1;

    final String expected = FizzBuzz.getFizzBuzz(input);

    assertEquals("1", expected);
  }

  /**
   * Given I have input 2
   * When I call FizzBuzz
   * Then I will be able to get 2
   */
  @Test
  public void testGivenInput2WhenFizzBuzzThenCanGet2() {
    final int input = 2;

    final String expected = FizzBuzz.getFizzBuzz(input);

    assertEquals("2", expected);
  }

  /**
   * Given I have input 3
   * When I call FizzBuzz
   * Then I will be able to get Fizz
   */
  @Test
  public void testGivenInput3WhenFizzBuzzThenCanGetFizz() {
    final int input = 3;

    final String expected = FizzBuzz.getFizzBuzz(input);

    assertEquals("Fizz", expected);
  }


  /**
   * Given I have input 6
   * When I call FizzBuzz
   * Then I will be able to get Fizz
   */
  @Test
  public void testGivenInput6WhenFizzBuzzThenCanGetFizz() {
    final int input = 6;

    final String expected = FizzBuzz.getFizzBuzz(input);

    assertEquals("Fizz", expected);
  }

  /**
   * Given I have input 5
   * When I call FizzBuzz
   * Then I will be able to get Buzz
   */
  @Test
  public void testGivenInput5WhenFizzBuzzThenCanGetBuzz() {
    final int input = 5;

    final String expected = FizzBuzz.getFizzBuzz(input);

    assertEquals("Buzz", expected);
  }

  /**
   * Given I have input 10
   * When I call FizzBuzz
   * Then I will be able to get Buzz
   */
  @Test
  public void testGivenInput10WhenFizzBuzzThenCanGetBuzz() {
    final int input = 10;

    final String expected = FizzBuzz.getFizzBuzz(input);

    assertEquals("Buzz", expected);
  }

  /**
   * Given I have input 15
   * When I call FizzBuzz
   * Then I will be able to get FizzBuzz
   */
  @Test
  public void testGivenInput10WhenFizzBuzzThenCanGetFizzBuzz() {
    final int input = 15;

    final String expected = FizzBuzz.getFizzBuzz(input);

    assertEquals("FizzBuzz", expected);
  }

  /**
   * Given I have input 30
   * When I call FizzBuzz
   * Then I will be able to get FizzBuzz
   */
  @Test
  public void testGivenInput30WhenFizzBuzzThenCanGetFizzBuzz() {
    final int input = 30;

    final String expected = FizzBuzz.getFizzBuzz(input);

    assertEquals("FizzBuzz", expected);
  }

  /**
   * Given I have input 7
   * When I call FizzBuzz
   * Then I will be able to get Whizz
   */
  @Test
  public void testGivenInput7WhenFizzBuzzThenCanGetWhizz() {
    final int input = 7;

    final String expected = FizzBuzz.getFizzBuzz(input);

    assertEquals("Whizz", expected);
  }

  /**
   * Given I have input 14
   * When I call FizzBuzz
   * Then I will be able to get Whizz
   */
  @Test
  public void testGivenInput14WhenFizzBuzzThenCanGetWhizz() {
    final int input = 14;

    final String expected = FizzBuzz.getFizzBuzz(input);

    assertEquals("Whizz", expected);
  }

  /**
   * Given I have input 13
   * When I call FizzBuzz
   * Then I will be able to get Fizz
   */
  /**
  @Test
  public void testGivenInput13WhenFizzBuzzThenCanGetFizz() {
    final int input = 13;

    final String expected = FizzBuzz.getFizzBuzz(input);

    assertEquals("Fizz", expected);
  }

  /**
   * Given I have input 23
   * When I call FizzBuzz
   * Then I will be able to get Fizz
   */
  /**
  @Test
  public void testGivenInput23WhenFizzBuzzThenCanGetFizz() {
    final int input = 23;

    final String expected = FizzBuzz.getFizzBuzz(input);

    assertEquals("Fizz", expected);
  }

  /**
   * Given I have input 33
   * When I call FizzBuzz
   * Then I will be able to get Fizz
   */
  /**
  @Test
  public void testGivenInput33WhenFizzBuzzThenCanGetFizz() {
    final int input = 33;

    final String expected = FizzBuzz.getFizzBuzz(input);

    assertEquals("Fizz", expected);
  }

  /**
   * Given I have input 31
   * When I call FizzBuzz
   * Then I will be able to get Fizz
   */
  /**
  @Test
  public void testGivenInput31WhenFizzBuzzThenCanGetFizz() {
    final int input = 31;

    final String expected = FizzBuzz.getFizzBuzz(input);

    assertEquals("Fizz", expected);
  }*/
}