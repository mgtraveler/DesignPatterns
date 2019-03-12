package facadepattern;

import facadepattern.impl.TheaterScreen;
import facadepattern.impl.TopLineDvdPlayer;
import facadepattern.impl.TopLineProjector;

/**
 * Facade is used to:
 * - provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.
 * - wrap a complicated subsystem with a simpler interface.
 * Subsystem classes still remain available for direct use by client.
 */
public class HomeTheaterFacadeTestDrive {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new TopLineDvdPlayer(), new TopLineProjector(), new TheaterScreen());

        homeTheaterFacade.watchMovie("Ender's game");
        homeTheaterFacade.endMovie();
    }
}
