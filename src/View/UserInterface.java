package View;

import Controller.MainController;
import Manager.TrainingPlan;
import Model.Achivement;
import Model.Button.*;
import Model.Exercise;
import Model.HockeyPlayer;
import Model.Reminder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class UserInterface extends JFrame {
    private final List<CommandButton> commandButtonList;
    private MainController controller;
    private final JFrame frame;

    public UserInterface(MainController controller) {
        frame = new JFrame("Mobile Trainer");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE); // при закрытии
        frame.setSize(500, 300); // размеры окна
        frame.setLocationRelativeTo(null); // позиция на экране
        frame.setVisible(true); // сделать видимым

        this.controller = controller;

        commandButtonList = new ArrayList<>();
        controller = new MainController();
        // System.out.println(controller.reminderManager.getExpectedReminders().size());
    }


    public void addButton(CommandButton commandButton) {
        commandButton.setVisible(false);
        commandButtonList.add(commandButton);
    }

    public void showMainMenu() {
        JPanel panel = new JPanel(new GridLayout(6, 1));

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
                showHockeyInfo();
            }
        });

        setListnerForButton = commandButtonList.get(commandButtonList.indexOf(new TrainingPlanButton()));
        setListnerForButton.setVisible(true);
        panel.add(setListnerForButton);
        setListnerForButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showTrainingPlan();
            }
        });
        setListnerForButton = commandButtonList.get(commandButtonList.indexOf(new ReminderButton()));
        setListnerForButton.setVisible(true);
        panel.add(setListnerForButton);
        setListnerForButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showReminderList();
            }
        });

        setListnerForButton = commandButtonList.get(commandButtonList.indexOf(new AchievementsButton()));
        setListnerForButton.setVisible(true);
        panel.add(setListnerForButton);
        setListnerForButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showAchivements();
            }
        });

        setListnerForButton = commandButtonList.get(commandButtonList.indexOf(new ExitButton()));
        setListnerForButton.setVisible(true);
        panel.add(setListnerForButton);
        setListnerForButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });

        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.setPreferredSize(new Dimension(300, 400));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }

    public void showTrainingPlan() {
        JPanel panel = new JPanel(new GridLayout(9, 1));

        JLabel topLabel = new JLabel("План тренировок");
        topLabel.setVerticalAlignment(JLabel.TOP);
        topLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(topLabel);

        if (controller.trainingPlansManager.getTrainingPlans().size() == 1) {
            controller.createTrainingPlan();
        }

        JButton firstButton = new JButton("Первый день");
        firstButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (TrainingPlan trainingPlan : controller.trainingPlansManager.getTrainingPlans()) {
                    if (trainingPlan.getDayOfWeek().equals(firstButton.getText())) {
                        controller.startTraining(trainingPlan);
                        showTraining(trainingPlan);
                    }
                }
            }
        });
        panel.add(firstButton);
        JButton secondButton = new JButton("Второй день");
        secondButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (TrainingPlan trainingPlan : controller.trainingPlansManager.getTrainingPlans()) {
                    if (trainingPlan.getDayOfWeek().equals(secondButton.getText())) {
                        controller.startTraining(trainingPlan);
                        showTraining(trainingPlan);
                    }
                }
            }
        });
        panel.add(secondButton);
        JButton thirdButton = new JButton("Третий день");
        thirdButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (TrainingPlan trainingPlan : controller.trainingPlansManager.getTrainingPlans()) {
                    if (trainingPlan.getDayOfWeek().equals(thirdButton.getText())) {
                        controller.startTraining(trainingPlan);
                        showTraining(trainingPlan);
                    }
                }
            }
        });
        panel.add(thirdButton);
        JButton fourthButton = new JButton("Четвертый день");
        fourthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (TrainingPlan trainingPlan : controller.trainingPlansManager.getTrainingPlans()) {
                    if (trainingPlan.getDayOfWeek().equals(fourthButton.getText())) {
                        controller.startTraining(trainingPlan);
                        showTraining(trainingPlan);
                    }
                }
            }
        });
        panel.add(fourthButton);
        JButton fifthButton = new JButton("Пятый день");
        fifthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (TrainingPlan trainingPlan : controller.trainingPlansManager.getTrainingPlans()) {
                    if (trainingPlan.getDayOfWeek().equals(fifthButton.getText())) {
                        controller.startTraining(trainingPlan);
                        showTraining(trainingPlan);
                    }
                }
            }
        });
        panel.add(fifthButton);
        JButton sixthButton = new JButton("Шестой день");
        sixthButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (TrainingPlan trainingPlan : controller.trainingPlansManager.getTrainingPlans()) {
                    if (trainingPlan.getDayOfWeek().equals(sixthButton.getText())) {
                        controller.startTraining(trainingPlan);
                        showTraining(trainingPlan);
                    }
                }
            }
        });
        panel.add(sixthButton);
        JButton seventhButton = new JButton("Седьмой день");
        seventhButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for (TrainingPlan trainingPlan : controller.trainingPlansManager.getTrainingPlans()) {
                    if (trainingPlan.getDayOfWeek().equals(seventhButton.getText())) {
                        controller.startTraining(trainingPlan);
                        showTraining(trainingPlan);
                    }
                }
            }
        });
        panel.add(seventhButton);


        CommandButton setListnerForButton;
        setListnerForButton = commandButtonList.get(commandButtonList.indexOf(new MainMenuButton()));
        setListnerForButton.setVisible(true);
        panel.add(setListnerForButton);
        setListnerForButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMainMenu();
            }
        });


        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.setPreferredSize(new Dimension(300, 400));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public void showTraining(TrainingPlan trainingPlan) {

        JPanel panel = new JPanel(new GridLayout(trainingPlan.getExercises().size() * 2 + 2, 1));

        JLabel topLabel = new JLabel("План тренировки");
        topLabel.setVerticalAlignment(JLabel.TOP);
        topLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(topLabel);

        JLabel exerciseLable = new JLabel();
        JLabel timeOut = new JLabel();
        for (Exercise exercise : trainingPlan.getExercises()) {
            if (exercise.getDuration() == 0) {
                exerciseLable = new JLabel(exercise.getName() + ": " + exercise.getNumberOfRepetitions() + " раз");
            }
            if (exercise.getNumberOfRepetitions() == 0) {
                exerciseLable = new JLabel(exercise.getName() + ": " + exercise.getDuration() + " минут");
            }
            panel.add(exerciseLable);
            timeOut = new JLabel("-------Перерыв------ " + trainingPlan.getTimeForRelax() + " минут");
            panel.add(timeOut);
        }

        CommandButton setListnerForButton;
        setListnerForButton = commandButtonList.get(commandButtonList.indexOf(new FinishWorkoutButton()));
        setListnerForButton.setVisible(true);
        panel.add(setListnerForButton);
        setListnerForButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.finishTraining(trainingPlan);
                showMainMenu();
            }
        });

        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.setPreferredSize(new Dimension(300, 400));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void showHockeyInfo() {
        JPanel panel = new JPanel(new GridLayout(14, 1));

        JLabel topLabel = new JLabel("Хоккеист");
        topLabel.setVerticalAlignment(JLabel.TOP);
        topLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(topLabel);

        if (controller.hockeyPlayer.getName() != null) {
            JLabel nameLable = new JLabel();
            nameLable.setText("Имя: " + controller.hockeyPlayer.getName());
            panel.add(nameLable);
            JLabel sexLable = new JLabel();
            sexLable.setText("Пол: " + controller.hockeyPlayer.getSex());
            panel.add(sexLable);
            JLabel yearLable = new JLabel();
            yearLable.setText("Год рождения: " + controller.hockeyPlayer.getYearOfBirth());
            panel.add(yearLable);
            JLabel hightLable = new JLabel();
            hightLable.setText("Рост: " + controller.hockeyPlayer.getHight());
            panel.add(hightLable);
            JLabel weightLable = new JLabel();
            weightLable.setText("Вес: " + controller.hockeyPlayer.getWeight());
            panel.add(weightLable);
            JLabel expLable = new JLabel();
            expLable.setText("Опыт в тренировках: " + controller.hockeyPlayer.getTrainingExperience());
            panel.add(expLable);
            JLabel bodyLable = new JLabel();
            bodyLable.setText("Телосложение: " + controller.hockeyPlayer.getBodyType());
            panel.add(bodyLable);
            JLabel pressureLable = new JLabel();
            pressureLable.setText("Давление: " + controller.hockeyPlayer.getPressure());
            panel.add(pressureLable);
            JLabel numberWorkoutsLable = new JLabel();
            numberWorkoutsLable.setText("Количество тренеровок без перерыва: " + controller.hockeyPlayer.getNumberWorkoutsWithoutBreaks());
            panel.add(numberWorkoutsLable);
            JLabel naxNumberLable = new JLabel();
            naxNumberLable.setText("Максимальное количество тренировок без перерыва: " + controller.hockeyPlayer.getMaxNumberWorkoutsWithoutBreaks());
            panel.add(naxNumberLable);
            JLabel desiredLable = new JLabel();
            desiredLable.setText("Желаемое количество тренировок: " + controller.hockeyPlayer.getDesiredNumberWorkoutsInWeek());
            panel.add(desiredLable);

            CommandButton setListnerForButton;
            setListnerForButton = commandButtonList.get(commandButtonList.indexOf(new EditButton()));
            setListnerForButton.setVisible(true);
            panel.add(setListnerForButton);
            setListnerForButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    editHockeyPlayer();
                }
            });

            setListnerForButton = commandButtonList.get(commandButtonList.indexOf(new MainMenuButton()));
            setListnerForButton.setVisible(true);
            panel.add(setListnerForButton);
            setListnerForButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    showMainMenu();
                }
            });
        } else {
            editHockeyPlayer();
            return;
        }

        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.repaint();
        frame.revalidate();
        frame.pack();
        frame.setLocationRelativeTo(null);

    }

    public void editHockeyPlayer() {
        JPanel panel = new JPanel(new GridLayout(13, 1));

        JLabel topLabel = new JLabel("Информация о хоккеисте");
        topLabel.setVerticalAlignment(JLabel.TOP);
        topLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(topLabel);

        JTextField jTextName = new JTextField(controller.hockeyPlayer.getName());
        panel.add(jTextName);

        String[] sex = {
                "man",
                "woman"
        };
        JComboBox<String> jSexBox = new JComboBox<>(sex);
        panel.add(jSexBox);
        JTextField jTextYear = new JTextField(Integer.toString(controller.hockeyPlayer.getYearOfBirth()));
        panel.add(jTextYear);

        JTextField jTextHight = new JTextField(Integer.toString(controller.hockeyPlayer.getHight()));
        panel.add(jTextHight);

        JTextField jTextWeight = new JTextField(Integer.toString(controller.hockeyPlayer.getWeight()));
        panel.add(jTextWeight);

        String[] experience = {
                "started",
                "few month",
                "not more than year",
                "more than year"

        };
        JComboBox<String> jExpBox = new JComboBox<>(experience);
        panel.add(jExpBox);

        String[] bodyType = {
                "thin",
                "average",
                "fat",
                "muscular"

        };
        JComboBox<String> jBodyBox = new JComboBox<>(bodyType);
        panel.add(jBodyBox);

        String[] pressure = {
                "less than normal",
                "normal",
                "more than normal"

        };
        JComboBox<String> jPressureBox = new JComboBox<>(pressure);
        panel.add(jPressureBox);

        JTextField jNumber = new JTextField(Integer.toString(controller.hockeyPlayer.getNumberWorkoutsWithoutBreaks()));
        panel.add(jNumber);

        JTextField jMax = new JTextField(Integer.toString(controller.hockeyPlayer.getMaxNumberWorkoutsWithoutBreaks()));
        panel.add(jMax);

        JTextField jDesired = new JTextField(Integer.toString(controller.hockeyPlayer.getDesiredNumberWorkoutsInWeek()));
        panel.add(jDesired);

        CommandButton setListnerForButton;
        setListnerForButton = commandButtonList.get(commandButtonList.indexOf(new SaveButton()));
        setListnerForButton.setVisible(true);
        panel.add(setListnerForButton);
        setListnerForButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HockeyPlayer hockeyPlayer = new HockeyPlayer(jTextName.getText(), (String) jSexBox.getSelectedItem(), Integer.parseInt(jTextYear.getText()),
                        Integer.parseInt(jTextHight.getText()), Integer.parseInt(jTextWeight.getText()), (String) jExpBox.getSelectedItem(), (String) jBodyBox.getSelectedItem(), (String) jPressureBox.getSelectedItem(),
                        Integer.parseInt(jNumber.getText()), Integer.parseInt(jMax.getText()), Integer.parseInt(jDesired.getText()));
                controller.checkHockeyPlayerInfo(hockeyPlayer);
                controller.checkCreateTrainingPlan(hockeyPlayer);
                showHockeyInfo();
            }
        });

        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.repaint();
        frame.revalidate();
        frame.pack();
        frame.setLocationRelativeTo(null);
    }


    public void showReminderList() {
        JPanel panel = new JPanel(new GridLayout(13, 1));

        JLabel topLabel = new JLabel("Список напоминаний");
        topLabel.setVerticalAlignment(JLabel.TOP);
        topLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(topLabel);
        int count = 4;
        for (Reminder reminder : controller.reminderManager.getExpectedReminders()) {
            JButton reminderButton = new JButton(reminder.getDayOfWeek() + " " + reminder.getTime());
            reminderButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    showReminder(reminder);
                }
            });
            count++;
            panel.add(reminderButton);
        }

        panel.setLayout(new GridLayout(count, 1));

        CommandButton setListnerForButton;
        setListnerForButton = commandButtonList.get(commandButtonList.indexOf(new AddButton()));
        setListnerForButton.setVisible(true);
        panel.add(setListnerForButton);
        setListnerForButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Reminder reminder = new Reminder();
                addRemider(reminder);
                return;
            }
        });

        setListnerForButton = new DeleteButton();
        setListnerForButton.setVisible(true);
        panel.add(setListnerForButton);
        setListnerForButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                deleteReminder();
            }
        });


        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.repaint();
        frame.revalidate();
        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    public void deleteReminder() {
        JPanel panel = new JPanel(new GridLayout(4, 1));

        JTextField jTextDay = new JTextField();
        panel.add(jTextDay);

        JTextField jTextTime = new JTextField();
        panel.add(jTextTime);

        CommandButton setListnerForButton;
        setListnerForButton = commandButtonList.get(commandButtonList.indexOf(new DeleteButton()));
        setListnerForButton.setVisible(true);
        panel.add(setListnerForButton);
        setListnerForButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Reminder newReminder = new Reminder(jTextDay.getText(), jTextTime.getText());
                controller.deleteReminder(newReminder);
                showMainMenu();
            }
        });

        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.repaint();
        frame.revalidate();
        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    public void showReminder(Reminder reminder) {
        JPanel panel = new JPanel(new GridLayout(4, 1));

        JLabel topLabel = new JLabel("Просмотр нопоминания");
        topLabel.setVerticalAlignment(JLabel.TOP);
        topLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(topLabel);

        JTextField jTextDay = new JTextField(reminder.getDayOfWeek());
        panel.add(jTextDay);

        JTextField jTextTime = new JTextField(reminder.getTime());
        panel.add(jTextTime);


        CommandButton setListnerForButton;
        setListnerForButton = commandButtonList.get(commandButtonList.indexOf(new SaveButton()));
        setListnerForButton.setVisible(true);
        panel.add(setListnerForButton);
        setListnerForButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                saveReminder(reminder, jTextDay.getText(), jTextTime.getText());
                showMainMenu();
                return;
            }
        });

        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.repaint();
        frame.revalidate();
        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    public void saveReminder(Reminder reminder, String day, String time) {
        reminder.setDayOfWeek(day);
        reminder.setTime(time);
    }

    public void addRemider(Reminder reminder) {
        JPanel panel = new JPanel(new GridLayout(4, 1));

        JLabel topLabel = new JLabel("Добавление напоминания");
        topLabel.setVerticalAlignment(JLabel.TOP);
        topLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(topLabel);

        JTextField jTextDay = new JTextField();
        panel.add(jTextDay);

        JTextField jTextTime = new JTextField();
        panel.add(jTextTime);

        CommandButton setListnerForButton;
        setListnerForButton = new SaveButton();
        setListnerForButton.setVisible(true);
        panel.add(setListnerForButton);
        setListnerForButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reminder.setDayOfWeek(jTextDay.getText());
                reminder.setTime(jTextTime.getText());
                controller.addReminder(reminder);
                showReminderList();
                return;
            }
        });

        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.repaint();
        frame.revalidate();
        frame.pack();
        frame.setLocationRelativeTo(null);

    }

    public void showAchivements(){
        JPanel panel = new JPanel(new GridLayout(4, 1));

        controller.updateAchive();
        JLabel topLabel = new JLabel("Список достижений");
        topLabel.setVerticalAlignment(JLabel.TOP);
        topLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(topLabel);
        int count = 4;
        for (Achivement achivement : controller.achivementManager.getExpectedAchivements()) {
            JButton reminderButton = new JButton(achivement.getName());
            reminderButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    showAchivement(achivement);
                }
            });
            count++;
            panel.add(reminderButton);
        }

        CommandButton setListnerForButton;
        setListnerForButton = new MainMenuButton();
        setListnerForButton.setVisible(true);
        panel.add(setListnerForButton);
        setListnerForButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMainMenu();
            }
        });
        panel.setLayout(new GridLayout(count, 1));

        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.repaint();
        frame.revalidate();
        frame.pack();
        frame.setLocationRelativeTo(null);
    }

    public void showAchivement(Achivement achivement){
        JPanel panel = new JPanel(new GridLayout(5, 1));

        JLabel topLabel = new JLabel(achivement.getName());
        topLabel.setVerticalAlignment(JLabel.TOP);
        topLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(topLabel);

        JLabel labelEx = new JLabel(achivement.getExercise());
        panel.add(labelEx);

        JLabel labelAim = new JLabel(Integer.toString(achivement.getAim()));
        panel.add(labelAim);

        JLabel labelCurrent = new JLabel(Integer.toString(achivement.getCurrentProgress()));
        panel.add(labelCurrent);

        CommandButton setListnerForButton;
        setListnerForButton = new MainMenuButton();
        setListnerForButton.setVisible(true);
        panel.add(setListnerForButton);
        setListnerForButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMainMenu();
            }
        });

        frame.getContentPane().removeAll();
        frame.getContentPane().add(panel);
        frame.repaint();
        frame.revalidate();
        frame.pack();
        frame.setLocationRelativeTo(null);
    }
}
