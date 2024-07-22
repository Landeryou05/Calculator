package com.calculator;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static String displayedText = "";
    public static Integer number1;
    public static Integer number2;
    public static Character operator;
    

    public static void main(String[] args) {
        Frame mainFrame = new Frame();
        JLabel entryText = new JLabel();
        JPanel entry = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel numbers = new JPanel(new GridLayout(4, 3));

        String[] numbersArray = {"1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "x", "0", "RESET", "=", "/"};

        for(int i = 0; i < numbersArray.length; i++){
            Button numberButton = new Button(numbersArray[i]);
            numberButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    switch (numberButton.getLabel()) {
                        case "RESET":
                            number1 = 0;
                            number2 = 0;
                            operator = null;
                            displayedText = "";
                            entryText.setText(displayedText);
                            break;

                        case "=":
                            number2 = Integer.parseInt(entryText.getText());
                            Calculations calculations = new Calculations();
                            if(operator == '+'){
                                Integer answer = calculations.addition(number1, number2);
                                String displayAnswer = Integer.toString(answer);
                                entryText.setText(displayAnswer);
                            }

                            if(operator == '-'){
                                Integer answer = calculations.subtraction(number1, number2);
                                String displayAnswer = Integer.toString(answer);
                                entryText.setText(displayAnswer);
                            }

                            if(operator == 'x'){
                                Integer answer = calculations.multiplication(number1, number2);
                                String displayAnswer = Integer.toString(answer);
                                entryText.setText(displayAnswer);
                            }

                            if(operator == '/'){
                                Integer answer = calculations.division(number1, number2);
                                String displayAnswer = Integer.toString(answer);
                                entryText.setText(displayAnswer);
                            }
                            break;

                        case "+":
                            number1 = Integer.parseInt(entryText.getText());
                            operator = '+';
                            displayedText = "";
                            entryText.setText(displayedText);
                            break;

                        case "-":
                            number1 = Integer.parseInt(entryText.getText());
                            operator = '-';
                            displayedText = "";
                            entryText.setText(displayedText);
                            break;

                        case "/":
                            number1 = Integer.parseInt(entryText.getText());
                            operator = '/';
                            displayedText = "";
                            entryText.setText(displayedText);
                            break;

                        case "x":
                            number1 = Integer.parseInt(entryText.getText());
                            operator = 'x';
                            displayedText = "";
                            entryText.setText(displayedText);
                            break;
                    
                        default:
                            String number = numberButton.getLabel();
                            displayedText += number;
                            entryText.setText(displayedText);
                    }
                }
            });
            numbers.add(numberButton);
        }

        entryText.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 35));
        entryText.setPreferredSize(new Dimension(200, 50));

        entry.setBorder(new LineBorder(Color.black, 3, true));
        entry.setBorder(new EmptyBorder(25, 5, 25, 25));
        entry.add(entryText);

        mainFrame.getContentPane().add(entry, BorderLayout.NORTH);
        mainFrame.getContentPane().add(numbers, BorderLayout.CENTER);
    }
}   