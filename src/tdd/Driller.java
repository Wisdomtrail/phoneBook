package tdd;

public class Driller {


    public int copies(int numberOfCopies) {
        if (numberOfCopies <= 4)
            return numberOfCopies * 2000;
        else {
            if (numberOfCopies <= 9)
                return numberOfCopies * 1800;
            else if (numberOfCopies <= 29)
                return numberOfCopies * 1600;
            else if (numberOfCopies <= 49)
                return numberOfCopies * 1500;
            else if (numberOfCopies <= 99)
                return numberOfCopies * 1300;
            else if (numberOfCopies <= 199)
                return numberOfCopies * 1200;
            else if (numberOfCopies <= 499)
                return numberOfCopies * 1100;
            return numberOfCopies * 1000;
        }

    }
}