import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;
public class SliderDemo implements ChangeListener {
	JFrame frame;
	JPanel panel;
	JLabel label;
	JSlider slider;
	
	

	SliderDemo()
	{
		frame = new JFrame("SliderDemo");
		panel = new JPanel();
		label = new JLabel();
		slider = new JSlider(0,100, 50);
		slider.setPreferredSize(new Dimension(400,200));
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setPaintLabels(true);
		slider.setFont(new Font("MVBOLI",Font.PLAIN, 15));
		label.setFont(new Font("MVBOLI",Font.PLAIN, 25));
		slider.setMajorTickSpacing(25);
		slider.setMinorTickSpacing(10);
		slider.setOrientation(SwingConstants.VERTICAL);
		label.setText("C = " + slider.getValue());
		slider.addChangeListener(this);
		
		
		panel.add(slider);
		panel.add(label);
		frame.add(panel);
		frame.add(panel);
		frame.setSize(420,420);
		frame.setVisible(true);
		
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		label.setText("C = " + slider.getValue());
		
	}
}
