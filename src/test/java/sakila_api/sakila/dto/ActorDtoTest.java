package sakila_api.sakila.dto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ActorDtoTest {

    @Test
    public void testGetActorId() {
    	ActorDto newActor = new ActorDto();
        Assertions.assertEquals(newActor.getId(), 0, "Store ID getter and setter dont work");

    }

    @Test
    public void testSetActorId() {
    	ActorDto newActor = new ActorDto();
        newActor.setId(1);
        Assertions.assertEquals(newActor.getId(), 1, "Store ID getter and setter dont work");

    }

    @Test
    public void testGetActorFirstName() {
    	ActorDto newActor = new ActorDto("test", "test");
        Assertions.assertEquals(newActor.getFirstName(), "test", "Store ID getter and setter dont work");

    }

    @Test
    public void testSetActorFirstName() {
    	ActorDto newActor = new ActorDto("test", "test");
        newActor.setFirstName("changed");
        Assertions.assertEquals(newActor.getFirstName(), "changed", "Store ID getter and setter dont work");


    }

    @Test
    public void testGetActorLastName() {
    	ActorDto newActor = new ActorDto("test", "test");
        Assertions.assertEquals(newActor.getLastName(), "test", "Store ID getter and setter dont work");

    }

    @Test
    public void testSetLastName() {
    	ActorDto newActor = new ActorDto("test", "test");
        newActor.setLastName("changed");
        Assertions.assertEquals(newActor.getLastName(), "changed", "Store ID getter and setter dont work");


    }
}
