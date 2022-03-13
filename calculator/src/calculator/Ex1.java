package calculator;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;


public class Ex1 extends JFrame implements ActionListener, KeyListener{

	int displayMode;

	Panel jp = new Panel();
	Button[] jb = new Button[10];
	Button plusbtn=new Button("+");
	Button minusbtn=new Button("-");
	Button multibtn=new Button("*");
	Button divbtn=new Button("/");
	Button equalbtn=new Button("=");
	Button dotbtn=new Button(".");

	Label prev = new Label("");
	Label operator = new Label("");
	Label flag = new Label("");
	Label displaylabel = new Label("0");

	public Ex1() {
		this.setLayout(new BorderLayout());
		jp.setLayout(new GridLayout(4,4,5,5));

		for (int i = 7; i <=9; i++) {
			jb[i]=new Button(Integer.toString(i));
			jb[i].setBackground(new Color(255,224,32));
			jp.add(jb[i]);
			jb[i].addActionListener(this);
			jb[i].addKeyListener(this);
		}

		jp.add(plusbtn,"+");
		plusbtn.setBackground(new Color(255,0,0));
		plusbtn.addActionListener(this);
		plusbtn.addKeyListener(this);


		for (int j = 4; j <=6; j++) {
			jb[j]=new Button(Integer.toString(j));
			jb[j].setBackground(new Color(255,224,32));
			jp.add(jb[j]);
			jb[j].addActionListener(this);
			jb[j].addKeyListener(this);
		}

		jp.add(minusbtn,"-");
		minusbtn.setBackground(new Color(255,0,0));
		minusbtn.addActionListener(this);
		minusbtn.addKeyListener(this);

		for (int k = 1; k <=3; k++) {
			jb[k]=new Button(Integer.toString(k));
			jb[k].setBackground(new Color(255,224,32));
			jp.add(jb[k]);
			jb[k].addActionListener(this);
			jb[k].addKeyListener(this);
		}

		jp.add(multibtn,"*");
		multibtn.setBackground(new Color(255,0,0));
		multibtn.addActionListener(this);
		multibtn.addKeyListener(this);

		jb[0]=new Button(Integer.toString(0));
		jb[0].setBackground(new Color(255,224,32));
		jp.add(jb[0]);
		jb[0].addActionListener(this);
		jb[0].addKeyListener(this);

		jp.add(dotbtn,".");
		dotbtn.setBackground(new Color(255,224,32));
		dotbtn.addActionListener(this);
		dotbtn.addKeyListener(this);

		jp.add(equalbtn,"=");
		equalbtn.setBackground(new Color(255,0,0));
		equalbtn.addActionListener(this);
		equalbtn.addKeyListener(this);

		jp.add(divbtn,"/");
		divbtn.setBackground(new Color(255,0,0));
		divbtn.addActionListener(this);
		divbtn.addKeyListener(this);
        
		this.add(jp,BorderLayout.CENTER);
		this.add(displaylabel, BorderLayout.NORTH);
		displaylabel.setAlignment(Label.RIGHT);
		displaylabel.setBackground(new Color(0,192,0));

		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
}

@Override
public void actionPerformed(ActionEvent e) {
	for (int i = 0; i < jb.length; i++) {
		if (e.getSource()==jb[i]) {
			if (displaylabel.getText().equals("0")) {
				displaylabel.setText(""+i);
			} 
            else {
				displaylabel.setText(displaylabel.getText()+i);
			}
			System.out.println(jb[i].getLabel());
	} 
}

if (e.getSource()==equalbtn) {
	double op1,op2,result;
	op1=Double.parseDouble(prev.getText());
	op2=Double.parseDouble(displaylabel.getText());

	if (operator.getText().equals("+")) {
		result=op1+op2;
		displaylabel.setText(Double.toString(result));
	}
	if (operator.getText().equals("-")) {
		result=op1-op2;
		displaylabel.setText(Double.toString(result));
	}
	if (operator.getText().equals("*")) {
		result=op1*op2;
		displaylabel.setText(Double.toString(result));
	}
	if (operator.getText().equals("/")) {
		result=op1/op2;
		displaylabel.setText(Double.toString(result));
	}
}

if (e.getSource()==plusbtn) {
	prev.setText(displaylabel.getText());
	operator.setText("+");
	displaylabel.setText("");
}

if (e.getSource()==minusbtn) {
	prev.setText(displaylabel.getText());
	operator.setText("-");
	displaylabel.setText("");
}

if (e.getSource()==multibtn) {
	prev.setText(displaylabel.getText());
	operator.setText("*");
	displaylabel.setText("");
}

if (e.getSource()==divbtn) {
	prev.setText(displaylabel.getText());
	operator.setText("/");
	displaylabel.setText("");
}

if (e.getSource()==dotbtn) {
	if(displaylabel.getText().contains(".")) {
		return ;
	}
	displaylabel.setText(displaylabel.getText()+".");
}

}


@Override
public void keyPressed(KeyEvent e) {
	int keycode = e.getKeyCode();
		switch (keycode) {
			case KeyEvent.VK_0:
				if (displaylabel.getText().equals("0")) {
					displaylabel.setText(""+0);
				} 
                else {
					displaylabel.setText(displaylabel.getText()+0);
				}
			return;
			case KeyEvent.VK_1:
				if (displaylabel.getText().equals("0")) {
					displaylabel.setText(""+1);
				} 
                else {
					displaylabel.setText(displaylabel.getText()+1);
				}
			return;

			case KeyEvent.VK_2:
				if (displaylabel.getText().equals("0")) {
					displaylabel.setText(""+2);
				}
            	else {
					displaylabel.setText(displaylabel.getText()+2);
				}
				return;

			case KeyEvent.VK_3:
				if (displaylabel.getText().equals("0")) {
					displaylabel.setText(""+3);
				}
	            else {
					displaylabel.setText(displaylabel.getText()+3);
				}
				return;
	        
			case KeyEvent.VK_4:
				if (displaylabel.getText().equals("0")) {
					displaylabel.setText(""+4);
				} 
	            else {
					displaylabel.setText(displaylabel.getText()+4);
				}
				return;

			case KeyEvent.VK_5:
				if (displaylabel.getText().equals("0")) {
					displaylabel.setText(""+5);
				} 
    	        else {
					displaylabel.setText(displaylabel.getText()+5);
				}
				return;

			case KeyEvent.VK_6:
				if (displaylabel.getText().equals("0")) {
					displaylabel.setText(""+6);
				} 
   		        else {
					displaylabel.setText(displaylabel.getText()+6);
				}
				return;
        
			case KeyEvent.VK_7:
				if (displaylabel.getText().equals("0")) {
					displaylabel.setText(""+7);
				} 
   		        else {
					displaylabel.setText(displaylabel.getText()+7);
				}
				return;

			case KeyEvent.VK_8:
				if (displaylabel.getText().equals("0")) {
					displaylabel.setText(""+8);
				} 
	            else {
					displaylabel.setText(displaylabel.getText()+8);
				}
				return;

			case KeyEvent.VK_9:
				if (displaylabel.getText().equals("0")) {
					displaylabel.setText(""+9);
				} 
	            else {
					displaylabel.setText(displaylabel.getText()+9);
				}
				return;

			case KeyEvent.VK_MINUS:
				prev.setText(displaylabel.getText());
				operator.setText("-");
				displaylabel.setText("");
				return;

			case KeyEvent.VK_MULTIPLY:
				prev.setText(displaylabel.getText());
				operator.setText("*");
				displaylabel.setText("");
				return;

			case KeyEvent.VK_SLASH://divide
				prev.setText(displaylabel.getText());
				operator.setText("/");
				displaylabel.setText("");
				return;
                
			case KeyEvent.VK_PERIOD:
				if(displaylabel.getText().contains(".")) {
					return ;
			}
            displaylabel.setText(displaylabel.getText()+".");
			return;

			case KeyEvent.VK_SHIFT:
				return;

			case KeyEvent.VK_EQUALS:
				if(e.isShiftDown()) {
					prev.setText(displaylabel.getText());
					operator.setText("+");
					displaylabel.setText("");
					return;
				}

			double op1,op2,result;
			op1=Double.parseDouble(prev.getText());
			op2=Double.parseDouble(displaylabel.getText());

			if (operator.getText().equals("+")) {
				result=op1+op2;
				displaylabel.setText(Double.toString(result));
			}

			if (operator.getText().equals("-")) {
				result=op1-op2;
				displaylabel.setText(Double.toString(result));
			}
            
			if (operator.getText().equals("*")) {
				result=op1*op2;
				displaylabel.setText(Double.toString(result));
			}

			if (operator.getText().equals("/")) {
				result=op1/op2;
				displaylabel.setText(Double.toString(result));
			}
			return;

			default:
				System.out.println("default");
		}

}


	public static void main(String[] args) {
		Ex1 e = new Ex1();
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}
	
    @Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}
}