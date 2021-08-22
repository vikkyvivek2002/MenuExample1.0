import java.awt.*;  
class MenuExample1  
{  
     MenuExample1(){  
         Frame f= new Frame("Menu and MenuItem Example");
         MenuBar mb=new MenuBar();  
         f.setMenuBar(mb);  
         f.setSize(400,400);  
         f.setLayout(new FlowLayout());  
         f.setVisible(true);  
           
         Menu menu=new Menu("File");
	 mb.add(menu);
         MenuItem i1=new MenuItem("New");  
         MenuItem i2=new MenuItem("Open");  
         MenuItem i3=new MenuItem("Save");  
         Menu submenu=new Menu("Save As");  
	 menu.add(i1);  
         menu.add(i2);  
         menu.add(i3);  
         menu.add(submenu);          

	 MenuItem i4=new MenuItem(".jpg");  
         MenuItem i5=new MenuItem(".png");  
         submenu.add(i4);  
         submenu.add(i5);  
         
           
         }  
public static void main(String args[])  
{  
new MenuExample1();  
}  
}  