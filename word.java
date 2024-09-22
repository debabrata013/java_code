import java.awt.*;
import java.awt.event.*;
public class word extends Frame {
    word(){
   TextField     inputTextField = new TextField(20);
   inputTextField.setBounds(50,50,150,200);
        Button countButton = new Button("Count");

     Label   wordCountLabel = new Label("Words: 0");
     Label   charCountLabel = new Label("Characters: 0");

        add(inputTextField);
        add(countButton);
        add(wordCountLabel);
        add(charCountLabel);

        countButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                String text = inputTextField.getText();

                charCountLabel.setText("Characters: " + text.length());

                String words[] = text.split("\\s");
                wordCountLabel.setText("Words: " + words.length);
            }
        });

        setSize(250, 150);
        setVisible(true);
    }
    public static void main(String[] args) {
        new word();
    }
    
}
