import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ColorPalette extends JFrame implements ActionListener 
{
private JTextField textField;
private Panel colorPanel;
private JRadioButton backgroundRadio;
private JRadioButton foregroundRadio;
public ColorPalette() 
{
        setTitle("Applet Viewer");
        setLayout(new BorderLayout());
        textField = new JTextField();
        add(textField, BorderLayout.NORTH);
        colorPanel = new Panel();
        colorPanel.setLayout(new GridLayout(5, 5));
        Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE,
                           Color.PINK, Color.CYAN, Color.MAGENTA, Color.LIGHT_GRAY, Color.DARK_GRAY,
                           Color.BLACK, Color.WHITE, Color.GRAY, Color.LIGHT_GRAY, Color.DARK_GRAY,
                           Color.BLACK, Color.WHITE, Color.GRAY, Color.LIGHT_GRAY, Color.DARK_GRAY,
                           Color.BLACK, Color.WHITE, Color.GRAY, Color.LIGHT_GRAY, Color.DARK_GRAY };
        for (Color color : colors) {
            JButton button = new JButton();
            button.setBackground(color);
            button.addActionListener(this);
            colorPanel.add(button);
        }
        add(colorPanel, BorderLayout.CENTER);

       
        backgroundRadio = new JRadioButton("Background");
        foregroundRadio = new JRadioButton("Foreground");

 
        ButtonGroup group = new ButtonGroup();
        group.add(backgroundRadio);
        group.add(foregroundRadio);

      
        JPanel radioPanel = new JPanel();
        radioPanel.add(backgroundRadio);
        radioPanel.add(foregroundRadio);
        add(radioPanel, BorderLayout.SOUTH);

        
        backgroundRadio.addActionListener(this);
        foregroundRadio.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
{
        if (e.getSource() instanceof JButton) 
{
            JButton clickedButton = (JButton) e.getSource();
            Color buttonColor = clickedButton.getBackground();
            if (backgroundRadio.isSelected())
 {
                textField.setBackground(buttonColor);
 }
 else if (foregroundRadio.isSelected())
 {
textField.setForeground(buttonColor);
 }
 }
 }

    public static void main(String[] args) 

{
new ColorPalette();
       
 }
}