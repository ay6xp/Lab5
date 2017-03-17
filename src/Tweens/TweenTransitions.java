package Tweens;

public class TweenTransitions {

    private int Time;
    private String transitionType;

    public TweenTransitions(String string) {
        transitionType = string;
    }

    public double applyTransition(double startVal, double endVal, double time, double percentDone) {
        if (transitionType == "linearTransition") {
            return linearTransition(startVal, endVal, time, percentDone);
        } else if (transitionType == "easeInOut") {
            return easeInOut(startVal, endVal, time, percentDone);
        }
        throw new RuntimeException("no valid transition Type");
    }

    private double easeInOut(double startVal, double endVal, double time, double percentDone) {
            return 0.0;
    }

    public double linearTransition(double startVal, double endVal, double time, double percentDone) {
        return startVal+1*percentDone;
    }

    private void intoTransition(double startVal, double endVal, double time, double percentDone) {

    }

    public String getTransitionType() {
        return transitionType;
    }
}
