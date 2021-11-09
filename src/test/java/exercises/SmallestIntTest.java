package exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SmallestIntTest {

    @InjectMocks
    SmallestInt smallestInt;

    @BeforeAll
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void test_small_int() {
        int [] array = {1,2,3};
        int result = smallestInt.solution(array);
        Assertions.assertEquals(4, result);
    }

    @Test
    void test_empty_array() {
        int [] array = {};
        int result = smallestInt.solution(array);
        Assertions.assertEquals(1, result);
    }

    @Test
    void test_negative_array() {
        int [] array = {-1,-2,-3};
        int result = smallestInt.solution(array);
        Assertions.assertEquals(1, result);
    }

    @Test
    void test_array_starting_with_two() {
        int [] array = {2,3,4,5};
        int result = smallestInt.solution(array);
        Assertions.assertEquals(1, result);
    }
}
