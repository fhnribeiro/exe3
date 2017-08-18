/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exr3;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import static java.lang.Math.sqrt;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author 11944413600
 */
public class Janela extends JFrame{
    
    private final JTextField textA = new JTextField(2);
    private final JLabel lblEntrada = new JLabel("x² + ");
    private final JTextField textB = new JTextField(2);
    private final JLabel lblEntrada2 = new JLabel("x");    
    private final JLabel lblEntrada3 = new JLabel(" + ");
    private final JTextField textC = new JTextField(2);
    private final JLabel lblResult = new JLabel("Resultado: ");
    private final JButton btn1 = new JButton("Calcular");
    private final JButton btnSimples = new JButton("Calcular");
    int a=0;
    int b=0;
    int c=0;
    int delta,x1,x2=0;
    public Janela() throws HeadlessException{
        super("Equação segundo grau");
        setLayout(new FlowLayout(FlowLayout.CENTER));
        
        add(textA);
        add(lblEntrada);
        
        add(textB);
        add(lblEntrada2);
        
        add(lblEntrada3);
        add(textC);
        add(btn1);
        add(lblResult);
        
        
    }
    
    public float delta(int a,int b,int c){
        return b^2-4*a*c;
    }
    
    public float raizes(int a,int b,int c,int delta){
        return (float) (-b*sqrt(delta))/-2*a;
    }
    
}