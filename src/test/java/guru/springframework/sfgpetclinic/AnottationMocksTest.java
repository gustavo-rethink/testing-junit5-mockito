package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Map;

public class AnottationMocksTest {

    @Mock
    Map<String, Object> mapMock;

    @Mock
    Map<String, Object> mapMock2;

    @BeforeEach
    void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testMock() {
        mapMock.put("keyvalue", "foo");
        mapMock2.put("keyvalue", "foo");
    }
}
