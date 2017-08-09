package code_clan.rockscissors;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;

public class RockAndScissorsTest {

    RockAndScissors game;
    String userInput;

    @Before
    public void before(){
        userInput = "Paper";
        game = new RockAndScissors(userInput);
    }

    @Test
    public void canInitialize(){
        assertEquals("Paper", game.getUserInput());
    }

    @Test
    public void canGetAResult(){
        assertNotNull(game.game());
    }


}
