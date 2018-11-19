package Domain.GameElements.Entities;

import java.security.SecureRandom;

public class Die {
    private SecureRandom random;
    private int dieFaces = 10; //bliver et 6-tal i vores
    private int faceValue;

    Die(){
        random = new SecureRandom();
    }

    public int Roll (){
        faceValue = Math.abs(random.nextInt() % dieFaces);
       return faceValue;
    }
}
