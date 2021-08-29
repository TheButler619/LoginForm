package za.ac.cput;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Home extends JFrame implements ActionListener {
    private JPanel panelNorth, panelCenter, panelSouth;
    private JButton btnCalender, btnTask, btnNotification, btnProgress, btnLogOut;
    private JLabel lblWelcome;

    public Home(){
        super("Home");
        panelNorth = new JPanel();
        panelCenter = new JPanel();
        panelSouth = new JPanel();
        btnCalender = new JButton("View Calender");
        btnNotification = new JButton("View Notifications");
        btnTask = new JButton("View Tasks");
        btnProgress = new JButton("View Progress");
        btnLogOut = new JButton("Log Out");
        lblWelcome = new JLabel("Welcome", SwingConstants.CENTER);
    }
    public void setGUI(){
        panelNorth.setLayout(new GridLayout(1,1));
        panelCenter.setLayout(new GridLayout(4,1,0,6));
        panelSouth.setLayout(new GridLayout(1,1));

        panelNorth.setBorder(BorderFactory.createEmptyBorder(20,0,0,0));
        panelCenter.setBorder(BorderFactory.createEmptyBorder(70,120,70,120));
        panelSouth.setBorder(BorderFactory.createEmptyBorder(0,250,25,250));

        //setting the GUI Background Color
        panelNorth.setBackground(new Color(0,29,64));
        panelCenter.setBackground(new Color(0,29,64));
        panelSouth.setBackground(new Color(0,29,64));

        btnTask.setPreferredSize(new Dimension(10, 40));
        btnNotification.setPreferredSize(new Dimension(10, 40));
        btnProgress.setPreferredSize(new Dimension(10, 40));
        btnCalender.setPreferredSize(new Dimension(10, 40));

        btnTask.setBackground(new Color(250, 134, 0));
        btnTask.setForeground(Color.white);
        btnNotification.setBackground(new Color(250, 134, 0));
        btnNotification.setForeground(Color.white);
        btnProgress.setBackground(new Color(250, 134, 0));
        btnProgress.setForeground(Color.white);
        btnCalender.setBackground(new Color(250, 134, 0));
        btnCalender.setForeground(Color.white);

        btnLogOut.setPreferredSize(new Dimension(70, 40));
        btnLogOut.setContentAreaFilled(false);
        btnLogOut.setBorder(null);
        btnLogOut.setBorderPainted(false);
        btnLogOut.setForeground(Color.white);

        panelCenter.add(btnCalender);
        panelCenter.add(btnTask);
        panelCenter.add(btnNotification);
        panelCenter.add(btnProgress);

        panelSouth.add(btnLogOut);

        btnCalender.addActionListener(this);
        btnProgress.addActionListener(this);
        btnNotification.addActionListener(this);
        btnTask.addActionListener(this);
        btnLogOut.addActionListener(this);

        this.add(panelNorth, BorderLayout.NORTH);
        this.add(panelCenter, BorderLayout.CENTER);
        this.add(panelSouth, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("View Calender")) {
            JOptionPane.showMessageDialog(null, "Opening calender");
        }
        else if (e.getActionCommand().equals("View Notifications")) {
            JOptionPane.showMessageDialog(null, "Viewing notifications");
        }
        else if (e.getActionCommand().equals("View Tasks")) {
            JOptionPane.showMessageDialog(null, "Displaying tasks");
        }
        else if (e.getActionCommand().equals("View Progress")) {
            JOptionPane.showMessageDialog(null, "Showing progress");
        }
        else if (e.getActionCommand().equals("Log Out")) {
            this.dispose();
            Login login = new Login();
            login.setLogin();
        }
    }

    public static void main(String[] args) {

        new Home().setGUI();
    }
}
