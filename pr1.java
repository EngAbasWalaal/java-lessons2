import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class pr1 {


    public static void main(String[] args) {
       Frame frame=new Frame("Registration Form");
       frame.setSize(350, 500);
       frame.setLayout(new FlowLayout());

       Label medicineName=new Label("Enter the name of medicine:");
       frame.add(medicineName);
       TextField textField=new TextField(); 
       Dimension textFieldSize = new Dimension(300, 34);
       textField.setPreferredSize(textFieldSize);
       frame.add(textField);
         
       Label quantity=new Label("Enter the quantity:");
       frame.add(quantity);

       TextField quantityText=new TextField(40);
       Dimension textQuantitySize = new Dimension(300, 34);
       quantityText.setPreferredSize(textQuantitySize);
       frame.add(quantityText);
    
        Label rateLabel=new Label("Enter price rate ");
        frame.add(rateLabel);
        TextField rateText=new TextField(40);
        frame.add(rateText);

        Button btn=new Button("Calculate");
        Dimension buttonSize = new Dimension(200, 50);
        btn.setPreferredSize(buttonSize);
        btn.setBackground(Color.blue);
        btn.setForeground(Color.WHITE);
        frame.add(btn);

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String medicine = textField.getText().toUpperCase();
                int quantity = Integer.parseInt(quantityText.getText());
                double rate = Double.parseDouble(rateText.getText());
                double totalPrice = Math.round(quantity * rate);
 
                Label resultLabel = new Label(medicine+" Price: $" + totalPrice);
                frame.add(resultLabel);
                frame.revalidate();
                frame.repaint();
            }
        });
       frame.setVisible(true);
    }
}
