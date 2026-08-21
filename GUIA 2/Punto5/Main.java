import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame implements MouseListener,ActionListener {
    private JPanel panel;
    private JTextArea area;
    private JButton azul,verde,rojo,limpiar,salir;
    public Main(){
        setTitle("Ventana con eventos");
        setSize(600,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        //Panel Superior
        panel = new JPanel();
        panel.setBackground(Color.GREEN);
        panel.addMouseListener(this);
        panel.setPreferredSize(new Dimension(600,250));
        add(panel,BorderLayout.NORTH);
        
        //area de texto
        area = new JTextArea();
        area.setEditable(false);
        JScrollPane scroll = new JScrollPane(area);
        add(scroll,BorderLayout.CENTER);

        // Botones
        JPanel botones = new JPanel();
        azul = new JButton("Azul");
        verde = new JButton("Verde");
        rojo = new JButton("Rojo");
        limpiar = new JButton("Limpiar");
        salir = new JButton("Salir");

        botones.add(azul);
        botones.add(verde);
        botones.add(rojo);
        botones.add(limpiar);
        botones.add(salir);

        add(botones,BorderLayout.SOUTH);

        //Evento de botones
        azul.addActionListener(this);
        verde.addActionListener(this);
        rojo.addActionListener(this);
        limpiar.addActionListener(this);
        salir.addActionListener(this);

        setVisible(true);
        
    }

    //Eventos del mouse
    @Override
    public void mouseEntered(MouseEvent e) {
        area.append("Evento ENTRAR AL PANEL en coordenadas ("
                + e.getX() + "," + e.getY() + ")\n");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        area.append("Evento SALIR DEL PANEL en coordenadas ("
                + e.getX() + "," + e.getY() + ")\n");
    }
    @Override
    public void mouseClicked(MouseEvent e){
        String boton;
        if(e.getButton() == MouseEvent.BUTTON1)
            boton="IZQUIERDO";
        else
            if(e.getButton() == MouseEvent.BUTTON3)
                boton="DERECHO";
             else
                boton="CENTRAL";
     area.append("Evento CLICK, con BOTON "+boton+" en coordenadas ("+e.getX()+","+e.getY()+")\n");
    }
    @Override
    public void mousePressed(MouseEvent e){}
    @Override
    public void mouseReleased(MouseEvent e){}

    //Eventos de botones
    @Override
    public void actionPerformed(ActionEvent e){
        Object b=e.getSource();
        if(b==azul){
            panel.setBackground(Color.BLUE);
            area.append("Boton azul presionando\n");
        }
        else
            if(b==verde){
                panel.setBackground(Color.GREEN);
                area.append("Boton verde presionando\n");
            }
            else
                if(b==rojo){
                    panel.setBackground(Color.RED);
                    area.append("Boton rojo presionando\n");
                }
                else
                    if(b==limpiar){
                        area.setText("");
                    }
                    else
                        if(b==salir)
                            System.exit(0);
    }

    public static void main(String args[]){
    new Main();

    }

}
