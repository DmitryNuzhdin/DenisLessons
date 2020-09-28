package examples.lesson3;

import java.util.HashMap;
import java.util.Map;

public class LambdaMain {

    public static void main(String[] args) {
        Speaker speaker = new ExampleSpeaker();

        Speaker speakerLambda = System.out::println;



        speaker.speak("ABC");
        speakerLambda.speak("QWE");

        Map<Integer, Integer> sMap = new HashMap<>();

        sMap.merge(1, 1, Integer::sum);

    }
}


class ExampleSpeaker implements Speaker {
    @Override
    public void speak(String wordToSpeak) {
        System.out.println("I speak " + wordToSpeak);
    }
}