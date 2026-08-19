import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class View implements ActionListener, BeatObserver, BPMObserver {

    BeatModelInterface model;
    ControllerInterface controller;
    
    // Window 1: Displaying the beat status
    JFrame viewFrame;
    JPanel viewPanel;
    BeatBar beatBar;
    JLabel bpmOutputLabel;
    JLabel bpmLabel;
    
    // Window 2: Controlling the system (Separated)
    JFrame controlFrame;
    JPanel controlPanel;
    JTextField bpmtextField;
    JButton setBPMButton;
    JButton decreaseBPMButton;
    JButton increaseBPMButton;
    JMenuBar menuBar;
    JMenu menu;
    JMenuItem startMenuItem;
    JMenuItem stopMenuItem;

    public View(ControllerInterface controller, BeatModelInterface model) {
        this.controller = controller;
        this.model = model;
        model.registerObserver((BeatObserver)this);
        model.registerObserver((BPMObserver)this);
    }

    // ====== FIXED: Renders the Controls in a Separate Window ======
    public void createControls() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        controlFrame = new JFrame("Control Panel");
        controlFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        controlFrame.setSize(new Dimension(320, 180));

        controlPanel = new JPanel(new GridLayout(3, 1));

        // Row 1: Text input and confirmation button
        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel enterBPM = new JLabel("Enter BPM:");
        bpmtextField = new JTextField(5);
        bpmtextField.setText(String.valueOf(model.getBPM()));
        setBPMButton = new JButton("Set");
        setBPMButton.addActionListener(this);
        inputPanel.add(enterBPM);
        inputPanel.add(bpmtextField);
        inputPanel.add(setBPMButton);

        // Row 2: Adjustment steps buttons
        JPanel stepPanel = new JPanel(new FlowLayout());
        decreaseBPMButton = new JButton("<< Decrease");
        increaseBPMButton = new JButton("Increase >>");
        decreaseBPMButton.addActionListener(this);
        increaseBPMButton.addActionListener(this);
        stepPanel.add(decreaseBPMButton);
        stepPanel.add(increaseBPMButton);

        // Assemble into main structural grid
        controlPanel.add(inputPanel);
        controlPanel.add(stepPanel);

        // Assemble menu systems attached to the control unit
        menuBar = new JMenuBar();
        menu = new JMenu("DJ Control");
        
        startMenuItem = new JMenuItem("Start");
        startMenuItem.addActionListener(e -> controller.start());
        menu.add(startMenuItem);
        
        stopMenuItem = new JMenuItem("Stop");
        stopMenuItem.addActionListener(e -> controller.stop());
        menu.add(stopMenuItem);
        
        JMenuItem exitMenuItem = new JMenuItem("Quit");
        exitMenuItem.addActionListener(e -> System.exit(0));
        menu.add(exitMenuItem);

        menuBar.add(menu);
        controlFrame.setJMenuBar(menuBar);

        controlFrame.getContentPane().add(controlPanel, BorderLayout.CENTER);
        controlFrame.pack();
        controlFrame.setLocation(350, 0); // Spatially separates it from view window
        controlFrame.setVisible(true);
    }

    public void createView() {
        viewFrame = new JFrame("DJ View");
        viewFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        viewFrame.setSize(new Dimension(300, 150));

        viewPanel = new JPanel(new GridLayout(2, 1));
        beatBar = new BeatBar();

        bpmLabel = new JLabel("Current BPM: ", SwingConstants.CENTER);
        bpmOutputLabel = new JLabel("offline", SwingConstants.CENTER);

        JPanel bpmPanel = new JPanel(new GridLayout(2, 1));
        bpmPanel.add(bpmLabel);
        bpmPanel.add(bpmOutputLabel);
        
        viewPanel.add(beatBar);
        viewPanel.add(bpmPanel);
        
        viewFrame.getContentPane().add(viewPanel, BorderLayout.CENTER);
        viewFrame.pack();
        viewFrame.setLocation(0, 0);
        viewFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == setBPMButton) {
            try {
                int bpm = Integer.parseInt(bpmtextField.getText());
                controller.setBPM(bpm);
            } catch (NumberFormatException e) {
                bpmtextField.setText(String.valueOf(model.getBPM()));
            }
        } else if (event.getSource() == increaseBPMButton) {
            controller.increaseBPM();
        } else if (event.getSource() == decreaseBPMButton) {
            controller.decreaseBPM();
        }
    }

    public void updateBPM() {
        int bpm = model.getBPM();
        if (bpm == 0) {
            bpmOutputLabel.setText("offline");
        } else {
            bpmOutputLabel.setText(String.valueOf(bpm));
        }
        if (bpmtextField != null) {
            bpmtextField.setText(String.valueOf(bpm));
        }
    }

    public void updateBeat() {
        beatBar.setValue(100);
    }

    public void enableStopMenuItem() { stopMenuItem.setEnabled(true); }
    public void disableStopMenuItem() { stopMenuItem.setEnabled(false); }
    public void enableStartMenuItem() { startMenuItem.setEnabled(true); }
    public void disableStartMenuItem() { startMenuItem.setEnabled(false); }
}
