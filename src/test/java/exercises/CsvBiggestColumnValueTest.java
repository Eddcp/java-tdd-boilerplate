package exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CsvBiggestColumnValueTest {

    @InjectMocks
    CsvBiggestColumnValue csvBiggestColumnValue;

    @BeforeAll
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void test_max_integer() {
        int result = csvBiggestColumnValue.solution("id,name,age,act.,room,dep.\n1,Jack,68,T,13,8\n17,Betty,28,F,15,7", "age");
        Assertions.assertEquals(68, result);
    }
}
