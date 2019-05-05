package com.coding.staircase;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StaircaseTest {

		private final static int UniqueWaysToClimbFourStairsByOneOrTwoSteps = 5;
		private final static int UniqueWaysToClimbThreeStairsByOneOrTwoSteps = 3;
		private final static int UniqueWaysToClimbTenStairsByOneThreeOrFiveSteps = 47;

		private final static int FOUR = 4;
		private final static int THREE = 3;
		private final static int TEN = 10;

		@Test
		public void fourStairsOneOrTwoSteps(){
				Assert.assertEquals(UniqueWaysToClimbFourStairsByOneOrTwoSteps, Staircase.climbByOneOrTwoSteps(FOUR));
		}

		@Test
		public void zeroStairsOneOrTwoSteps(){
				Assert.assertEquals(UniqueWaysToClimbFourStairsByOneOrTwoSteps, Staircase.climbByOneOrTwoSteps(FOUR));
		}

		@Test
		public void threeStairsOneOrTwoSteps(){
				Assert.assertEquals(UniqueWaysToClimbThreeStairsByOneOrTwoSteps, Staircase.climbByOneOrTwoSteps(THREE));
		}

		@Test
		public void tenStairsOneThreeOrFiveSteps(){
				Set<Integer> set = new HashSet<Integer>(Arrays.asList(1, 3, 5));
				Assert.assertEquals(UniqueWaysToClimbTenStairsByOneThreeOrFiveSteps, Staircase.climbByListSteps(TEN, set));
		}
}
