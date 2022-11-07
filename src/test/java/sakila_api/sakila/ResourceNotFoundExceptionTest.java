package sakila_api.sakila;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResourceNotFoundExceptionTest {

    @Test
    public void testResourceNotFoundException() {
    	ResourceNotFoundException newResourceNotFoundException = new ResourceNotFoundException("test");
        Assertions.assertNotNull(newResourceNotFoundException);

    }
}
