package L;
//hola m
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.WindowConstants;
import java.util.Scanner;
import javax.swing.Action;

public class L extends JFrame {

    private JPanel panelBotones;
private int matrizX[][];
    public L(int filas, int columnas) {
        initComponents(filas, columnas);

    }
   int v = 2;
 private static int f= 2;
    private void initComponents(int filas, int columnas) {

        panelBotones = new JPanel();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(true);
        getContentPane().setLayout(new BorderLayout(2, 0));

        panelBotones.setLayout(new GridLayout(filas, columnas, 2, 2));
matrizX=new int[filas][columnas];
        for (int i = 0; i < filas; i++) {

            for (int j = 0; j < columnas; j++) {

                JButton boton = new JButton();
                boton.setText(" ");
                panelBotones.add(boton);
                int x = i;
                int y = j;

                boton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                            boton.setText(Motrar(x, y));
                            for (int k = 0; k < filas; k++) {
                                for (int l = 0; l < columnas; l++) {
                                 f=+matrizX[k][l];   
                                }
                                if(f==filas){
                                    System.out.println("gano o");
                                }else if(f==filas*2){
                                    System.out.println("Gano x");
                                }
                        }
                        
                            
                    }
                });
            }
        }

        getContentPane().add(panelBotones, BorderLayout.SOUTH);
        setTitle("TicTac");
        pack();
        setVisible(true);
    }
    public String Motrar(int i, int j) {
if (v==2){
    v=1;
    matrizX[i][j]=1;
    return "O"; 
}else {
    v=2;
    matrizX[i][j]=2;
    return "X";
}
        
    
    }

    
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese las Filas: \n");
        int filas = input.nextInt();

        System.out.print("Ingrese las Filas: \n");
        int columnas = input.nextInt();
        L v = new L(filas, columnas);
    }
}
