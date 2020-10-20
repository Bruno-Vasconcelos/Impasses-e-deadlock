# Impasses e deadlock 🔐
<img width="30%" src="https://upload.wikimedia.org/wikipedia/commons/6/6c/Avoiding_deadlock.gif">

## Resumo
Este trabalho tem como objetivo ler o arquivo de entrada, analise se a situação está ou não em deadlock e imprima em um arquivo a saída.
A saída do programa deverá ser VAZIA caso o sistema não esteja em deadlock. Caso esteja, deverá ser impressa uma única linha contendo os processos e recursos que fazem parte do deadlock. Essa lista deverá começar pelo processo de menor valor e deverá indicar em sequência o processo, o recurso que ele está de posse, o próximo processo que necessita desse recurso, o que ele está de posse, e assim por diante. Abaixo segue um exemplo de saída esperada:

3 A 5 G 4 I 9 F 6 J

Neste caso, o processo de menor valor identificado é o 3, por isso ele começou a descrição da resposta. O processo 3 está esperando pelo recurso J e de posse do recurso A. O processo 5 está esperando pelo recurso a e de posse do recurso G. O processo 4 está esperando pelo recurso G e de posse do recurso I. E por aí em diante. Abaixo segue um exemplo de arquivo de entrada com o arquivo de saída esperado.

## Arquivos do Projeto

- Pacote: Principal

  - <b>main.java</b>: Arquivo principal com a leitura e a chamada das funções a serem desenvolvidas.

- <b>Teste.txt</b>: Arquivo de entrada com os testes a serem executados, onde a primeira linha conterá na primeira linha dois inteiros positivos ‘x’ e ‘y’. ‘x’ será a quantidade de processos existente no sistema e ‘y’ a quantidade de recursos.As próximas ‘x’ linhas serão referentes a cada processo e também identificarão o número do processo. Já os recursos serão identificados pelos caracteres ‘A-Z’. Cada linha seguinte conterá as informações de alocações e requisições de cada processo, separadas em dois blocos por ponto e vírgula. O primeiro bloco conterá os recursos alocados para o processo, indicados por caracteres “A-Z” e separados por espaços.  

- <b>Saida.txt</b>: Arquivo a ser gerado a após o código executar, onde a saída do programa deverá ser VAZIA caso o sistema não esteja em deadlock. Caso esteja, deverá ser impressa uma única linha contendo os processos e recursos que fazem parte do deadlock. Essa lista deverá começar pelo processo de menor valor e deverá indicar em sequência o processo, o recurso que ele está de posse, o próximo processo que necessita desse recurso, o que ele está de posse, e assim por diante. 


## Exemplo:

| Entrada |       Saída      |
|---------|------------------|
| 7 6     | 4 C 5 E 7 D      |
| A ; B   |                  |
| ; C     |                  |
| ; B     |                  |
| D ; B C |                  |
| C ; E   |                  |
| F ; B   |                  |
| E ; D   |                  |








