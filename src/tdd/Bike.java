package tdd;

public class Bike {
    private boolean powerOn;
    private boolean powerOff;
    private int speed;



    public void startBike() {
        powerOn = true;
    }
    public boolean checkPowerOn() {
        return powerOn;
    }
    public void offBike(){
        powerOff = true;
    }
    public boolean checkPowerOff(){
        return powerOff;
    }




    public void accelerate(int initialSpeed, int Gear){
        if(Gear == 1)
        speed = initialSpeed + 1;
        else {
            if (Gear == 2)
                speed = initialSpeed + 2;
            else {
                if (Gear == 3)
                    speed = initialSpeed + 3;
                else {
                    if (Gear == 4)
                        speed = initialSpeed + 4;
                    else {
                        if (Gear >= 5)
                            speed = initialSpeed + 4;
                    }
                }
            }
        }
    }
    public void decelerate(int initialSpeed, int Gear){
        if(Gear == 1)
            speed = initialSpeed - 1;
        else {
            if (Gear == 2)
                speed = initialSpeed - 2;
            else {
                if (Gear == 3)
                    speed = initialSpeed - 3;
                else {
                    if (Gear == 4)
                        speed = initialSpeed - 4;
                    else {
                        if (Gear >= 5)
                            speed = initialSpeed - 4;
                    }
                }
            }
        }
    }

    public int checkSpeed(){
        return speed;
    }

}
