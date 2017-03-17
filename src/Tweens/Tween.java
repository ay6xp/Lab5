package Tweens;

import edu.virginia.engine.display.DisplayObject;
import edu.virginia.engine.display.Sprite;

public class Tween {
    TweenParam tweenParam;
    DisplayObject sprite;
    TweenTransitions tweenTransitions;
    double percentDone = 0;

    Tween(DisplayObject object) {

    }

    public Tween(DisplayObject object, TweenTransitions transition) {
        sprite = object;
        tweenTransitions = transition;
    }

    public void animate(TweenableParams fieldToAnimate, double startVal, double endVal, double time) {
        tweenParam = new TweenParam(fieldToAnimate, startVal, endVal, time);
    }

    public void update() {
        if (tweenParam.getParem() == TweenableParams.Y) {
            sprite.setPositionY(sprite.getPositionY() + tweenTransitions.applyTransition(tweenParam.startVal, tweenParam.endVal, tweenParam.time, percentDone));
            percentDone+=1;
            System.out.println(sprite.getPositionY());
        }
    }


    public boolean isComplete() {
        if (percentDone >= 100){
            return true;
        }
        else{
            return false;
        }
    }

    public void setValue(TweenableParams param, double value) {

    }


}
