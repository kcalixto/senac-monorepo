ADO 12 – Implemente o código descrito abaixo, no IDE Eclipse

Com uma matriz (array bidimensional) de inteiros é possível implementar o
jogo descrito a seguir,

 que é uma versão simplificada do conhecido “campo
minado”.

 Primeiro o usuário/jogador deverá informar o número de linhas e
colunas da matriz, assim como a quantidade de bombas, 

sendo que a matriz
deve ter dimensão no mínimo 2x2 e o número de bombas deve ser maior do
que 0 e menor que a quantidade de células da matriz.

 O computador irá
escolher posições aleatórios na matriz para colocar/esconder as bombas,
tomando o cuidado de não acrescentar mais do que 1 bomba em uma mesma
posição.

 Na matriz de inteiros 
 -1 representará uma posição com bomba,
  0 uma posição livre (sem bomba) e, 
  1 uma posição que estava livre e foi escolhida
pelo usuário (sem explodir uma bomba). 

Para o usuário/jogador, inicialmente
irá aparecer todas as posições da matriz como “ _ ”, pois ele ainda não terá
escolhido nenhuma posição. Quando o usuário/jogador escolher uma posição,
se for uma posição livre (inteiro 0) a máscara “ _ ” irá mudar para “ x ”
 (inteiro
1), 
mas caso naquela posição tenha uma bomba (inteiro -1) irá aparecer “ b ”
no lugar de “ _ ” e será o fim do jogo. 

Caso o usuário/jogador tenha escolhido
uma posição livre, mas ao redor tiver uma (ou mais) bomba(s) deve ser
impresso a mensagem “Cuidado: bomba próxima!” (por exemplo, o jogador
escolheu a posição (2,2) da matriz e o computador colocou uma (ou mais)
bomba(s) na(s) posição(ões) (1,1), (1,2), (1,3), (2,1), (2,3), (3,1), (3,2) ou
(3,3)).

 Vale destacar que o jogador não deve poder escolher posições indicadas
com “ x ”. 

No final, deverá ser impresso “Parabéns, você ganhou o jogo!” se
o jogador atingiu a pontuação máxima ou “Game Over!”, caso contrário.

 Em
ambos os casos será impresso a pontuação alcançada (cada posição livre
escolhida vale 1 ponto) do total de pontos possíveis, assim como o
campo/matriz com “ x ” (acertos), “ b ” (bombas) e, se for o caso, “ _ ”
(posições livres). Utilize quantos métodos considerar necessário no código,
mas obrigatoriamente implemente um método para imprimir o campo/matriz
com máscaras “ _ ”, “ x ” e “ b”, e um método que recebe uma posição (i,j) da
matriz e retorna true se tiver uma (ou mais) bomba(s) ao redor, ou false, caso
contrário.
