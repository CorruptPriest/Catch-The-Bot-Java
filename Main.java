
import java.util.*;
public class oen{
    public static void main() 
    {
        int mapSize = 10; 
        char[][] map = new char[2][mapSize]; 
        Random random = new Random();
        
        // Player and bot starting positions
        int playerLine = 0; 
        int playerPosition = 0; 
        int botLine = random.nextInt(2);
        int botPosition = random.nextInt(mapSize); 

        System.out.println("Welcome to Catch the Bot!");
        
        // Game loop
        for (int turn = 0; turn < 10; turn++)
        {
            displayMap(map, playerLine, playerPosition, botLine, botPosition);
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your move (L for left, R for right, U for up, D for down): ");
            char move =in.next().charAt(0);

            // Update player's position based on input
            if (move == 'L' && playerPosition > 0) 
            {
                playerPosition--; 
            } 
            else if (move == 'R' && playerPosition < mapSize - 1)
            {
                playerPosition++; 
            }
            else if (move == 'U' && playerLine > 0) 
            {
                playerLine--; 
            } 
            else if (move == 'D' && playerLine < 1) 
            {
                playerLine++;
            } 
            else
            {
                System.out.println("Invalid move! Please try again.");
                continue; // Skip this turn if input is invalid
            }

            // Bot moves randomly within bounds of its line
            botPosition += random.nextInt(3) - 1; 
            if (botPosition < 0)
            {
                botPosition = 0; 
            }
            if (botPosition >= mapSize) 
            {
                botPosition = mapSize - 1;
            }
            // Randomly change bot's line with a small chance
            if (random.nextBoolean()) {
                botLine = (botLine == 0) ? 1 : 0; // Tertiary Operator goes brr
            }
            System.out.println("You moved to position (" + playerLine + ", " + playerPosition + "). The bot moved to position (" + botLine + ", " + botPosition + ").");
            // Check for catch condition
            if (playerLine == botLine && playerPosition == botPosition) {
                System.out.println("Congratulations! You caught the bot!");
                return; // End game on catch
            }
        }

        System.out.println("Game Over! You failed to catch the bot. It was at position (" + botLine + ", " + botPosition + ").");
    }

    // Method to display the current state of the map with positions of player and bot
    public static void displayMap(char[][] map, int playerLine, int playerPos, int botLine, int botPos) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                if (i == playerLine && j == playerPos) {
                    System.out.print("P "); // P for Player
                } else if (i == botLine && j == botPos) {
                    System.out.print("B "); // B for Bot
                } else {
                    System.out.print(". "); // Empty space represented by dot
                }
            }
            System.out.println(); // New line after each row of the map
        }
    }
}


