package urna;

import javax.swing.JOptionPane;

public class eleicao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int votos [] = new int [10];
		int jose = 0, maria = 0, juca = 0;
		
		JOptionPane.showMessageDialog(null, "vote 1 para jose, 2 para maria e 3 para juca");
		
		for (int i = 0; i < 10; i++) {
			votos[i] = Integer.parseInt(JOptionPane.showInputDialog("Eleitor " + (i + 1) + " vote"));
          if (votos[i] == 1) { jose++; }
          if (votos[i] == 2) { maria++; }
          if (votos[i] == 3) { juca++; }
	}
          if (jose > maria && jose >juca) {
        	  JOptionPane.showMessageDialog( null, "jose ganhou!");
          }
          else if (maria > jose && maria >juca) {
            	  JOptionPane.showMessageDialog(null, "maria ganhou!");
          }
          if (juca > maria && juca >jose) {
                	  JOptionPane.showMessageDialog(null, "juca ganhou!");
          }
          
    	  JOptionPane.showMessageDialog(null, "jose teve " + jose + " votos, maria teve " + maria + " votos e juca teve " + juca + " votos");
          
}
}
