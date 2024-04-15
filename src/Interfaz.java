import javax.swing.*;
import java.awt.*;

public class Interfaz extends JFrame {
    public Interfaz() {
        JPanel playPausePanel = new JPanel();
        playPausePanel.setLayout(new BoxLayout(playPausePanel, BoxLayout.X_AXIS));
        JButton play = new JButton("Play");
        JButton pause = new JButton("Pause");
        JButton stop = new JButton("Stop");
        playPausePanel.add(play);
        playPausePanel.add(pause);
        playPausePanel.add(stop);
        add(playPausePanel, BorderLayout.SOUTH);

        JPanel tecladoNumerico = new JPanel(new GridLayout(4, 3));
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton(String.valueOf(i));
            tecladoNumerico.add(button);
        }
        tecladoNumerico.add(new JLabel());
        JButton button0 = new JButton("0");
        tecladoNumerico.add(button0);
        add(tecladoNumerico, BorderLayout.CENTER);

        JPanel progressbar = new JPanel();
        progressbar.setLayout(new BoxLayout(progressbar, BoxLayout.X_AXIS));
        JProgressBar progress = new JProgressBar();
        progress.setValue(50);
        progressbar.add(progress);
        add(progressbar, BorderLayout.NORTH);

        setTitle("Interfaz");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(450,300);
        setVisible(true);
    }
}
