import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class yerdle {

        private ArrayList<String> data = new ArrayList<String>();
        private String word;
        private String guess;
        private boolean flag;

    public yerdle() {
        word = "";
        guess = "";
        flag = false;
    }

    // This funcion pseudorandomly chooses a word from a text file
    public void getWord()throws IOException {
        File words = new File("wordle-words\\word-bank.md");
        Scanner input = new Scanner(words);

        while (input.hasNextLine() == true)
            data.add(input.nextLine().toLowerCase().trim());
        input.close();

        System.out.println(data.size() + " words have been loaded.");

        Random random = new Random();
        int key = random.nextInt(data.size());

        guess = data.get(key);
        System.out.println("The Word to be guessed is " + guess);
    }

    /*
    * This function was created for the purpose of user validation
    * It takes the word as an argument and returns a boolean value.
    */
    public boolean check(){

        word = word.toLowerCase().trim();
        boolean test = false;

        for (int a = 0; a<data.size(); a++){
            if (data.get(a).equals(word) == true){
                test = true;
                break;
            }
        }
        return test;
    }

    public void display() throws IOException {

        JFrame frame = new JFrame("JERDLE - THE JAVA WORDLE CLONE");

        JLabel Heading = new JLabel("JERDLE - THE JAVA WORDLE CLONE");
        Heading.setBounds(55,40,500,50);
            frame.add(Heading);

        // Calculating the coordinates of the boxes
        int x=55, y=95;

        JTextField t00 = new JTextField("");
        t00.setBounds(x,y,50,50);
            frame.add(t00);
            x+=60;
        JTextField t01 = new JTextField("");
        t01.setBounds(x,y,50,50);
            frame.add(t01);
            x+=60;
        JTextField t02 = new JTextField("");
        t02.setBounds(x,y,50,50);
            frame.add(t02);
            x+=60;
        JTextField t03 = new JTextField("");
        t03.setBounds(x,y,50,50);
            frame.add(t03);
            x+=60;
        JTextField t04 = new JTextField("");
            t04.setBounds(x,y,50,50);
            frame.add(t04);
            x+=60;
        JButton l1 = new JButton("1");
            l1.setBounds(x,y,50,50);
            frame.add(l1);

        x=55; y+=60;

        JTextField t10 = new JTextField("");
        t10.setBounds(x,y,50,50);
            frame.add(t10);
            x+=60;
        JTextField t11 = new JTextField("");
        t11.setBounds(x,y,50,50);
            frame.add(t11);
            x+=60;
        JTextField t12 = new JTextField("");
        t12.setBounds(x,y,50,50);
            frame.add(t12);
            x+=60;
        JTextField t13 = new JTextField("");
        t13.setBounds(x,y,50,50);
            frame.add(t13);
            x+=60;
        JTextField t14 = new JTextField("");
        t14.setBounds(x,y,50,50);
            frame.add(t14);
            x+=60;
        JButton l2 = new JButton("2");
            l2.setBounds(x,y,50,50);
            frame.add(l2);

        x=55; y+=60;

        JTextField t20 = new JTextField("");
        t20.setBounds(x,y,50,50);
            frame.add(t20);
            x+=60;
        JTextField t21 = new JTextField("");
        t21.setBounds(x,y,50,50);
            frame.add(t21);
            x+=60;
        JTextField t22 = new JTextField("");
        t22.setBounds(x,y,50,50);
            frame.add(t22);
            x+=60;
        JTextField t23 = new JTextField("");
        t23.setBounds(x,y,50,50);
            frame.add(t23);
            x+=60;
        JTextField t24 = new JTextField("");
        t24.setBounds(x,y,50,50);
            frame.add(t24);
            x+=60;
        JButton l3 = new JButton("3");
            l3.setBounds(x,y,50,50);
            frame.add(l3);


        x=55; y+=60;

        JTextField t30 = new JTextField("");
        t30.setBounds(x,y,50,50);
            frame.add(t30);
            x+=60;
        JTextField t31 = new JTextField("");
        t31.setBounds(x,y,50,50);
            frame.add(t31);
            x+=60;
        JTextField t32 = new JTextField("");
        t32.setBounds(x,y,50,50);
            frame.add(t32);
            x+=60;
        JTextField t33 = new JTextField("");
        t33.setBounds(x,y,50,50);
            frame.add(t33);
            x+=60;
        JTextField t34 = new JTextField("");
        t34.setBounds(x,y,50,50);
            frame.add(t34);
            x+=60;
        JButton l4 = new JButton("4");
            l4.setBounds(x,y,50,50);
            frame.add(l4);

        
        x=55; y+=60;

        JTextField t40 = new JTextField("");
        t40.setBounds(x,y,50,50);
            frame.add(t40);
            x+=60;
        JTextField t41 = new JTextField("");
        t41.setBounds(x,y,50,50);
            frame.add(t41);
            x+=60;
        JTextField t42 = new JTextField("");
        t42.setBounds(x,y,50,50);
            frame.add(t42);
            x+=60;
        JTextField t43 = new JTextField("");
        t43.setBounds(x,y,50,50);
            frame.add(t43);
            x+=60;
        JTextField t44 = new JTextField("");
        t44.setBounds(x,y,50,50);
            frame.add(t44);
            x+=60;
        JButton l5 = new JButton("5");
            l5.setBounds(x,y,50,50);
            frame.add(l5);


        x=55; y+=60;

        JTextField t50 = new JTextField("");
        t50.setBounds(x,y,50,50);
            frame.add(t50);
            x+=60;
        JTextField t51 = new JTextField("");
        t51.setBounds(x,y,50,50);
            frame.add(t51);
            x+=60;
        JTextField t52 = new JTextField("");
        t52.setBounds(x,y,50,50);
            frame.add(t52);
            x+=60;
        JTextField t53 = new JTextField("");
        t53.setBounds(x,y,50,50);
            frame.add(t53);
            x+=60;
        JTextField t54 = new JTextField("");
        t54.setBounds(x,y,50,50);
            frame.add(t54);
            x+=60;
        JButton l6 = new JButton("6");
            l6.setBounds(x,y,50,50);
            frame.add(l6);
            
        x=55; y+=60;
        
        JTextArea access = new JTextArea("");
            access.setBounds(x,y, 350, 50);
            frame.add(access);

        //Properties of the frame
		frame.setSize(470, 560);
		frame.setLayout(null);
		frame.setVisible(true);

        // Operations of the first row
        l1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                word+=t00.getText().toLowerCase().trim().charAt(0);
                word+=t01.getText().toLowerCase().trim().charAt(0);
                word+=t02.getText().toLowerCase().trim().charAt(0);
                word+=t03.getText().toLowerCase().trim().charAt(0);
                word+=t04.getText().toLowerCase().trim().charAt(0);

                System.out.println("The first guessed word is " + word);

                if (word.equals(guess))
                    access.setText("You have entered the correct word! : " + guess);
                else
                    access.setText("You have entered the incorrect word! Try Again!");
                
                if (check() == true){
                    //First Character
                    if(word.charAt(0)==guess.charAt(0))
                        t00.setBackground(Color.GREEN);
                    else if(word.charAt(0)!=guess.charAt(0)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(0)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t00.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t00.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Second Character
                    if(word.charAt(1)==guess.charAt(1))
                        t01.setBackground(Color.GREEN);
                    else if(word.charAt(1)!=guess.charAt(1)){

                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(1)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t01.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t01.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Third Character
                    if(word.charAt(2)==guess.charAt(2))
                        t02.setBackground(Color.GREEN);
                    else if(word.charAt(2)!=guess.charAt(2)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(2)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t02.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t02.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Fourth Character
                    if(word.charAt(3)==guess.charAt(3))
                        t03.setBackground(Color.GREEN);
                    else if(word.charAt(3)!=guess.charAt(3)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(3)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t03.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t03.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Fifth Character
                        if(word.charAt(4)==guess.charAt(4))
                            t04.setBackground(Color.GREEN);
                        else if(word.charAt(4)!=guess.charAt(4)){
                            for(int a = 0; a<guess.length(); a++) {
                                if(word.charAt(4)==guess.charAt(a))
                                    flag=true;
                            }
                            if(flag==true)
                                t04.setBackground(Color.YELLOW);
                            else if(flag!=true)
                                t04.setBackground(Color.GRAY);
                        }
                    }
                    else{
                        System.out.println("NOT IN WORD LIST!");
                        access.setText("NOT IN WORD LIST!");

                        t00.setBackground(Color.RED);
                        t01.setBackground(Color.RED);
                        t02.setBackground(Color.RED);
                        t03.setBackground(Color.RED);
                        t04.setBackground(Color.RED);
                    }
                    
                    word="";
                    flag=false;
                }
            });

            // Operations of the second row
            l2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                    word+=t10.getText().toLowerCase().trim().charAt(0);
                    word+=t11.getText().toLowerCase().trim().charAt(0);
                    word+=t12.getText().toLowerCase().trim().charAt(0);
                    word+=t13.getText().toLowerCase().trim().charAt(0);
                    word+=t14.getText().toLowerCase().trim().charAt(0);

                    System.out.println("The second guessed word is " + word);

                    if (word.equals(guess))
                        access.setText("You have entered the correct word! : " + guess);
                    else
                        access.setText("You have entered the incorrect word! Try Again!");

                    if (check() == true){

                        //First Character
                        if(word.charAt(0)==guess.charAt(0))
                            t10.setBackground(Color.GREEN);
                        else if(word.charAt(0)!=guess.charAt(0)){
                            for(int a = 0; a<guess.length(); a++) {
                                if(word.charAt(0)==guess.charAt(a))
                                    flag=true;
                            }
                            if(flag==true)
                                t10.setBackground(Color.YELLOW);
                            else if(flag!=true)
                                t10.setBackground(Color.GRAY);
                        }
                        flag=false;

                        //Second Character
                        if(word.charAt(1)==guess.charAt(1))
                            t11.setBackground(Color.GREEN);
                        else if(word.charAt(1)!=guess.charAt(1)){

                            for(int a = 0; a<guess.length(); a++) {
                                if(word.charAt(1)==guess.charAt(a))
                                    flag=true;
                            }
                            if(flag==true)
                                t11.setBackground(Color.YELLOW);
                            else if(flag!=true)
                                t11.setBackground(Color.GRAY);
                        }
                        flag=false;

                        //Third Character
                        if(word.charAt(2)==guess.charAt(2))
                            t12.setBackground(Color.GREEN);
                        else if(word.charAt(2)!=guess.charAt(2)){
                            for(int a = 0; a<guess.length(); a++) {
                                if(word.charAt(2)==guess.charAt(a))
                                    flag=true;
                            }
                            if(flag==true)
                                t12.setBackground(Color.YELLOW);
                            else if(flag!=true)
                                t12.setBackground(Color.GRAY);
                        }
                        flag=false;

                        //Fourth Character
                        if(word.charAt(3)==guess.charAt(3))
                            t13.setBackground(Color.GREEN);
                        else if(word.charAt(3)!=guess.charAt(3)){
                            for(int a = 0; a<guess.length(); a++) {
                                if(word.charAt(3)==guess.charAt(a))
                                    flag=true;
                            }
                            if(flag==true)
                                t13.setBackground(Color.YELLOW);
                            else if(flag!=true)
                                t13.setBackground(Color.GRAY);
                        }
                        flag=false;

                        //Fifth Character
                        if(word.charAt(4)==guess.charAt(4))
                            t14.setBackground(Color.GREEN);
                        else if(word.charAt(4)!=guess.charAt(4)){
                            for(int a = 0; a<guess.length(); a++) {
                                if(word.charAt(4)==guess.charAt(a))
                                    flag=true;
                            }
                            if(flag==true)
                                t14.setBackground(Color.YELLOW);
                            else if(flag!=true)
                                t14.setBackground(Color.GRAY);
                        }
                    }
                    else{
                        System.out.println("NOT IN WORD LIST!");
                        access.setText("NOT IN WORD LIST!");

                        t10.setBackground(Color.RED);
                        t11.setBackground(Color.RED);
                        t12.setBackground(Color.RED);
                        t13.setBackground(Color.RED);
                        t14.setBackground(Color.RED);
                    }
                
                    word="";
                    flag=false;
                }
            });        

        // Operations of the Third Row
        l3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                word+=t20.getText().toLowerCase().trim().charAt(0);
                word+=t21.getText().toLowerCase().trim().charAt(0);
                word+=t22.getText().toLowerCase().trim().charAt(0);
                word+=t23.getText().toLowerCase().trim().charAt(0);
                word+=t24.getText().toLowerCase().trim().charAt(0);

                System.out.println("The third guessed word is " + word);

                if (word.equals(guess))
                    access.setText("You have entered the correct word! : " + guess);
                else
                    access.setText("You have entered the incorrect word! Try Again!");

                if (check() == true){

                    //First Character
                    if(word.charAt(0)==guess.charAt(0))
                        t20.setBackground(Color.GREEN);
                    else if(word.charAt(0)!=guess.charAt(0)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(0)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t20.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t20.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Second Character
                    if(word.charAt(1)==guess.charAt(1))
                        t21.setBackground(Color.GREEN);
                    else if(word.charAt(1)!=guess.charAt(1)){

                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(1)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t21.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t21.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Third Character
                    if(word.charAt(2)==guess.charAt(2))
                        t22.setBackground(Color.GREEN);
                    else if(word.charAt(2)!=guess.charAt(2)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(2)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t22.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t22.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Fourth Character
                    if(word.charAt(3)==guess.charAt(3))
                        t23.setBackground(Color.GREEN);
                    else if(word.charAt(3)!=guess.charAt(3)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(3)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t23.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t23.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Fifth Character
                    if(word.charAt(4)==guess.charAt(4))
                        t24.setBackground(Color.GREEN);
                    else if(word.charAt(4)!=guess.charAt(4)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(4)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t24.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t24.setBackground(Color.GRAY);
                    }
                }
                else{
                    System.out.println("NOT IN WORD LIST!");
                    access.setText("NOT IN WORD LIST!");

                    t20.setBackground(Color.RED);
                    t21.setBackground(Color.RED);
                    t22.setBackground(Color.RED);
                    t23.setBackground(Color.RED);
                    t24.setBackground(Color.RED);
                }
        
                word="";
                flag=false;
            }
        });

        // Operations of the Fourth Row
        l4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                word+=t30.getText().toLowerCase().trim().charAt(0);
                word+=t31.getText().toLowerCase().trim().charAt(0);
                word+=t32.getText().toLowerCase().trim().charAt(0);
                word+=t33.getText().toLowerCase().trim().charAt(0);
                word+=t34.getText().toLowerCase().trim().charAt(0);

                System.out.println("The fourth guessed word is "+word);
                
                if (word.equals(guess))
                    access.setText("You have entered the correct word! : " + guess);
                else
                    access.setText("You have entered the incorrect word! Try Again!");

                if (check() == true){

                    //First Character
                    if(word.charAt(0)==guess.charAt(0))
                        t30.setBackground(Color.GREEN);
                    else if(word.charAt(0)!=guess.charAt(0)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(0)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t30.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t30.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Second Character
                    if(word.charAt(1)==guess.charAt(1))
                        t31.setBackground(Color.GREEN);
                    else if(word.charAt(1)!=guess.charAt(1)){

                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(1)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t31.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t31.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Third Character
                    if(word.charAt(2)==guess.charAt(2))
                        t32.setBackground(Color.GREEN);
                    else if(word.charAt(2)!=guess.charAt(2)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(2)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t32.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t32.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Fourth Character
                    if(word.charAt(3)==guess.charAt(3))
                        t33.setBackground(Color.GREEN);
                    else if(word.charAt(3)!=guess.charAt(3)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(3)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t33.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t33.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Fifth Character
                    if(word.charAt(4)==guess.charAt(4))
                        t34.setBackground(Color.GREEN);
                    else if(word.charAt(4)!=guess.charAt(4)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(4)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t34.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t34.setBackground(Color.GRAY);
                    }
                }
                else{
                    System.out.println("NOT IN WORD LIST!");
                    access.setText("NOT IN WORD LIST!");

                    t30.setBackground(Color.RED);
                    t31.setBackground(Color.RED);
                    t32.setBackground(Color.RED);
                    t33.setBackground(Color.RED);
                    t34.setBackground(Color.RED);
                }
                
                word="";
                flag=false;
            }
        });

        // Operations of the Fifth Row
        l5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                word+=t40.getText().toLowerCase().trim().charAt(0);
                word+=t41.getText().toLowerCase().trim().charAt(0);
                word+=t42.getText().toLowerCase().trim().charAt(0);
                word+=t43.getText().toLowerCase().trim().charAt(0);
                word+=t44.getText().toLowerCase().trim().charAt(0);

                System.out.println("The fifth guessed word is " + word);

                if (word.equals(guess))
                    access.setText("You have entered the correct word! : " + guess);
                else
                    access.setText("You have entered the incorrect word! Try Again!");

                if (check() == true){

                    //First Character
                    if(word.charAt(0)==guess.charAt(0))
                        t40.setBackground(Color.GREEN);
                    else if(word.charAt(0)!=guess.charAt(0)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(0)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t40.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t40.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Second Character
                    if(word.charAt(1)==guess.charAt(1))
                        t41.setBackground(Color.GREEN);
                    else if(word.charAt(1)!=guess.charAt(1)){

                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(1)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t41.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t41.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Third Character
                    if(word.charAt(2)==guess.charAt(2))
                        t42.setBackground(Color.GREEN);
                    else if(word.charAt(2)!=guess.charAt(2)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(2)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t42.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t42.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Fourth Character
                    if(word.charAt(3)==guess.charAt(3))
                        t43.setBackground(Color.GREEN);
                    else if(word.charAt(3)!=guess.charAt(3)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(3)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t43.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t43.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Fifth Character
                    if(word.charAt(4)==guess.charAt(4))
                        t44.setBackground(Color.GREEN);
                    else if(word.charAt(4)!=guess.charAt(4)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(4)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t44.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t44.setBackground(Color.GRAY);
                    }
                }
                else{
                    System.out.println("NOT IN WORD LIST!");
                    access.setText("NOT IN WORD LIST!");

                    t40.setBackground(Color.RED);
                    t41.setBackground(Color.RED);
                    t42.setBackground(Color.RED);
                    t43.setBackground(Color.RED);
                    t44.setBackground(Color.RED);
                }
        
                word="";
                flag=false;
            }
        });

        // Operations of the Sixth Row
        l6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                word+=t50.getText().toLowerCase().trim().charAt(0);
                word+=t51.getText().toLowerCase().trim().charAt(0);
                word+=t52.getText().toLowerCase().trim().charAt(0);
                word+=t53.getText().toLowerCase().trim().charAt(0);
                word+=t54.getText().toLowerCase().trim().charAt(0);

                System.out.println("The sixth guessed word is "+word);

                if (word.equals(guess))
                    access.setText("You have entered the correct word! : " + guess);
                else
                    access.setText("You have entered the incorrect word! Try Again!");

                if (check() == true){

                    //First Character
                    if(word.charAt(0)==guess.charAt(0))
                        t50.setBackground(Color.GREEN);
                    else if(word.charAt(0)!=guess.charAt(0)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(0)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t50.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t50.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Second Character
                    if(word.charAt(1)==guess.charAt(1))
                        t51.setBackground(Color.GREEN);
                    else if(word.charAt(1)!=guess.charAt(1)){

                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(1)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t51.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t51.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Third Character
                    if(word.charAt(2)==guess.charAt(2))
                        t52.setBackground(Color.GREEN);
                    else if(word.charAt(2)!=guess.charAt(2)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(2)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t52.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t52.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Fourth Character
                    if(word.charAt(3)==guess.charAt(3))
                        t53.setBackground(Color.GREEN);
                    else if(word.charAt(3)!=guess.charAt(3)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(3)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t53.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t53.setBackground(Color.GRAY);
                    }
                    flag=false;

                    //Fifth Character
                    if(word.charAt(4)==guess.charAt(4))
                        t54.setBackground(Color.GREEN);
                    else if(word.charAt(4)!=guess.charAt(4)){
                        for(int a = 0; a<guess.length(); a++) {
                            if(word.charAt(4)==guess.charAt(a))
                                flag=true;
                        }
                        if(flag==true)
                            t54.setBackground(Color.YELLOW);
                        else if(flag!=true)
                            t54.setBackground(Color.GRAY);
                    }
                }
                else{
                    System.out.println("NOT IN WORD LIST!");
                    access.setText("NOT IN WORD LIST!");

                    t50.setBackground(Color.RED);
                    t51.setBackground(Color.RED);
                    t52.setBackground(Color.RED);
                    t53.setBackground(Color.RED);
                    t54.setBackground(Color.RED);
                }
                
                word="";
                flag=false;
            }
        });
    }
    
    public static void main(String[] args) {
        yerdle solve = new yerdle();
        try {
            solve.getWord();
            solve.display();
        } catch(IOException e) {
            System.out.println("Input/Output Error!");
        }
    }
}

/*
 * Program creaed by Yeshua Joseph D'Costa
 * To be continued
 * I will be back...
*/