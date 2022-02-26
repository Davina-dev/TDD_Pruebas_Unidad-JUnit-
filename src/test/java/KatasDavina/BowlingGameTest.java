/*https://www.youtube.com/watch?v=v_w7pSWeQiM*/
package KatasDavina;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class BowlingGameTest {
/*pod3emos crear UN OBJETO DE TIPO BOWLINGGAME EN UN METODO SETUP DE JUNIT (alt insertar -> setup method) así no lo he de repetir en cada test: BowlingGame bowlingGame = new BowlingGame();
private BowlingGame bowlingGame;
@Before
public void setUp() throws Exception {
bowlingGame= new BowlingGame(); }
*/


    /*miramos que  los 20 lanzamientos de 0 puntos la puntuación sea 0*/
        @Test
        public void testGutter() {
            BowlingGame bowlingGame = new BowlingGame();
            rollMany(20,0);
            assertEquals(0, bowlingGame.score());
        }

        /*todos los lanzamientos tienen como punto : 1 */
    @Test
    public void testAllOnes() {
        BowlingGame bowlingGame = new BowlingGame();
        rollMany(20,1);
        assertEquals(20, bowlingGame.score());
    }
    //funcionalidad de hacer la media. Consiste en derribar 10 bolos entre los dos lanzamientos de 1 turno
    @Test
    public void  testOneSpare(){

        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(5);
        bowlingGame.roll(5);
        bowlingGame.roll(3);
        rollMany(17, 0);
        assertEquals(16, bowlingGame.score());
    }


// si derriba los 10 bolos en el 1er lanzamiento del turno
    @Test
    public void  testOneStrike(){
        BowlingGame bowlingGame = new BowlingGame();
        bowlingGame.roll(10);
        bowlingGame.roll(3);
        bowlingGame.roll(4);
        rollMany(16, 0);
        assertEquals(24, bowlingGame.score());
    }

    @Test
    public void testPerfectGame(){

        BowlingGame bowlingGame = new BowlingGame();
        rollMany(12,10);
        assertEquals( 300, bowlingGame.score());

    }


   private void rollMany(int n, int pins) {
        BowlingGame bowlingGame = new BowlingGame();
        for (int i=0 ; i<n; i++){
            bowlingGame.roll(pins);
        }

    }

    }
