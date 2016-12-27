import java.awt.BorderLayout;
import static javax.swing.JFrame.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ListSelectionModel;

public class Buttonhandler extends JFrame implements ActionListener {
	JLabel label = new JLabel("");
	JButton backbutton = new JButton("·µ»Ø");
	JButton buybutton = new JButton("¹ºÂò");
	int Num;

	Buttonhandler(SeatHandler buyHandler, int Num) {
		this.Num = Num;
		this.setTitle("¶©Æ±");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel northPanel = new JPanel();
		this.getContentPane().add(northPanel, BorderLayout.NORTH);
		JPanel westPanel = new JPanel();
		this.getContentPane().add(westPanel, BorderLayout.WEST);
		westPanel.add(backbutton);
		JPanel eastPanel = new JPanel();
		this.getContentPane().add(eastPanel, BorderLayout.EAST);
		buybutton.addActionListener(buyHandler);
		buybutton.addActionListener(this);
		backbutton.addActionListener(this);
		eastPanel.add(buybutton);
		label.setVisible(true);
		label.setBounds(5, 5, 160, 80);
		northPanel.add(label);
		this.setBounds(400, 200, 400, 150);
		this.setVisible(false);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == this.backbutton)
			this.setVisible(false);
		else if (e.getSource() == this.buybutton)
			this.setVisible(false);
		else {
			this.setVisible(true);
			this.label.setText("¼Û¸ñ  " + Interfance.movielist.get(Num).getMoviePrice() + "\n×ùÎ»Ê£Óà  "
					+ Interfance.movielist.get(Num).getMovieSeatRemained() + "/"
					+ Interfance.movielist.get(Num).getMovieSeat());
		}
	}
}
