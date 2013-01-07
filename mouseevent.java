import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class mouseevent extends Applet implements MouseListener
{
 String str="";
 public void init()
 {
  addMouseListener(this);
 }
public void paint(Graphics g)
 {
  g.drawString(str,50,50);
 }
public void mouseEntered(MouseEvent me)
 {
  str="Mouse Is Entered";
  repaint();
 }
public void mouseExited(MouseEvent me)
 {
  str="Mouse Is Exited";
  repaint();
 }
public void mouseClicked(MouseEvent me)
 {
  str="Mouse Is Clicked";
  repaint();
 }
public void mousePressed(MouseEvent me)
 {
  str="Mouse Is Pressed";
  repaint();
 }
public void mouseReleased(MouseEvent me)
 {
  str="Mouse Is Released";
  repaint();
 }
}
/*<applet code=mouseevent width=300 height=300>
</applet>*/ 