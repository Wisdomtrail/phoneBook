package tdd;

public class AirConditioner {

    private boolean powerOn;
    private boolean powerOff;
    private int temperature;

    public AirConditioner(int initialTemperature){
            temperature = initialTemperature;
    }
    public void acOn(){

         powerOn = true;
    }
    public void acOff() {
            powerOff = true;
    }
    public boolean checkPowerOn() {
        return powerOn;
    }
    public boolean checkPowerOff()
    {
        return powerOff;
    }

    public void increaseTemperature(int degree) {

            temperature = temperature + degree;
            if(temperature > 30){
                temperature = 30;
            }

    }
    public void decreaseTemperature(int degree) {

            temperature = temperature - degree;
        if (temperature < 16){
            temperature = 16;
        }

    }
    public int checkTemperature(){
        return temperature;
    }


}
