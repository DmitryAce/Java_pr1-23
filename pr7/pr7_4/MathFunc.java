package pr7.pr7_4;

public class MathFunc implements MathCalculable {
    public double pow(double a, double b) {
        return Math.pow(a,b);
    }
    public double ModuleComp(double a, double b) {
        double apow = Math.pow(a,2);
        double bpow = Math.pow(b,2);
        return Math.sqrt((apow+bpow));
    }
}
