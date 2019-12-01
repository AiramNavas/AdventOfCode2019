package Day1;

import java.util.ArrayList;

public class TheTyrannyOfTheRocketEquation {

    private ArrayList<Double> masses;

    TheTyrannyOfTheRocketEquation(ArrayList<String> file){
        this.masses = new ArrayList<>();
        for (String s : file) {
            getmasses().add(Double.valueOf(s));
        }
    }

    ArrayList<Double> getmasses() {
        return masses;
    }

    public void setmasses(ArrayList<Double> masses) {
        this.masses = masses;
    }

    private double getFuel(Double mass){
        return Math.floor(mass / 3) - 2;
    }

    Double getSolutionPart1() {
        double sum = 0;
        for (Double mass : masses) {
            sum += getFuel(mass);
        }
        return sum;
    }

    Double getSolutionPart2(){
        double sum = 0;
        for (Double mass : masses) {
            sum += getTotalFuel(mass);
        }
        return sum;
    }

    private double getTotalFuel(double mass) {
        if(getFuel(mass) > 0)
            return getFuel(mass) + getTotalFuel(getFuel(mass));
        else
            return 0;
    }
}
