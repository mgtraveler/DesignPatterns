package facadepattern.impl;

import facadepattern.DvdPlayer;

public class TopLineDvdPlayer implements DvdPlayer{
    @Override
    public void on() {
        System.out.println("Top Live DVD player on");
    }

    @Override
    public void off() {
        System.out.println("Top Live DVD player off");
    }

    @Override
    public void play() {
        System.out.println("Top Live DVD player playing");
    }

    @Override
    public void stop() {
        System.out.println("Top Live DVD player stop");
    }
}
