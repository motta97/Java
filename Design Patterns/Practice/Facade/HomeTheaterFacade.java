public class HomeTheaterFacade{
    Amplifier amplifier;
    Player player;
    PopcornPopper popper;
    public HomeTheaterFacade(
        Amplifier amplifier, Player player,
        PopcornPopper popper
    ){
        this.amplifier=amplifier;
        this.player=player;
        this.popper=popper;
    }
    public void watchMovie(String movieName){
        amplifier.on();
        player.on();
        popper.pop();
        player.play(movieName);
    }
    public void endMovie(){
        amplifier.off();
        player.off();
        player.off();
    }
}