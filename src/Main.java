import java.io.File;
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


class Game extends JFrame implements ActionListener {
    Container c;
    JButton button1, button2, button3, button4, button5;
    JLabel label1, label2, label3, label4, heading, heading2;


    Random random;
    int userScore = 0;
    int computerScore = 0;


    Game() {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(new Color(44, 62, 80));


        button1 = new JButton("Rock");
        button2 = new JButton("Paper");
        button3 = new JButton("Scissor");
        button1.setFont(new Font("Arial", Font.BOLD, 16));
        button2.setFont(new Font("Arial", Font.BOLD, 16));
        button3.setFont(new Font("Arial", Font.BOLD, 16));
        button1.setBounds(350, 300, 100, 40);
        button2.setBounds(450, 300, 100, 40);
        button3.setBounds(550, 300, 100, 40);
        button1.setBackground(new Color(52, 152, 219)); // Set button background color
        button2.setBackground(new Color(231, 76, 60));
        button3.setBackground(new Color(46, 204, 113));
        button1.setForeground(Color.white); // Set button text color
        button2.setForeground(Color.white);
        button3.setForeground(Color.white);

        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);

        label1 = new JLabel("User");
        label2 = new JLabel("Computer");
        label1.setBounds(340, 150, 100, 40);
        label2.setBounds(620, 150, 100, 40);

        label1.setForeground(new Color(231, 76, 60)); // Set label1 text color to red
        label1.setFont(new Font("Arial", Font.BOLD, 20)); // Set label1 font family, size, and style

        label2.setForeground(new Color(52, 152, 219)); // Set label2 text color to blue
        label2.setFont(new Font("Arial", Font.BOLD, 18));


        button4 = new JButton("Choice");
        button4.addActionListener(this);
        button5 = new JButton("Computer");
        button4.setBackground(new Color(46, 204, 113));// Set button background color
        button5.setBackground(new Color(149, 165, 166));

        button4.setBackground(new Color(231, 76, 60)); // Set button background color
        button5.setBackground(new Color(52, 152, 219));
        button4.setForeground(Color.white); // Set button text color
        button5.setForeground(Color.white);

        button4.setBounds(310, 200, 100, 40);
        button5.setBounds(600, 200, 120, 40);

        label3 = new JLabel(Integer.toString(userScore));
        label4 = new JLabel(Integer.toString(computerScore));

        label3.setBounds(450, 200, 100, 40);
        label4.setBounds(550, 200, 100, 40);
        label3.setFont(new Font("arial", Font.BOLD, 20));
        label4.setFont(new Font("arial", Font.BOLD, 20));
        label3.setForeground(new Color(46, 204, 113));
        label4.setForeground(new Color(149, 165, 166));

        heading = new JLabel("Rock Paper Scissor Game");
        heading.setBounds(280, 0, 500, 70);
        heading.setFont(new Font("Arial", Font.BOLD, 40));
        heading.setForeground(new Color(0, 255, 0));

        c.add(button1);
        c.add(button2);
        c.add(button3);
        c.add(label1);
        c.add(label2);
        c.add(button4);
        c.add(button5);
        c.add(label3);
        c.add(label4);
        c.add(heading);


        heading2 = new JLabel("User vs Computer");
        heading2.setBounds(350, 60, 500, 70);
        heading2.setFont(new Font("Arial", Font.BOLD, 40));
        heading2.setForeground(new Color(255, 255, 0));

        c.add(heading2);

//        ImageIcon icon1 = new ImageIcon("/home/learner/Documents/folder1/project/rock-paper-scissor/src/color.jpg");
//
//
//        JLabel imageLabel = new JLabel(icon1);
//        imageLabel.setBounds(0, 0, 1000, 500);
//
//        c.add(imageLabel);


        random = new Random();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String randomChoice[] = {"Rock", "Paper", "Scissor"};
        int randomNumber = random.nextInt(3);

        if (e.getSource() == button1) {
            String userChoice = "Rock";
            String computerChoice = randomChoice[randomNumber];

            button4.setText(userChoice);
            button5.setText(computerChoice);

            if (userChoice == computerChoice) {
                // ---> Tie the game
            } else if (userChoice.equals("Rock") && computerChoice.equals("Scissor") ||
                    userChoice.equals("Paper") && computerChoice.equals("Rock") ||
                    userChoice.equals("Scissor") && computerChoice.equals("Paper")) {
                // User wins
                userScore++;
            } else {
                // Computer wins
                computerScore++;
            }

            label3.setText(Integer.toString(userScore));
            label4.setText(Integer.toString(computerScore));

        } else if (e.getSource() == button2) {

            String userChoice = "Paper";
            String computerChoice = randomChoice[randomNumber];
            button4.setText(userChoice);
            button5.setText(computerChoice);

            if (userChoice == computerChoice) {
                // ---> Tie the game
            } else if (userChoice.equals("Rock") && computerChoice.equals("Scissor") ||
                    userChoice.equals("Paper") && computerChoice.equals("Rock") ||
                    userChoice.equals("Scissor") && computerChoice.equals("Paper")) {
                // User wins
                userScore++;
            } else {
                // Computer wins
                computerScore++;
            }


            label3.setText(Integer.toString(userScore));
            label4.setText(Integer.toString(computerScore));


        } else if (e.getSource() == button3) {

            String userChoice = "Scissor";
            String computerChoice = randomChoice[randomNumber];
            button4.setText(userChoice);
            button5.setText(computerChoice);

            if (userChoice == computerChoice) {
                // ---> Tie the game
            } else if (userChoice.equals("Rock") && computerChoice.equals("Scissor") ||
                    userChoice.equals("Paper") && computerChoice.equals("Rock") ||
                    userChoice.equals("Scissor") && computerChoice.equals("Paper")) {
                // User wins
                userScore++;
            } else {
                // Computer wins
                computerScore++;
            }

            label3.setText(Integer.toString(userScore));
            label4.setText(Integer.toString(computerScore));
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Game obj1 = new Game();
        obj1.setBounds(250, 100, 1000, 500);
        obj1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        obj1.setVisible(true);
        obj1.setTitle("Rock-Paper-Scissor");


    }
}