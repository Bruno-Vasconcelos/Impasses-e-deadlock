package principal;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class main {
	public static void main(String[] args) throws IOException {
		try {
			FileReader arq = new FileReader("teste.txt");
			BufferedReader lerArq = new BufferedReader(arq);
			String linha = "";
			String[] textoSplit;
			int i = 0;

			while (lerArq.ready()) {

				linha = lerArq.readLine();

				for (int posicao = 0; posicao < 1; posicao++) {
					textoSplit = linha.split(";");
					System.out.print(textoSplit[posicao]);
				}

			}
			lerArq.close();

		} catch (IOException e) {
			System.err.printf("Não foi possível abrir o arquivo.\n" + e.getMessage());
		}

	}
}
