package Domain.GameElements.Entities;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @Test
    void roll() {
        Die die = new Die();
        int lessThanOne = 0, correctValue = 0, moreThanSix = 0;
        //Rolls die 100000 times and tracks the roll value
        for(int i = 0; i < 100000; i++){
            int value = die.Roll();
            if(value < 1){
                lessThanOne++;
            }else if(value > 0 && value <= 6){
                correctValue++;
            }else if(value > 6){
                moreThanSix++;
            }
        }
        //Examines if any die values are below one or above six
        assertEquals(0, lessThanOne);
        assertEquals(0, moreThanSix);
        assertEquals(100000, correctValue);
    }
}