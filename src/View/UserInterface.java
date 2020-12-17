package View;

import Model.Button.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class UserInterface extends JFrame {
    private final List<CommandButton> commandButtonList;
    private Container container;
    JFrame frame;

    public UserInterface(){
        frame = new JFrame("Mobile Trainer");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE); // при закрытии
        frame.setSize(500, 300); // размеры окна
        frame.setLocationRelativeTo(null); // позиция на экране
        frame.setVisible(true); // сделать видимым

        commandButtonList = new ArrayList<>();

    }


    public void addButton(CommandButton commandButton){
        commandButton.setVisible(false);
        commandButtonList.add(commandButton);
    }

    public void showMainMenu(){
        JPanel panel = new JPanel(new GridLayout(6,1));

        JLabel topLabel = new JLabel("Главное окно");
        topLabel.setVerticalAlignment(JLabel.TOP);
        topLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(topLabel);

        //Включение нужных кнопок и добавление их на страницу
        CommandButton setListnerForButton;
        setListnerForButton = commandButtonList.get(commandButtonList.indexOf(new HockeyPlayerButton()));
        setListnerForButton.setVisible(true);
        panel.add(setListnerForButton);
        setListnerForButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showTrainingPlan();
            }
        });

        commandButtonList.get(commandButtonList.indexOf(new TrainingPlanButton())).setVisible(true);
        panel.add(commandButtonList.get(commandButtonList.indexOf(new TrainingPlanButton())));

        commandButtonList.get(commandButtonList.indexOf(new ReminderButton())).setVisible(true);
        panel.add(commandButtonList.get(commandButtonList.indexOf(new ReminderButton())));

        commandButtonList.get(commandButtonList.indexOf(new AchievementsButton())).setVisible(true);
        panel.add(commandButtonList.get(commandButtonList.indexOf(new AchievementsButton())));

        commandButtonList.get(commandButtonList.indexOf(new ExitButton())).setVisible(true);
        panel.add(commandButtonList.get(commandButtonList.indexOf(new ExitButton())));

        frame.getContentPane().add(panel);
        frame.setPreferredSize(new Dimension(300, 400));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }

    public void showTrainingPlan(){
        JPanel panel = new JPanel(new GridLayout(6,1));

        JLabel topLabel = new JLabel("План тренировок");
        topLabel.setVerticalAlignment(JLabel.TOP);
        topLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(topLabel);

    }
}
