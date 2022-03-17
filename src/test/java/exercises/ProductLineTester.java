package exercises;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ProductLineTester {

    @InjectMocks
    ProductVerifier productVerifier;


    @BeforeAll
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    private final ProductVerifier verifier;

    ProductLineTester(ProductVerifier verifier) {
        this.verifier = verifier;
    }

    ProductLineTestReport test(Stream<Product> products) {
        ProductLineTestReport productLineTest = new ProductLineTestReport(0,0,0,0);
        if (Objects.isNull(products) || products.findAny().isEmpty() || products.anyMatch(Objects::isNull)) {
            return productLineTest;
        }
        List<Product> sortedList = products.skip(10)
                .filter(p -> Objects.nonNull(p) && !"invalid".equalsIgnoreCase(p.getStatus()))
                .map(p -> {
                    try {
                        this.verifier.verify(p);
                        return p;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    return p;
                })
                .collect(Collectors.toList());
        return null;
    }
}
