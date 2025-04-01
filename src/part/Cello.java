package part;

import java.util.Random;

public class Cello extends Parts {
    private final String imageName;

    public Cello() {
        super();
        Random random = new Random();
        String chosenCello;
        if(random.nextBoolean()){
            chosenCello = "cello";
            imageName = "cello.png";
        } else {
            chosenCello = "viola";
            imageName = "random.png";
        }
        description.append("Final touch: ").append(chosenCello).append(".\n");
    }

    public String getImageName() {
        return imageName;
    }
}