<h1 align="center">O DNA D/N/A</h1>

## Contexto

Trabalho 1 de Algoritmo e Estruturas de Dados II. A ideia é trabalharmos a lógica de programação, relembrando o funcionamento de algumas estruturas de dados.

## História do Problema

Depois de analisar cuidadosamente o disco voador que caiu no meio do parque da Redenção, os cientistas chegaram a algumas conclusões sobre os seres que o ocupavam (e que fugiram em uma cápsula de resgate).

Os cientistas descobriram que o DNA dos alienígenas é feito com 3 bases em vez das 4 bases do DNA terrestre. Ironicamente eles batizaram as 3 bases de D, N e A. Eles também descobriram que o DNA alienígena sofre mutações que o deterioram com o tempo: duas bases diferentes que estão uma ao lado da outra podem se fundir produzindo a terceira base e criando uma cadeia de DNA um pouco menor. Isto acontece de uma forma muito organizada:

* Em uma cadeia de DNA a fusão de bases acontece sempre na dupla de bases diferentes mais à esquerda;

* A nova base criada com a fusão vai ser agregada ao final da cadeia de DNA.

Por exemplo, a pequena cadeia DNA sofre uma deterioração em DV e acaba gerando AA. Já uma cadeia maior como DNANDANDANDANADNDDDAN acaba virando simplesmente N.

Os cientistas agora perguntam: dada uma cadeia de DNA, qual o tamanho e qual cadeia podem ser obtidos depois de todas as mutações possíveis?

## Solução

Criação de um projeto em Java que irá manipular uma string, buscando a resolução do problema. O algoritmo, adaptado para a linguagem Java, irá utiliza LinkedList para a manipulação do DNA. Podemos dividir a construção da aplicação em 3 classes:

* Leitura de arquivo .txt;
* Algoritmo principal;
* Escrita do resultado. 

## Funcionalidades
* <b>Resolução do problema DNA</b>: Cumpre com os requisitos levantados no problema do projeto.
* <b>Escrita em arquivo de saída</b>: Classe para registrar os resultados do nosso algoritmo.

## Utilização do projeto

Todos os DNAs devem estar presentes na pasta "/src/resources/casos". Após a inclusão do casoX.txt, alteramos nossa constante "CASO" da classe ListaLinkadaDefinitiva para o nome do caso a ser analisado.

Exemplo:
```
<!-- Nome do caso a ser analisado é casoGit.txt -->

...
public class ListaLinkadaDefinitiva{
    private final statica String CASO = "casoGit.txt" 
    ...
}
```
