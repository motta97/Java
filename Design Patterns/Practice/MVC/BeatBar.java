import javax.swing.JProgressBar;

public class BeatBar extends JProgressBar implements Runnable {
    private static final long serialVersionUID = 1L;
    private Thread thread;

    public BeatBar() {
        // Initialize progress bar properties
        setMinimum(0);
        setMaximum(100);
        setValue(0);
        
        // Start the continuous fade-out rendering loop
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        while (true) {
            int value = getValue();
            
            // Decelerate the beat indicator line smoothly over time
            value = (int) (value * 0.75);
            setValue(value);
            repaint();
            
            try {
                Thread.sleep(50); // Decay ticks every 50 milliseconds
            } catch (Exception e) {
                // Thread sleep interrupted; handle silently
            }
        }
    }
}
