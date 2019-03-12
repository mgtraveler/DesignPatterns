package facadepattern.impl;

import facadepattern.Screen;

public class TheaterScreen implements Screen{
    @Override
    public void up() {
        System.out.println("Theater screen up");
    }

    @Override
    public void down() {
        System.out.println("Theater screen down");
    }
}
