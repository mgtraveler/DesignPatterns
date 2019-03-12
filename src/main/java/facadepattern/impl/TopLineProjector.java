package facadepattern.impl;

import facadepattern.Projector;

public class TopLineProjector implements Projector{
    @Override
    public void on() {
        System.out.println("Top Line Projector on");
    }

    @Override
    public void off() {
        System.out.println("Top Line Projector off");
    }

    @Override
    public void wideScreenMode() {
        System.out.println("Top Line Projector in wide screen mode");
    }
}
