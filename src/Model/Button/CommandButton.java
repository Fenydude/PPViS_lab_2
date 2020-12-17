package Model.Button;

import javax.swing.*;
import java.awt.event.ActionListener;

public class CommandButton extends JButton {
    private String nameButton;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommandButton that = (CommandButton) o;

        return nameButton != null ? nameButton.equals(that.nameButton) : that.nameButton == null;
    }

    @Override
    public int hashCode() {
        return nameButton != null ? nameButton.hashCode() : 0;
    }

    public CommandButton(String nameButton){
        super(nameButton);
    }

    @Override
    public void addActionListener(ActionListener l) {
        super.addActionListener(l);
    }
}
