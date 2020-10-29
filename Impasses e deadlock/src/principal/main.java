package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class main {
	public static void main(String[] args) throws IOException {
		try {
			FileReader arq = new FileReader("teste.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = "";
			String[] processos;
			String[] primeiraLinha = (lerArq.readLine()).split(" ");

			ArrayList<String> processoP = new ArrayList<String>();
			ArrayList<String> processoR = new ArrayList<String>();
			ArrayList<Integer> ListaAux = new ArrayList<Integer>();

			int nLinhas = Integer.parseInt(primeiraLinha[0]);
			int nProcessos = Integer.parseInt(primeiraLinha[1]);

			for (int i = 0; i < nLinhas; i++) {
//deu certo
				linha = lerArq.readLine();
				processos = linha.split(";");
				processoP.add(processos[0]); // possuido
				processoR.add(processos[1]); // requisitado
			}
			
			int a = 0;
			for (int i = 0; i < nLinhas; i++) {
				System.out.println((i + 1) + " quer: " + processoR.get(i));

				for (int j = 0; j < nLinhas; j++) {
					if (processoR.get(i).length() == 2) { // se não tem dois requisitos
						System.out.println("   "+(j + 1) + " tem: " + processoP.get(j));
						if (processoR.get(i).trim().equals(processoP.get(j).trim())) {
							i = j;
							ListaAux.add(i);
							break;
						}
					} else { // se tem dois ou mais requisitos
						int qtdR = processoR.get(i).length(), inicio = 0, fim = 2;
						for (int z = 0; z < qtdR / 2; z++) {
							System.out.println("   "+(j + 1) + " tem: " + processoP.get(j));
							if (processoR.get(i).substring(inicio,fim).trim().equals(processoP.get(j).trim())) {
								i = j;
								ListaAux.add(i);
								break;
							}
							inicio += 2;
							fim += 2;
						}
					}
				}
				System.out.println(countDuplicates(ListaAux));
				/*if(a > countDuplicates(ListaAux)) {
					break;
				}*/
				a++;
			}
			System.out.println(ListaAux.toString());

			lerArq.close();
		} catch (IOException e) {
			System.err.printf("Não foi possível abrir o arquivo.\n" + e.getMessage());
		}
		
	}
	
    public static int countDuplicates(ArrayList<Integer> list) 
    { 
    	int nRepete = 0;
        // Create a new ArrayList 
        ArrayList<Integer> newList = new ArrayList<Integer>(); 
  
        // Traverse through the first list 
        for (int element : list) { 
            if (!newList.contains(element)) { 
            	nRepete++;
            } 
        } 
  
        // return the new list 
        return nRepete; 
    } 

}