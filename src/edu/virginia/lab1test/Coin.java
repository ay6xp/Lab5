package edu.virginia.lab1test;

import edu.virginia.engine.display.Sprite;
import edu.virginia.engine.events.Event;
import edu.virginia.engine.events.IEventDispatcher;
import edu.virginia.engine.events.IEventListener;

import java.util.ArrayList;
import java.util.EventListener;


public class Coin extends Sprite implements IEventListener {

    public Coin(String id, String imageFileName) {
        super(id, imageFileName);
    }


    @Override
    public void handleEvent(Event event) {
        if (event.getEventType() == "CoinPickedUp") {
            this.setVisibleState(false);
        }
    }
}
