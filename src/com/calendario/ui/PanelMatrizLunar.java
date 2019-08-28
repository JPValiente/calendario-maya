
package com.calendario.ui;

import com.faselunar.ConstanteFaseLunar;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

/**
 *
 * @author bryan
 */
public class PanelMatrizLunar extends JPanel implements ActionListener,ComponentListener{
    private JButton[][] mCasillas;
    private int nFilas;
    private int mColumnas;
    private ConstanteFaseLunar constLunar;
    private MainFrame frame;
    
    public PanelMatrizLunar(MainFrame frame) {
        this.frame = frame;
        this.mCasillas = null;
        this.nFilas = 5;
        this.mColumnas = 7;
        this.setLayout(null);
        this.setBackground(Color.GRAY);
        this.addComponentListener(this);
        
    }
    
    public void ordenar(){
        int anchoTotal = this.getWidth();
        int altoTotal = this.getHeight();
        int anchoDeCasilla = anchoTotal/mColumnas;
        int altoDeCasilla = altoTotal/nFilas;
        for (int fila = 0; fila < nFilas; fila++) {
            for (int columna = 0; columna < mColumnas; columna++) {
                //obtenemos referencia al boton actual
                JButton temp = mCasillas[fila][columna];
                //fijar cada casilla
                temp.setBounds(columna*anchoDeCasilla, fila*altoDeCasilla, anchoDeCasilla, altoDeCasilla);
            }
        }
    }
    
    public void inicializar(){
        int fase = 0;
        mCasillas = new JButton[nFilas][mColumnas];
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < mColumnas; j++) {
                constLunar = new ConstanteFaseLunar(fase);
                JButton temp = new JButton();
                if (fase<=29) {
                    establecerAtributosCasilla(temp, constLunar, fase);
                    temp.setName(""+fase);
                    this.add(temp);
                }
                     
                mCasillas[i][j] = temp;
                fase ++;
            }
        }
    }
    
    public void establecerAtributosCasilla(JButton temp, ConstanteFaseLunar constLunar, int fase){
        ImageIcon icon = new ImageIcon(constLunar.obtenerRutaImagen());
        temp.setForeground(Color.RED);
        temp.setBorder(new BevelBorder(1));
        temp.setIcon(icon);
        
        temp.setIconTextGap(1);
        temp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        temp.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        temp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        temp.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        temp.setText("Fase_"+fase);
        //lanzando evento de cada boton
        temp.addActionListener(this);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //boton presionado
        if (e.getSource() instanceof JButton) {
            JButton temp = (JButton)e.getSource();
            //temp.setBackground(Color.YELLOW);
            System.out.println(""+temp.getName());
            InfoFaseLunar info = new InfoFaseLunar(frame, Integer.parseInt(temp.getName()));
            info.setVisible(true);
            
        }
        
    }

    @Override
    public void componentResized(ComponentEvent e) {
        this.ordenar();
    }

    @Override
    public void componentMoved(ComponentEvent e) {
    }

    @Override
    public void componentShown(ComponentEvent e) {
    }

    @Override
    public void componentHidden(ComponentEvent e) {
    }
    
}
