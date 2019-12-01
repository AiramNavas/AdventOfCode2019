package Day1;

import Common.Reader;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        TheTyrannyOfTheRocketEquation ttotre = new TheTyrannyOfTheRocketEquation(new Reader("src/Day1/inputDay1.txt").getLines());
        System.out.println(ttotre.getSolutionPart1());
        System.out.println(ttotre.getSolutionPart2());
    }
}
