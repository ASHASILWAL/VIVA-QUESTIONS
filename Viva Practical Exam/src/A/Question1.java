package A;

	import java.awt.Color;
	import java.awt.FlowLayout;
	import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;

	import javax.swing.JFrame;
	import javax.swing.JLabel;
	import javax.swing.JTextField;

	public class Question1 extends JFrame implements MouseListener {
	JLabel l1,l2 ,l3;
	JTextField t1,t2;
	Question1()
	{
	l1 = new JLabel("Num1");
	t1 = new JTextField(10);
	l2 = new JLabel("Num2");
	t2 = new JTextField(10);
	l3 = new JLabel("Result");
	add(l1);
	add(t1);
	add(l2);
	add(t2);
	add(l3);
	setLayout(new FlowLayout());
	setVisible(true);
	setSize(400,500);
	addMouseListener(this);
	// addMouseListener(this);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
	try{
	int num1 ,num2,result;
	num1 = Integer.parseInt(t1.getText());
	num2 = Integer.parseInt(t2.getText());
	result = num1 + num2;
	l3.setText(result + "");
	l3.setForeground(Color.green);
	// TODO Auto-generated method stub
	}
	catch(Exception ex)
	{
	System.out.println(ex.getMessage());
	}

	}

	@Override
	public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	try{
	int num1 ,num2,result;
	num1 = Integer.parseInt(t1.getText());
	num2 = Integer.parseInt(t2.getText());
	result = num1 -num2;
	l3.setText(result + "");
	l3.setForeground(Color.BLUE);
	}
	catch(Exception ex)
	{
	System.out.println(ex.getMessage());
	}
	}
	public static void main(String[]args)
	{
	new Question1();
	}
	}

