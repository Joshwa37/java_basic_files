import java.awt.*;
import java.awt.event.*;
public class ColorPalette extends Frame implements ActionListener 
{
private TextField textField;
private Panel colorPanel;
public ColorPalette() 
{
Checkbox c1=new Checkbox();
Checkbox c2=new Checkbox();
        setTitle("AppletViewer");
        setLayout(new BorderLayout());
        textField = new TextField();
        add(textField, BorderLayout.NORTH);
        colorPanel = new Panel();
        colorPanel.setLayout(new GridLayout(5, 5));
        Color[] colors = { Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.ORANGE,
                           Color.PINK, Color.CYAN, Color.MAGENTA, Color.LIGHT_GRAY, Color.DARK_GRAY,
                           Color.BLACK, Color.WHITE, Color.GRAY, Color.LIGHT_GRAY, Color.DARK_GRAY,
                           Color.BLACK, Color.WHITE, Color.GRAY, Color.LIGHT_GRAY, Color.DARK_GRAY,
                           Color.BLACK, Color.WHITE, Color.GRAY, Color.LIGHT_GRAY, Color.DARK_GRAY };
        for (Color color : colors) {
            Button button = new Button();
            button.setBackground(color);
            button.addActionListener(this);
            colorPanel.add(button);
        }
        add(colorPanel, BorderLayout.CENTER);

       
        c1= new Checkbox("Background");
        c2= new Checkbox("Foreground");

 
        
        add(c1);
        add(c2);

   
        
        c1=addActionListener(this);
        c2=addActionListener(this);

       
        setSize(400, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
{
        if (e.getSource() instanceof Button) 
{
            Button clickedButton = (Button) e.getSource();
            Color buttonColor = clickedButton.getBackground();
            if (c1.isSelected())
 {
                textField.setBackground(buttonColor);
 }
 else if (c2.isSelected())
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