//q25
// Interface
interface Playable {
    void play();
}

// Class: Football
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football");
    }
}

// Class: Volleyball
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Volleyball");
    }
}

// Class: Basketball
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball");
    }
}

// Main class to test
public class PlayTest {
    public static void main(String[] args) {
        System.out.println("Name:Astha kiran");
		System.out.println("Roll:AV.SC.U4CSE24010");
		System.out.println("Class:CSE/A");
		System.out.println();
        
        Football football = new Football();
        Volleyball volleyball = new Volleyball();
        Basketball basketball = new Basketball();

        football.play();
        volleyball.play();
        basketball.play();
    }
}
