import java.text.NumberFormat;

public class piggyBank {

    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    private double x;

    public piggyBank() {
        x = 0;
    }

    public void addPenny() {
        x = .01 + x;
    }
    public void addNickel() {
        x = .05 + x;
    }
    public void addDime() {
        x = .10 + x;
    }
    public void addQuarter() {
        x = .25 + x;
    }
    public String toString() {
        return formatter.format(x);
    }
    public void resetMoney() {
        x = 0;
    }
}
