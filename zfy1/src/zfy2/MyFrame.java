package zfy2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class MyFrame extends JFrame {
	public static void main(String[] args) {
		new MyFrame();
	}
	public MyFrame(){
		Container container = getContentPane();
		container.setLayout(null);
		JLabel jl = new JLabel("����һ��JFrame����");
		jl.setHorizontalAlignment(SwingConstants.CENTER);
		container.add(jl);
		JButton bl = new JButton("�����Ի���");
		bl.setBounds(10,10,100,21);
		bl.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new MyJDialog(MyFrame.this).setVisible(true);			
			}
		});
		container.add(bl);
		container.setVisible(true);
		container.setSize(200, 150);
	}
	
	
}
class MyJDialog extends JDialog{
	public MyJDialog(MyFrame frame) {
		super(frame,"��һ��JDialog����",true);
		Container container = getContentPane();
		container.add(new JLabel("����һ���Ի���"));
		setBounds(120,120,100,100);
	}
}