package Aula6;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.String;
import java.text.ParseException;

public class att2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("dia:");
		int dia = teclado.nextInt();
		System.out.println("mes:");
		int mes = teclado.nextInt();
		System.out.println("ano:");
		int ano = teclado.nextInt();
		
		contaTempo(dia, mes, ano);
	}

	private static void contaTempo(int dia, int mes, int ano) {
		
		Date dataAtual = new Date();
        
        String dataString = String.format("%02d/%02d/%04d", dia, mes, ano);
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            Date dataFutura = formato.parse(dataString);
            
            long diferencaMs = dataFutura.getTime() - dataAtual.getTime();
            long diferencaDias = diferencaMs / (1000 * 60 * 60 * 24);

            if (diferencaDias > 0) {
                System.out.println("Faltam " + diferencaDias + " dias para a data informada.");
            } else if (diferencaDias == 0) {
                System.out.println("A data informada é hoje.");
            } else {
                System.out.println("A data informada já passou.");
            }
        } catch (ParseException e) {
            System.out.println("Erro ao processar a data. Verifique se o formato está correto.");
        }
	}

}
