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
}
