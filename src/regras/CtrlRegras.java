package regras;

public class CtrlRegras {
	// 0: indica uma casa nao preenchida
	// -1: indica uma casa preenchida com um retangulo verde
	// 5:  indica uma casa preenchida com um retangulo vermelho

	int tabuleiro [][]= {{0,0,-1},{5,-1,5},{-1,0,5}};
	int vez=5;
	
	public CtrlRegras() {
	}
	
	public int[][] getMatriz() {
		return tabuleiro;
	}
	
	public int getVez() {
		return vez;
	}	
  
  public boolean square_is_valid(int x, int y){
    return tabuleiro[x][y] == 0;
  }

  public game_is_over(){
    int result;
    // Horizontal
    for(int i=0; i < 3; i++){
      result = tabuleiro[i][0] + tabuleiro[i][1] + tabuleiro[i][2];
      if(result !=0){
        return result / 3;
      }
    }

    // Vertical
    for(int j=0; j < 3; j++){
      result = tabuleiro[0][j] + tabuleiro[1][j] + tabuleiro[2][j];
      if(result != 0){
        return result / 3;
      }
    }

    // Diagonais
    if(tabuleiro[0][0] == tabuleiro[1][1] == tabuleiro[2][2]){
      return tabuleiro[0][0];
    }

    if(tabuleiro[2][0] == tabuleiro[1][1] == tabuleiro[0][2]){
      return tabuleiro[1][1];
    }
    return 0;
  }
  
}
