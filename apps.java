import java.awt.*;
import java.awt.Color;
class Apps
{
	public static void main(String args[])
	{
	Frame f=new Frame();
    f.setTitle("notepad");
    f.setSize(200,500);
    f.setLayout(new FlowLayout());
	Label l1=new Label("reg no");
    TextField tf1=new TextField(20);
	Label l2=new Label("Username");
	TextField tf2=new TextField(20);
	Label l3=new Label("password");
	TextField tf3=new TextField(20);
	Button login= new Button("LOGIN");
	l1.setForeground(Color.BLUE);
	l2.setForeground(Color.GREEN);
	l3.setForeground(Color.RED);
	f.add(l1);
	f.add(tf1);
	f.add(l2);
	f.add(tf2);
	f.add(l3);
	f.add(tf3);
	f.add(login);
	f.setVisible(true);
	}
}	