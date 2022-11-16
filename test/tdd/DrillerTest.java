package tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DrillerTest {
    
    @Test
    public void copies1to4Test() {
        Driller driller = new Driller();
        int result = driller.copies(3);
        Assertions.assertEquals(6000, result);
    }
        
    @Test
    public void copies5to9Test(){
        Driller driller = new Driller();
        int result = driller.copies(7);
        Assertions.assertEquals(12600, result);
    }

    @Test
    public void copies10to29Test(){
        Driller driller = new Driller();
        int result = driller.copies(20);
        Assertions.assertEquals(32000, result);
    }

    @Test
    public void copies30to49Test(){
        Driller driller = new Driller();
        int result = driller.copies(40);
        Assertions.assertEquals(60000, result);
    }
    @Test
    public void copies50to99Test(){
        Driller driller = new Driller();
        int result = driller.copies(80);
        Assertions.assertEquals(104000, result);
    }

    @Test
    public void copies100to199Test(){
        Driller driller = new Driller();
        int result = driller.copies(199);
        Assertions.assertEquals(238800, result);
    }

    @Test
    public void copies200to499Test(){
        Driller driller = new Driller();
        int result = driller.copies(499);
        Assertions.assertEquals(548900, result);
    }

    @Test
    public void copies500AboveTest(){
        Driller driller = new Driller();
        int result = driller.copies(550);
        Assertions.assertEquals(550000, result);
    }



    
}
