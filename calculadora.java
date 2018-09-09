package methosCalculadora;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class calculadora extends JFrame implements ActionListener, KeyListener {
	private JFrame frame;
	private JTextField text;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12, b13, b14, b15, b16, b17, b18, b19, b20;

	public calculadora() {

		frame = new JFrame("Calculadora");
		frame.setBounds(100, 100, 300, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		text = new JTextField();
		text.setFont(new Font("Yu Gothic Medium", Font.BOLD, 20));
		text.setHorizontalAlignment(SwingConstants.CENTER);
		text.setText("");
		frame.getContentPane().add(text, BorderLayout.NORTH);
		// textField.setColumns(10);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(5, 4, 5, 5));

		b1 = new JButton("c");
		b1.addActionListener(this);
		b1.addKeyListener(this);
		panel.add(b1);

		b2 = new JButton("CE");
		b2.addActionListener(this);
		b2.addKeyListener(this);
		panel.add(b2);

		b3 = new JButton("%");
		b3.addActionListener(this);
		b3.addKeyListener(this);
		panel.add(b3);

		b4 = new JButton("/");
		b4.addActionListener(this);
		b4.addKeyListener(this);
		panel.add(b4);

		b5 = new JButton("1");
		b5.addActionListener(this);
		b5.addKeyListener(this);
		panel.add(b5);

		b6 = new JButton("2");
		b6.addActionListener(this);
		b6.addKeyListener(this);
		panel.add(b6);

		b7 = new JButton("3");
		b7.addActionListener(this);
		b7.addKeyListener(this);
		panel.add(b7);

		b8 = new JButton("*");
		b8.addActionListener(this);
		b8.addKeyListener(this);
		panel.add(b8);

		b9 = new JButton("4");
		b9.addActionListener(this);
		b9.addKeyListener(this);
		panel.add(b9);

		b10 = new JButton("5");
		b10.addActionListener(this);
		b10.addKeyListener(this);
		panel.add(b10);

		b11 = new JButton("6");
		b11.addActionListener(this);
		b11.addKeyListener(this);
		panel.add(b11);

		b12 = new JButton("^");
		b12.addActionListener(this);
		b12.addKeyListener(this);
		panel.add(b12);

		b13 = new JButton("7");
		b13.addActionListener(this);
		b13.addKeyListener(this);
		panel.add(b13);

		b14 = new JButton("8");
		b14.addActionListener(this);
		b14.addKeyListener(this);
		panel.add(b14);

		b15 = new JButton("9");
		b15.addActionListener(this);
		b15.addKeyListener(this);
		panel.add(b15);

		b16 = new JButton("+");
		b16.addActionListener(this);
		b16.addKeyListener(this);
		panel.add(b16);

		b17 = new JButton("0");
		b17.addActionListener(this);
		b17.addKeyListener(this);
		panel.add(b17);

		b18 = new JButton(".");
		b18.addActionListener(this);
		b18.addKeyListener(this);
		panel.add(b18);

		b19 = new JButton("-");
		b19.addActionListener(this);
		b19.addKeyListener(this);
		panel.add(b19);

		b20 = new JButton("=");
		b20.addActionListener(this);
		b20.addKeyListener(this);
		panel.add(b20);

		frame.setVisible(true);

	}

	String num1 = "", num2 = "", signo = "";
	String num3 = "";
	double result = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		// borrar todo
		if (e.getSource() == b1) {
			text.setText("");
			num1 = "";
			signo = "";
		}
		// borrar 1 a 1
		if (e.getSource() == b2) {
			String delete;
			delete = text.getText();
			if (delete.length() > 0) {
				// Cadena.substring(WIDTH, WIDTH)
				delete = delete.substring(0, delete.length() - 1);
				text.setText(delete);
			}

		}
		// signo del porcentaje
		if (e.getSource() == b3) {
			if (!text.getText().equals("")) {
				num1 = text.getText();
				signo = "%";
				text.setText("");

			}
		}
		// boton divicion
		if (e.getSource() == b4) {
			if (!text.getText().equals("")) {
				num1 = text.getText();
				signo = "/";
				text.setText("");

			}
		} // boton 1
		if (e.getSource() == b5) {
			text.setText(text.getText() + "1");

		} // boton 2
		if (e.getSource() == b6) {
			text.setText(text.getText() + "2");
		}
		if (e.getSource() == b7) {
			text.setText(text.getText() + "3");
		}
		// multiplicacion
		if (e.getSource() == b8) {
			if (!text.getText().equals("")) {
				num1 = text.getText();
				signo = "*";
				text.setText("");

			}
		}
		// boton 4
		if (e.getSource() == b9) {
			text.setText(text.getText() + "4");
		}
		// boton 5
		if (e.getSource() == b10) {
			text.setText(text.getText() + "5");
		}
		// boton 6
		if (e.getSource() == b11) {
			text.setText(text.getText() + "6");
		}
		// elevacion al cuadrado
		if (e.getSource() == b12) {
			if (!text.getText().equals("")) {
				num1 = text.getText();
				signo = "^";
				text.setText("");

			}
		}
		// boton 7
		if (e.getSource() == b13) {
			text.setText(text.getText() + "7");
		}
		// boton 8
		if (e.getSource() == b14) {
			text.setText(text.getText() + "8");
		}
		// boton 9
		if (e.getSource() == b15) {
			text.setText(text.getText() + "9");
		}
		// Suma
		if (e.getSource() == b16) {
			if (!text.getText().equals("")) {
				num1 = text.getText();
				signo = "+";
				text.setText("");

			}
		}
		// boton 0
		if (e.getSource() == b17) {
			num1 = text.getText();
			if(num1.startsWith("0")){
				text.setText(text.getText().substring(1));
				text.setText("");
			}if (num1.length() >=1){
				text.setText(text.getText() + "0");
			}
		}
			/*num1 = text.getText();
			// text.setText(text.getText() + "0");
			if (num1.length() < 0) {
				text.setText("0");
			}else if (num1.length() >=1){
				text.setText(text.getText() + "0");
				
			}
		}
		/*
		 * num1 += text.getText(); // int n1 = Integer.parseInt(num1); if
		 * (num1.length() >= 2) { if (num1.charAt(0) == 0) { num1.substring(0);
		 * 
		 * } else text.setText(text.getText() + "0");
		 * 
		 * }
		 */

		// punto decimal
		if (e.getSource() == b18){

			String punto;
			punto = text.getText();
			if (punto.length() <= 0) {
				text.setText("0.");
			} else {
				if (!existepunto(text.getText())) {
					text.setText(text.getText() + ".");
				}

			}

		}

		// resta
		if (e.getSource() == b19) {
			if (!text.getText().equals("")) {
				num1 = text.getText();
				signo = "-";
				text.setText("");

			}
		}
		// boton igual
		if (e.getSource() == b20) {
			String resultado;
			num2 = text.getText();
			// num3 = text.getText();
			if (!num2.equals("")); // && !num3.equals(""));
			resultado = calculadora(num1, num2, signo);
			text.setText(resultado);
		}

		// if(){}

	} // creamos el método Existe Punto de carácter público fuera del botón
		// punto

	public static boolean existepunto(String punto) {
		boolean resultado = false;
		// voy a declarar un bucle para que me recorra todo la cadena de
		// caracteres y si encuentra no lo ponga
		for (int i = 0; i < punto.length(); i++) {
			if (punto.substring(i, i + 1).equals(".")) {
				resultado = true;
				break;
			}
		}
		return resultado;
	}

	public static String calculadora(String num1, String num2, String signo) {
		// TODO Auto-generated method stub
		CalculatorMethos calcu = new CalculatorMethos();
		double resultado = 0.0;
		String respuesta;
		double n1, n2; // n3;
		n1 = Double.parseDouble(num1);
		n2 = Double.parseDouble(num2);
		// n3 = Double.parseDouble(num3);

		if (signo.equals("+")) {
			resultado = calcu.getsuma(n1, n2);
		}
		/*
		 * else if(signo.equals("+")){ resultado = calcu.getsuma(n1, n2, n3); }
		 */
		if (signo.equals("-")) {
			resultado = calcu.getresta(n1, n2);
		}
		if (signo.equals("/")) {
			resultado = calcu.getdiv(n1, n2);
		}
		if (signo.equals("*")) {
			resultado = calcu.getmult(n1, n2);

		}
		if (signo.equals("^")) {
			resultado = calcu.getelevar(n1, n2);
		} // else
			// if (resultado)
		if (signo.equals("%")) {
			resultado = calcu.getporciento(n1, n2);
		}

		respuesta = String.valueOf(resultado);
		return respuesta;

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if (e.getKeyCode() == KeyEvent.VK_0) {
			b17.doClick(); 
		}
		if (e.getKeyCode() == KeyEvent.VK_1) {
			b5.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_2) {
			b6.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_3) {
			b7.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_4) {
			b9.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_5) {
			b10.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_6) {
			b11.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_7) {
			b13.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_8) {
			b14.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_9) {
			b15.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			b2.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_DELETE) {
			b1.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_CIRCUMFLEX) {
			b12.doClick();
		}
		if (e.getKeyChar() == KeyEvent.VK_ENTER) {
			b20.doClick();
		}
		if (e.getKeyChar() == KeyEvent.VK_PLUS) {
			b16.doClick();
		}
		if (e.getKeyChar() == KeyEvent.VK_MINUS) {
			b19.doClick();
		}
		if (e.getKeyChar() == KeyEvent.VK_DECIMAL) {
			b18.doClick();
		}
		if (e.getKeyChar() == KeyEvent.VK_ASTERISK) {
			b8.doClick();
		}
		if (e.getKeyChar() == KeyEvent.VK_DIVIDE) {
			b4.doClick();
		}
		if (e.getKeyChar() == KeyEvent.VK_EQUALS) {
			b20.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD0) {
			b17.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
			b5.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD2) {
			b6.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
			b7.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD4) {
			b9.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
			b10.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD6) {
			b11.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
			b13.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD8) {
			b14.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
			b15.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_MULTIPLY) {
			b8.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_DECIMAL) {
			b18.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_DIVIDE) {
			b4.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_ADD) {
			b16.doClick();
		}
		if (e.getKeyCode() == KeyEvent.VK_SUBTRACT) {
			b19.doClick();
		}

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
}
