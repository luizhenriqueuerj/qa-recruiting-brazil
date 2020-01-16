package qa2;
import java.util.Scanner;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.text.DecimalFormat;

	public class Kota09 {
		double ValorTotal=0;
		String valor_lido;
		int countA=0;
		int countB=0;
		int valorA=0;
		int valorB=0;
		int valorC=0;
		int valorD=0;
		int desconto=0;
		DecimalFormat f = new DecimalFormat("##.00");
		valorTotal PrecoTotal = new valorTotal();
		public int CheckoutKata(String entrada) {
			for(int i = 0; i<entrada.length(); i++) {
				String letra = Character.toString(entrada.charAt(i));
				if (letra.equals("A")) {
					valorA = valorA + 50;
					countA = countA +1;
					if(countA>2) {
						countA=0;
						desconto = 20;
						valorA=valorA-desconto;
					}
				}
				else if (letra.equals("B")) {
					valorB = valorB + 30;
					countB = countB+1;
					if (countB>1) {
						valorB = (int) (valorB*0.75);
					}
				}
				else if (letra.equals("C")) {
					valorC = valorC + 20;
				}
				else if (letra.contentEquals("D")) {
					valorD = valorD + 15;
				}
			}
			return PrecoTotal.somaValores(valorA,valorB,valorC,valorD);
	    

		}
	}



