package testPoker;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import poker.Poker;

public class GPTTest {
	private Poker poker;

    @BeforeEach
    public void setup() {
        poker = new Poker();
    }

    @DisplayName("Full house scenario")
    @Test
    public void fullHouseScenario() {
        String[] cards = {"C2", "D2", "H2", "S3", "S3"};
        assertTrue(poker.isFullHouse(cards, cards.length));
    }

    @DisplayName("Not full house scenario")
    @Test
    public void notFullHouseScenario() {
        String[] cards = {"C2", "D2", "H2", "S3", "S4"};
        assertFalse(poker.isFullHouse(cards, cards.length));
    }

    @DisplayName("Three of a kind scenario")
    @Test
    public void threeOfAKindScenario() {
        String[] cards = {"C2", "D2", "H2", "S3", "S4"};
        assertTrue(poker.isThreeOfaKind(cards, cards.length));
    }

    @DisplayName("Not three of a kind scenario")
    @Test
    public void notThreeOfAKindScenario() {
        String[] cards = {"C2", "D2", "H3", "S3", "S4"};
        assertFalse(poker.isThreeOfaKind(cards, cards.length));
    }

    @DisplayName("Two pairs scenario")
    @Test
    public void twoPairsScenario() {
        String[] cards = {"C2", "D2", "H3", "S3", "S4", "C4"};
        assertTrue(poker.isTwoPairs(cards, cards.length));
    }

    @DisplayName("Not two pairs scenario")
    @Test
    public void notTwoPairsScenario() {
        String[] cards = {"C2", "D2", "H3", "S3", "S4"};
        assertFalse(poker.isTwoPairs(cards, cards.length));
    }
    
    @DisplayName("One pair scenario")
    @Test
    public void onePairScenario() {
        String[] cards = {"C2", "D2", "H3", "S4", "C5"};
        assertFalse(poker.isTwoPairs(cards, cards.length));
    }
}
