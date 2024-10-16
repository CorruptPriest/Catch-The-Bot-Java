Hello, This is a project made in java for a simple terminal game.

->Explanation of the Code

  1. Imports: We import `Random` for generating random numbers and `Scanner` for user input.

  2. Initialization:
   - We define `mapSize` as 10, representing each line's positions from 0 to 9.
   - A two-dimensional array `map` is created to represent two lines of the game area.
   - The player's starting position is set to `(0,0)` on line `0`, while the bot's starting position is randomly generated.

  3. Game Loop:
   - The loop runs for a maximum of 10 turns.
   - The current state of the map is displayed using `displayMap()`, showing both players' positions.
   - The player can enter their move: "L" for left, "R" for right, "U" for up (to line `0`), and "D" for down (to line `1`).
   - Based on input, the player's position is updated accordingly while ensuring it stays within bounds.

  4. Bot Movement:
   - The bot moves randomly within its line and may switch lines randomly after each turn.

  5. Check for Catch Condition:
   - After each turn, we check if the player's position matches the bot's position.
   - If they match, a congratulatory message is displayed, and the game ends.

  6. Game Over:
   - If the loop completes without catching the bot, a game over message is displayed along with the final position of the bot.

