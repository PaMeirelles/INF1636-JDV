package regras;

public class CtrlRegras {
	// 0: indica uma casa n�o preenchida
	// -1: indica uma casa preenchida com um ret�ngulo verde
	// 5:  indica uma casa preenchida com um ret�ngulo vermelho

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
}
