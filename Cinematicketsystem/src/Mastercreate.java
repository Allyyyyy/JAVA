import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Mastercreate extends JFrame implements ActionListener

{
	JLabel label1 = new JLabel("电影名字:");
	JLabel label2 = new JLabel("场次时间:");
	JLabel label3 = new JLabel("电影价格:");
	JLabel label4 = new JLabel("上映时间:");
	JLabel label5 = new JLabel("座位数量:");
	JTextField input1 = new JTextField();
	JTextField input2 = new JTextField();
	JTextField input3 = new JTextField();
	JTextField input4 = new JTextField();
	JTextField input5 = new JTextField();
	JButton addbutton = new JButton("添加电影票");
	JButton deletebutton = new JButton("删除电影票");
	JButton quit = new JButton("返回");

	Mastercreate() {
		
		this.setTitle("管理员界面");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel topPanel = new JPanel();
		this.getContentPane().add(topPanel, BorderLayout.NORTH);
		JPanel centerPanel = new JPanel();
		this.getContentPane().add(centerPanel, BorderLayout.CENTER);
		JPanel bottomPanel = new JPanel();
		this.getContentPane().add(bottomPanel, BorderLayout.SOUTH);
		input1.setEditable(true);
		input1.setHorizontalAlignment(SwingConstants.LEFT);
		input1.setColumns(30);
		topPanel.add(label1);
		topPanel.add(input1);
		centerPanel.add(label2);
		input2.setEditable(true);
		input2.setHorizontalAlignment(SwingConstants.LEFT);
		input2.setColumns(30);
		centerPanel.add(input2);
		input3.setEditable(true);
		input3.setHorizontalAlignment(SwingConstants.LEFT);
		input3.setColumns(30);
		input4.setEditable(true);
		input4.setHorizontalAlignment(SwingConstants.LEFT);
		input4.setColumns(30);
		input5.setEditable(true);
		input5.setHorizontalAlignment(SwingConstants.LEFT);
		input5.setColumns(30);
		centerPanel.add(label3);
		centerPanel.add(input3);
		centerPanel.add(label4);
		centerPanel.add(input4);
		centerPanel.add(label5);
		centerPanel.add(input5);
		bottomPanel.add(addbutton);
		bottomPanel.add(deletebutton);
		bottomPanel.add(quit);
		this.setBounds(400, 200, 450, 250);
		this.setVisible(false);
		addbutton.addActionListener(this);
		deletebutton.addActionListener(this);
		quit.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e2) {
		int a;
		if (e2.getSource() == addbutton && Interfance.movielist.size() < 6) {
			Movie theMovie = new Movie(input1.getText());
			theMovie.setMoviePrice(Double.parseDouble(input3.getText()));
			theMovie.setMovieDateReleased(input4.getText());
			theMovie.setMovieTime(input2.getText());
			a = Integer.parseInt(input5.getText());
			if(a>40) a=40;
			theMovie.setMovieSeats(a);
			Interfance.movielist.add(theMovie);
			JOptionPane.showMessageDialog(null, "添加成功!");
			input1.setText(null);
			input2.setText(null);
			input3.setText(null);
			input4.setText(null);
			input5.setText(null);
		} else if (e2.getSource() == addbutton && Interfance.movielist.size() >= 6) {
			JOptionPane.showMessageDialog(null, "电影数量超出上限！");
			input1.setText(null);
			input2.setText(null);
			input3.setText(null);
			input4.setText(null);
			input5.setText(null);
		} else if (e2.getSource() == deletebutton) {
			Iterator<Movie> it = Interfance.movielist.iterator();
			while (it.hasNext()) {
				Movie subtitude = (Movie) it.next();
				if (subtitude.getMovieName().equals(input1.getText())) {
					Interfance.firstbuttonHandler.film[Interfance.movielist.size()].setVisible(false);
					Interfance.firstbuttonHandler.film[Interfance.movielist.size()].setText(null);
					for(int i = 0;i<Interfance.ticketlist.size();i++)
					if(Interfance.ticketlist.get(i).getTicketMovieName().equals(subtitude.getMovieName())) Interfance.ticketlist.remove(i--);
					Interfance.movielist.remove(subtitude);
					JOptionPane.showMessageDialog(null, "删除成功!");
					input1.setText(null);
					input2.setText(null);
					input3.setText(null);
					input4.setText(null);
					input5.setText(null);
				}
				if (Interfance.movielist.indexOf(subtitude) == -1)
					break;
			}
		} else if (e2.getSource() == quit) {
			this.setVisible(false);
		}
	}
}
