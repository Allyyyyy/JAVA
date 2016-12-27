import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InterfaceCreate extends JFrame {

	InterfaceCreate() {

		this.setBackground(Color.RED);
		this.setTitle("��ӰƱϵͳ");
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		JPanel centerPanel = new JPanel();
		this.getContentPane().add(centerPanel, BorderLayout.CENTER);
		JPanel eastPanel = new JPanel();
		this.getContentPane().add(eastPanel, BorderLayout.EAST);
		JPanel westPanel = new JPanel();
		this.getContentPane().add(westPanel, BorderLayout.WEST);
		JPanel southPanel = new JPanel();
		this.getContentPane().add(southPanel, BorderLayout.SOUTH);
		JPanel northPanel = new JPanel();
		this.getContentPane().add(northPanel, BorderLayout.NORTH);
		JLabel label = new JLabel("��ӭ�����ӰƱϵͳ��");
		label.setBounds(5, 5, 160, 80);
		label.setFont(new Font("", Font.BOLD, 22));
		label.setIcon(new ImageIcon("label.jpg"));
		this.getContentPane().add(label, BorderLayout.NORTH);
		JLabel label1 = new JLabel("����ӰԺ��Ӱʱ��Ϊ00:00~24:00");
		label1.setBounds(5, 5, 80, 40);
		label1.setFont(new Font("", Font.BOLD, 16));
		label1.setIcon(new ImageIcon("label1.jpg"));
		this.getContentPane().add(label1, BorderLayout.CENTER);
		JButton firstbutton = new JButton("�������");
		southPanel.add(firstbutton);
		JButton ticketbutton = new JButton("ȡƱ");
		southPanel.add(ticketbutton);
		JButton masterbutton = new JButton("����Ա��½");
		southPanel.add(masterbutton);
		firstbutton.addActionListener(Interfance.firstbuttonHandler);
		masterbutton.addActionListener(Interfance.registerbuttonHandler);
		ticketbutton.addActionListener(Interfance.ticketbuttonHandler);
		this.setBounds(400, 200, 400, 200);
		this.setVisible(true);
	}
}
