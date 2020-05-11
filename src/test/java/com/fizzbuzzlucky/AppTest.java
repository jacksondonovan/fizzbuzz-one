package com.fizzbuzzlucky;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

import com.fizzbuzzlucky.FizzBuzzLucky;

public class AppTest {
    @Test

	public void shouldCountFrequencies() {
		FizzBuzzLucky fizzBuzzTwo = new FizzBuzzLucky();
		int[] answerOne = {5,3,1,11};
		int[] answerTwo = {6,3,2,13};
		int[] inQuestionOne = fizzBuzzTwo.printFizzBuzz(1, 20);
		int[] inQuestionTwo = fizzBuzzTwo.printFizzBuzz(10, 33);

        assertArrayEquals(inQuestionOne, answerOne);
		assertArrayEquals(inQuestionTwo, answerTwo);
    }
}
