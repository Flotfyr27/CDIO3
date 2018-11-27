package Domain.GameElements.Entities;

import java.security.SecureRandom;

public class Die {
    private SecureRandom random;
    private int dieFaces = 6;
    private int faceValue;

    public Die(){
        random = new SecureRandom();
    }

    public int Roll (){
        faceValue = Math.abs(random.nextInt() % dieFaces);
       return faceValue;
    }
}
