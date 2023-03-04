Com uma matriz (array bidimensional) 4x4 de inteiros é possível implementar
uma versão simplificada do conhecido “jogo de Sudoku”.

Na figura a seguir
temos uma representação inicial do jogo Sudoku de ordem 4. 

A solução correta
é obtida quando nenhum elemento se repete em uma linha ou coluna, e
também em nenhum dos 4 quadrantes de 4 elementos.

No Blackboard foi disponibilizado um código incompleto para que você possa
completar o método que falta e jogar. 

Para concluir/completar a
implementação será necessário escrever o código do método jogarSudoku.

Neste método primeiro deve ser perguntado para o usuário/jogador qual o nível
de dificuldade ele deseja, 

depois uma matriz de Sudoku deve ser sorteada e o
nível de dificuldade setado nesta matriz. 

O valor a ser inserido na matriz será
perguntado para o usuário/jogador, assim como os valores da linha e coluna da
célula para inserir. 

Caso a célula já esteja ocupada a linha e coluna devem ser
perguntadas novamente, até que uma célula disponível seja informada.

No
final se a solução estiver correta deve ser impresso a mensagem 
“Parabéns, a solução do Sudoku está correta!”, 
ou 
“A solução está incorreta!”