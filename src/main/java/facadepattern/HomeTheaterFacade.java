package facadepattern;

public class HomeTheaterFacade {

    DvdPlayer dvdPlayer;
    Projector projector;
    Screen screen;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Projector projector, Screen screen) {
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.screen = screen;
    }

    void watchMovie(String movieName) {
        System.out.println("Get ready to watch movie..." + movieName);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        dvdPlayer.on();
        dvdPlayer.play();
    }

    void endMovie() {
        System.out.println("Shutting home theater down...");
        screen.up();
        projector.off();
        dvdPlayer.stop();
        dvdPlayer.off();
    }
}
