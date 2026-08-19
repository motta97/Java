public class Main{
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade= new HomeTheaterFacade(new Amplifier(), new Player(), new PopcornPopper());
        homeTheaterFacade.watchMovie("Seerah");
        System.out.println("---------------");
        homeTheaterFacade.endMovie();
    }
}