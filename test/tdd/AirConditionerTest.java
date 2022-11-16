package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AirConditionerTest {


    @Test
    public void powerOnTest() {
        //given
        AirConditioner sundayAirConditioner = new AirConditioner(28);
        //when I turn on AC
        sundayAirConditioner.acOn();
        //check that ac is On
        boolean sundayAirConditionerpower = sundayAirConditioner.checkPowerOn();
        Assertions.assertEquals(true, sundayAirConditionerpower);
    }

    @Test
    public void powerOffTest(){
        //given there is an ac
        AirConditioner sundayAirConditioner = new AirConditioner(28);
        //when i turn off Ac
        sundayAirConditioner.acOff();
        //check that ac is off
        boolean sundayAirconditionerPower = sundayAirConditioner.checkPowerOff();
        Assertions.assertEquals(true,sundayAirconditionerPower);

    }

    @Test
    public void increaseTemperatureTest(){
        //given there is an ac
        AirConditioner sundayAirConditioner = new AirConditioner(28);
        //when i turn on ac
        sundayAirConditioner.acOn();
        //when i increase the temperature
        sundayAirConditioner.increaseTemperature(2);
        //check that temperature has increase
        int sundayAcTemperature = sundayAirConditioner.checkTemperature();
        Assertions.assertEquals(30, sundayAcTemperature);
    }

    @Test
    public void decreaseTemperatureTest(){
        //given there is an ac
        AirConditioner sundayAirconditioner = new AirConditioner(28);
        //when i turn on ac
        sundayAirconditioner.acOn();
        //when i decrease temperature
        sundayAirconditioner.decreaseTemperature(2);
        //check that temperature has decrease
        int sundayAcTemperature = sundayAirconditioner.checkTemperature();
        Assertions.assertEquals(26, sundayAcTemperature);
    }

    @Test
    public void increaseAbove30TempTest(){
        //given there is an ac
        AirConditioner sundayAirconditioner = new AirConditioner(28);
        //When i turn on ac
        sundayAirconditioner.acOn();
        //When i increase above 30
        sundayAirconditioner.increaseTemperature(10);
        // check that temperature is 30
        int sundayAcTemperature = sundayAirconditioner.checkTemperature();
        Assertions.assertEquals(30, sundayAcTemperature);
    }

    @Test
    public void decreaseBelow16TempTest(){
        AirConditioner sundayAirconditioner = new AirConditioner(28);
        //When i turn on ac
        sundayAirconditioner.acOn();
        //When i decrease below 16
        sundayAirconditioner.decreaseTemperature(20);
        // check that temperature is 16
        Assertions.assertEquals(16,sundayAirconditioner.checkTemperature());
    }








}
