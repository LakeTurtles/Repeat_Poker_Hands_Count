import java.util.HashMap;
import java.util.Map;

public class WinningHands {
    public static void main(String[] args) {
        Map<String, Map<String, Integer>> playerCardCounts = new HashMap<>();

        // Your provided data
        String[] playerNames = {
                "Patrick Stewart", "Rita Repulsa", "He Man", "TJ Hooker",
                "Patrick Stewart", "Rita Repulsa", "He Man", "TJ Hooker",
                "Patrick Stewart", "Rita Repulsa", "He Man", "TJ Hooker",
                "Patrick Stewart", "Rita Repulsa", "He Man", "TJ Hooker",
                "Patrick Stewart", "Rita Repulsa", "He Man", "TJ Hooker"
        };

        String[] winningHands = {
                "FLUSH", "STRAIGHT", "THREE OF A KIND", "ACE HIGH",
                "FLUSH", "STRAIGHT", "FLUSH", "ACE HIGH",
                "PAIR", "PAIR", "ACE HIGH", "STRAIGHT",
                "PAIR", "STRAIGHT", "TWO OF A KIND", "ACE HIGH",
                "KING HIGH", "ROYAL FLUSH", "QUEEN HIGH", "THREE OF A KIND"
        };

        for (int i = 0; i < playerNames.length; i++) {
            String playerName = playerNames[i];
            String winningHand = winningHands[i];

            // Get the player's card counts map from the main map
            Map<String, Integer> cardCounts = playerCardCounts.get(playerName);

            // If the player doesn't have a card count map yet, create one
            if (cardCounts == null) {
                cardCounts = new HashMap<>();
                playerCardCounts.put(playerName, cardCounts);
            }

            // Update the card count for the specific winning hand
            cardCounts.put(winningHand, cardCounts.getOrDefault(winningHand, 0) + 1);
        }

        // Print the card counts for each player
        for (String playerName : playerCardCounts.keySet()) {
            System.out.println(playerName + " - " + playerCardCounts.get(playerName));
        }
    }
}

//In this example, we first create a Map<String, Map<String, Integer>> to store the card counts for each player. We iterate through the provided player names and winning hands, updating the card counts for each player in the nested Map. Finally, we print the card counts for each player.
