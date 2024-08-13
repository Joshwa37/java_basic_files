import java.awt.*;
import java.awt.event .*;
class Check
{
check()
{
Frame f=new Frame();
final Label l=new Label();
l.SetAlignment(l.CENTER);
l.SetSize(200,200);
Checkbox1 c=new Checkbox1();
Checkbox1.SetBounds(200,200,30,30);
Checkbox2 c1=new Checkbox2();
Checkbox2.SetBounds(300,300,40,40);
Checkbox3 c2=new Checkbox3();
Checkbox3.SetBounds(400,400,50,50);
Checkbox4 c3=new Checkbox4();
Checkbox4.SetBounds(500,500,60,0);
f.add(c);
f.add(c1);
f.add(c2);
f.add(c3);
f.add(l);
c.addItemListener(new ItemListener () {
public void itemstatechanged(ItemEvent e) {
l.SetText("c checklist:"+(e.getStateChange()== 1?"check":"uncheck"));
}
});
c1.addItemListener(new ItemListener () {
public void itemstatechanged(ItemEvent e) {
l.SetText("javachecklist:"+(e.getStateChange()== 1?"check":"uncheck"));
}
});
c2.addItemListener(new ItemListener () {
public void itemstatechanged(ItemEvent e) {
l.SetText("python checklist:"+(e.getStateChange()== 1?"check":"uncheck"));
}
});
c3.addItemListener(new ItemListener() {
public void itemstatechanged(ItemEvent e) {
l.SetText("c++ checklist:"+(e.getStateChange()== 1?"check":"uncheck"));
}
});
f.setSize(400,400);
f.setLayout(null);
f.setVisible(true);
}
public static void main(String [] args)
{
new check();
}
}