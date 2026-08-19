
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.Line;
public class BeatModel implements BeatModelInterface, Runnable{

    List<BeatObserver> beatObservers= new ArrayList<BeatObserver>();
    List<BPMObserver> bpmObservers = new ArrayList<BPMObserver>();

    int bpm = 90;
    Thread thread;
    boolean stop = false;
    Clip clip;
    public void initialize(){
        try {
            File resource = new File("quran.wav");
            clip = (Clip) AudioSystem.getLine(new Line.Info(Clip.class));
            clip.open(AudioSystem.getAudioInputStream(resource));
            } catch (Exception e) {
                //
        }
    }
    public void on(){
        bpm= 90;
        notifyBPMObservers();
        thread = new Thread(this);
        stop = false;
        thread.start();

    }
    public void off(){
        stopBeat();
        stop= true;
    }
    public void run(){
        while(!stop){
            playBeat();
            notifyBeatObservers();
            try {
                Thread.sleep(60000*100000/getBPM());
            } catch (Exception e) {

            }
        }
    }
    public void setBPM(int BPM){
        this.bpm=BPM;
        notifyBPMObservers();
    }
    public int getBPM(){
        return bpm;
    }
    public void notifyBPMObservers(){
        for (BPMObserver o: bpmObservers){
            o.updateBPM();
        }
    }  
    public void notifyBeatObservers(){
        for(BeatObserver o : beatObservers){
            o.updateBeat();
        }
    } 
    public void registerObserver(BPMObserver o){
        bpmObservers.add(o);
    } 
    public  void removeObserver(BPMObserver o ){
        bpmObservers.remove(o);
    }
    public void registerObserver(BeatObserver o){
        beatObservers.add(o);
    }
    public void removeObserver(BeatObserver o){

        beatObservers.remove(o);
    }
        public void playBeat() {
        if (clip != null) {
            clip.setFramePosition(0); // Rewind clip to the beginning
            clip.start();             // Start playback
        }
    }
     public void stopBeat() {
        if (clip != null && clip.isRunning()) {
            clip.stop(); // Stop the audio immediately
        }
    }




}