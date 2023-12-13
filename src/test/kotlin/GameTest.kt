import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class GameTest {
    @Test
    fun incrementScore() {
        val game = Game()
        game.incrementScore()

        if (game.highScore == 1) {
            print("Success")
        } else {
            throw AssertionError("Score and HighScore dont match! ")
        }
    }
}