package com.company;

import javax.swing.*;
import java.awt.*;

public class Formulario extends JFrame {
    private JLabel etiqueta;
    private JLabel etiqueta2;
    private JLabel etiqueta3;
    private JLabel etiqueta4;
    private JTextField campo1;
    private JTextField campo2;
    private JTextField campo3;
    private JTextField campo4;
    private JLabel etiqueta5;
    private  JRadioButton boton;
    private  JRadioButton button2;
    private  JRadioButton button3;
    private  JButton tecla;
    public Formulario(){
        super("Formulario de Peronal");
        setSize(700,666);
        setLayout(new FlowLayout());
        setLayout(null);
        etiqueta=new JLabel("Nombre");
        etiqueta.setBounds(1,1,100,100);
        add(etiqueta);
        campo1=new JTextField(1);
        campo1.setBounds(100,35,300,25);
        add(campo1);
        etiqueta2=new JLabel("Apellido");
        etiqueta2.setBounds(2,2,200,200);
        add(etiqueta2);
        campo2=new JTextField(1);
        campo2.setBounds(100,85,300,25);
        add(campo2);
        etiqueta3= new JLabel("C.I");
        etiqueta3.setBounds(3,3,300,300);
        add(etiqueta3);
        campo3=new JTextField(1);
        campo3.setBounds(100,135,300,25);
        add(campo3);
        etiqueta4=new JLabel("Emitido en ");
        etiqueta4.setBounds(4,4,400,400);
        add(etiqueta4);
        campo4=new JTextField(1);
        campo4.setBounds(100,190,300,25);
        add(campo4);
        etiqueta5=new JLabel("Intereses");
        etiqueta5.setBounds(5,5,500,500);
        add(etiqueta5);
        boton=new JRadioButton("Deporte");
        boton.setBounds(50,270,300,25);
        add(boton);
        button2=new JRadioButton("Musica");
        button2.setBounds(50,300,300,25);
        add(button2);
        button3=new JRadioButton("Tecnologia");
        button3.setBounds(50,330,300,25);
        add(button3);
        tecla=new JButton("Guardar");
        tecla.setBounds(200,400,250,25);
        add(tecla);


    }
}
