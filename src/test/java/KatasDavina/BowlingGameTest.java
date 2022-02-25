/*https://www.youtube.com/watch?v=v_w7pSWeQiM*/
package KatasDavina;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BowlingGameTest {
/*miramos que  los 20 lanzamientos de 0 puntos la puntuación sea 0*/
        @Test
        public void testGutter() throws Exception{
            BowlingGame bowlingGame = new BowlingGame();
            for (int i = 0; i<20; i++){
                bowlingGame.roll(0);
            }
            assertEquals(0, bowlingGame.score());
        }

        /*todos los lanzamientos tienen como punto : 1 */
    @Test
    public void testAllOnes() throws Exception{
        BowlingGame bowlingGame = new BowlingGame();
        for (int i = 0; i<20; i++){
            bowlingGame.roll(1);
        }
        assertEquals(20, bowlingGame.score());
    }

    }
