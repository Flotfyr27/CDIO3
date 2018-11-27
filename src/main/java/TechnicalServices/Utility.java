package TechnicalServices;

import Domain.GameElements.Entities.ChanceCard;

import java.util.Random;

public class Utility {

    /**
     * Method to shuffle values in array changed to fit shuffling cards.
     * @param array This is the array to be shuffled.
     */
    public static void shuffleCards(ChanceCard[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {

            int randomValue = i + random.nextInt(n - i);
            ChanceCard randomElement = array[randomValue];
            array[randomValue] = array[i];
            array[i] = randomElement;
        }
    }
}
