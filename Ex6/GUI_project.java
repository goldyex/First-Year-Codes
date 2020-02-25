/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class GUI_project extends JFrame {

	private JMenuBar menuBar;
	private JButton button1;
	private JButton button2;
	private JTextArea textarea4;
	private JTextArea textarea5;

	//Constructor 
	public GUI_project(){

		this.setTitle("GUI_project");
		this.setSize(500,400);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setPreferredSize(new Dimension(500,400));
		contentPane.setBackground(new Color(192,192,192));


		button1 = new JButton();
		button1.setBounds(35,6,112,36);
		button1.setBackground(new Color(214,217,223));
		button1.setForeground(new Color(0,0,0));
		button1.setEnabled(true);
		button1.setFont(new Font("sansserif",0,12));
		button1.setText("Add Sport Car");
		button1.setVisible(true);
		//Set action for button click
		//Call defined method
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				CreateSportCar(evt);
			}
		});


		button2 = new JButton();
		button2.setBounds(321,7,90,35);
		button2.setBackground(new Color(214,217,223));
		button2.setForeground(new Color(0,0,0));
		button2.setEnabled(true);
		button2.setFont(new Font("sansserif",0,12));
		button2.setText("Add Van");
		button2.setVisible(true);
		//Set action for button click
		//Call defined method
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				CreateVan(evt);
			}
		});


		textarea4 = new JTextArea();
		textarea4.setBounds(16,51,150,150);
		textarea4.setBackground(new Color(255,255,255));
		textarea4.setForeground(new Color(0,0,0));
		textarea4.setEnabled(true);
		textarea4.setFont(new Font("sansserif",0,12));
		textarea4.setText("JTextArea");
		textarea4.setBorder(BorderFactory.createBevelBorder(1));
		textarea4.setVisible(true);

		textarea5 = new JTextArea();
		textarea5.setBounds(289,51,150,150);
		textarea5.setBackground(new Color(255,255,255));
		textarea5.setForeground(new Color(0,0,0));
		textarea5.setEnabled(true);
		textarea5.setFont(new Font("sansserif",0,12));
		textarea5.setText("JTextArea");
		textarea5.setBorder(BorderFactory.createBevelBorder(1));
		textarea5.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(textarea4);
		contentPane.add(textarea5);

		//adding panel to JFrame and seting of window position and close operation
		this.add(contentPane);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//Method actionPerformed for button1
	private void CreateSportCar (ActionEvent evt) {
			SportCar Car1 = new SportCar(200,1500,220);
			double CarConsumption= CalculateFuel(Car1.getHP(), Car1.getWeight(), Car1.getAerodynamics(), Car1.getTopSpeed()); 
			textarea4.setText("Info: \n Horsepower: " +Car1.getHP() + "\n Weight: " +Car1.getWeight() + "\n Aerodynamics Value: " +Car1.getAerodynamics()
			+"\n Top speed: " +Car1.getTopSpeed()
			+"\n Consumption "+ CarConsumption +"\n Acceleration: "+ Car1.acceleration());
			
	}

	//Method actionPerformed for button2
	private void CreateVan (ActionEvent evt) {
			Van van = new Van(100, 3500, 160.4);
			double VanConsumption = CalculateFuel(van.getHP(), van.getWeight(), van.getAerodynamics(), van.getVanSpeed()); 
			textarea5.setText("Info: \n Horsepower: " +van.getHP() + "\n Weight: " +van.getWeight() + "\n Aerodynamics Value: " +van.getAerodynamics()
			+"\n Top speed: " +van.getVanSpeed()
			+"\n Consumption "+ VanConsumption +"\n Acceleration: " + van.acceleration());
	}
	
	public static double CalculateFuel(double horsepower, double weight, double aerodynamics, double topspeed){
          double ConsumptionCalculate= (1000+(weight/5))*(topspeed/100)*(aerodynamics*horsepower)/10000;
          //Now to round the value to 2 decimal places
          ConsumptionCalculate = Math.round(ConsumptionCalculate * 100.0) / 100.0;
          return ConsumptionCalculate;
      }

	//method for generate menu
	public void generateMenu(){
		menuBar = new JMenuBar();

		JMenu file = new JMenu("File");
		JMenu tools = new JMenu("Tools");
		JMenu help = new JMenu("Help");

		JMenuItem open = new JMenuItem("Open   ");
		JMenuItem save = new JMenuItem("Save   ");
		JMenuItem exit = new JMenuItem("Exit   ");
		JMenuItem preferences = new JMenuItem("Preferences   ");
		JMenuItem about = new JMenuItem("About   ");


		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);
		tools.add(preferences);
		help.add(about);

		menuBar.add(file);
		menuBar.add(tools);
		menuBar.add(help);
	}



	 public static void main(String[] args){
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new GUI_project();
			}
		});
	}

}