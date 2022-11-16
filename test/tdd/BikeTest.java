package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BikeTest {



    @Test
    public void powerOnTest(){
        //given that I have a bike
        Bike sundayBike = new Bike();
        //when I turn it on
        sundayBike.startBike();
        //check that bike is on
        Assertions.assertTrue(sundayBike.checkPowerOn());
    }

    @Test
    public void powerOffTest(){
        //given that i have a bike
        Bike sundayBike = new Bike();
        //when i turn it on
        sundayBike.startBike();
        //when i turn it off
        sundayBike.offBike();
        //check that bike is off
        Assertions.assertEquals(true, sundayBike.checkPowerOff());
    }

    @Test
    public void accelerateGear1Test(){
        //given i have a bike
        Bike sundayBike = new Bike();
        //when i turn it on
        sundayBike.startBike();
        //given that gear is 1
        sundayBike.accelerate(15, 1);
        //check that it has accelerated the speed to 16
        Assertions.assertEquals(16,sundayBike.checkSpeed());
    }

    @Test
    public void accelerateGear2Test(){
        //given i have a bike
        Bike sundayBike = new Bike();
        //when i turn it on
        sundayBike.startBike();
        //given that gear is 2
        sundayBike.accelerate(24, 2);
        //check that speed has accelerated to 26
        Assertions.assertEquals(26, sundayBike.checkSpeed());
    }

    @Test
    public void accelerateGear3Test(){
        //given that gear is 3
        Bike sundayBike = new Bike();
        //when i turn it on
        sundayBike.startBike();
        //given that gear is 3
        sundayBike.accelerate(35, 3);
        //check that speed has accelerated to 38
        Assertions.assertEquals(38, sundayBike.checkSpeed());
    }

    @Test
    public void accelerateGear4Test() {
        //given that gear is 4
        Bike sundayBike = new Bike();
        //when i turn it on
        sundayBike.startBike();
        //given that gear is 4
        sundayBike.accelerate(44, 4);
        //check that speed has accelerated to 48
        Assertions.assertEquals(48, sundayBike.checkSpeed());
    }
    @Test
    public void decelerateGear1Test(){
        //given i have a bike
        Bike sundayBike = new Bike();
        //when i turn it on
        sundayBike.startBike();
        //given that gear is 1
        sundayBike.decelerate(15, 1);
        //check that it has decelerated to 13
        Assertions.assertEquals(14, sundayBike.checkSpeed());
    }


    @Test
    public void decelerateGear2Test() {
        //given i have bike
        Bike sundayBike = new Bike();
        //when i turn it on
        sundayBike.startBike();
        //given that gear is 2
        sundayBike.decelerate(24,2);
        //check that it has decelerated to 22
        Assertions.assertEquals(22, sundayBike.checkSpeed());
    }

    @Test
    public void decelerateGear3Test(){
        //given i have a bike
        Bike sundayBike = new Bike();
        //when i turn it on
        sundayBike.startBike();
        //given that gear is 3
        sundayBike.decelerate(35, 3);
        //check that it has decelerated to 32
        Assertions.assertEquals(32, sundayBike.checkSpeed());
    }

    @Test
    public void decelerateGear4Test(){
        //given i have a bike
        Bike sundayBike = new Bike();
        //when i turn it on
        sundayBike.startBike();
        //given that gear is 4
        sundayBike.decelerate(44, 4);
        //check that speed is 41
        Assertions.assertEquals(40, sundayBike.checkSpeed());
    }


}
