import java.awt.*;
import java.applet.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class collegelistsllb extends Applet implements ActionListener {
     Button a,b,c,d,e,f,g;
      
    public void init()
    {
     
    }
    public collegelistsllb()
    {
      Label  l1=new Label("                      List of Colleges                             ");
        add(l1);
      Button  a= new Button("Amity Law School");
       add(a);
        b= new Button("BLS Institute of Technology Management");
        c= new Button("Fairfield Institute of Management & Technology");
        d= new Button("JIMS Engg. Management Technical Campus,School of Law");
        e= new Button("University School of Law and Legal Studies");
        f= new Button("Vivekananda Institute of Professional Studies  "); 
           
     add(b);
     add(c);
     add(d);
     add(e);
     add(f);   
        a.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                Frame y = new Frame();
                y.setLayout(null);
                Button r =new Button("Details");
                y.add(r);
                y.setVisible(true);
                
                
            }

      });
         b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                Frame x = new Frame();
                x.setLayout(null);
                Button p =new Button("Details");
                x.add(p);
                x.setVisible(true);
                
                
            }

      });
         c.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                Frame z = new Frame();
                z.setLayout(null);
                Button t =new Button("Details");
                z.add(t);
                z.setVisible(true);
                
                
            }

      });
          d.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                Frame j = new Frame();
                j.setLayout(null);
                Button s =new Button("Details");
                j.add(s);
                j.setVisible(true);
                
                
            }

      });
           e.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                Frame k = new Frame();
                k.setLayout(null);
                Button o =new Button("Details");
                k.add(o);
                k.setVisible(true);
                
                
            }

      });
            f.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae)
            {
                Frame y = new Frame();
                y.setLayout(null);
                Button m =new Button("Details");
                y.add(m);
                y.setVisible(true);
                
                
            }

      });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
