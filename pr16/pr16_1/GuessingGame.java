package pr16.pr16_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.Math;

class GuessingGame extends JFrame {
    JButton tryButton = new JButton("Отправить");
    JTextField numberField = new JTextField(2);
    JLabel stateText = new JLabel("Угадайте число (от 0 до 20)");
    int guessNumber = (int) (Math.random()*20);
    int cnt =0;

    public GuessingGame(){
        super("Игра");
        setDefaultCloseOperation( EXIT_ON_CLOSE);
        setSize(300, 300);

        JPanel grid = new JPanel(new GridLayout(3,1,5,0));
        grid.add(stateText);
        grid.add(numberField);
        grid.add(tryButton);

        JPanel flowButton = new JPanel(new FlowLayout(FlowLayout.CENTER));
        flowButton.add(grid);

        Container window = getContentPane();
        window.add(flowButton);

        tryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int userNumber = Integer.parseInt(numberField.getText());
                if (userNumber==guessNumber){
                    stateText.setText("Вы выиграли");
                    numberField.setVisible(false);
                    tryButton.setVisible(false);
                }
                else if (userNumber!=guessNumber){
                    if (userNumber<guessNumber){
                        stateText.setText("Число больше");
                    }
                    else {
                        stateText.setText("Число меньше");
                    }
                }
                cnt++;
                if (cnt==3 && userNumber!= guessNumber){
                    stateText.setText("Вы проиграли");
                    System.out.println(guessNumber);
                    numberField.setVisible(false);
                    tryButton.setVisible(false);
                }
            }
        });
    }

    public static void main(String[] args) {
        new GuessingGame().setVisible(true);
    }
}