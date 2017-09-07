package be.vdab.JavaSpring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class PassengerTest {

    @Test
    public void  passengerHasFirstName() {

      Passenger p = new Passenger ("Jane", "Doe");
      assertEquals("Jane",p.getFirstname());


    }
    @Test
    public void passengerHasCorrectFullName() throws Exception {
        Passenger p = new Passenger("Jane", "Doe");
        assertEquals("Jane Doe",p.getFullname());

    }


}
