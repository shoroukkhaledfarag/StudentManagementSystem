import javax.swing.*;
import java.awt.*;

public class StudentManagementSystemApplication {
    private final String url = "jdbc:postgresql://localhost/StudentManagementSystem";
    private final String user = "postgres";
    private final String password = "<add your password>";
    public StudentManagementSystemApplication(){
        intialize();
    }
    private static  void intialize()
    {
        JFrame frame = new JFrame("Student_Management_System_Application");
        JButton button = new JButton("Close");
        button.addActionListener(e -> {
//            frame.dispose();
            System.out.println("Button pressed!");
        });
        button.setPreferredSize(new Dimension(20, 30));
        frame.setContentPane(button);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(1000, 1000));
        frame.getContentPane().setBackground(Color.ORANGE);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        StudentManagementSystemApplication system = new StudentManagementSystemApplication();
    }
}
