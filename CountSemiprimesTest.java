import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountSemiprimesTest {
    @Test
    void solution() {
        //Example input small
        int[] P1 = {1,4,16};
        int[] Q1 = {26,10,20};
        int[] result1 = {10,4,0};
        assertArrayEquals(result1,CountSemiprimes.solution(26,P1,Q1));

        //Extreme input, full range
        int[] P2 = {1};
        int[] Q2 = {50000};
        int[] result2 = {12110};
        assertArrayEquals(result2,CountSemiprimes.solution(50000,P2,Q2));

        //Extreme input, all same number
        int[] P3 = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        int[] Q3 = {5,5,5,5,5,5,5,5,5,5,5,5,5,5,5};
        int[] result3 = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        assertArrayEquals(result3,CountSemiprimes.solution(5,P3,Q3));

        //Sample inout, random numbers
        int[] P4 = {65,90,12,1,76,45,1100,450,654,1111,5600,5,3,44};
        int[] Q4 = {100,450,14,67,99,563,4000,670,912,2049,5600,47,6,90};
        int[] result4 = {12,108,1,23,9,161,783,62,76,267,0,15,2,15};
        assertArrayEquals(result4,CountSemiprimes.solution(5600,P4,Q4));
    }
}