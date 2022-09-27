package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.awt.event.*;
import regras.*;
 
public class PNVelha extends JPanel implements MouseListener {
	double xIni=75.0,yIni=75.0,larg=80.0,alt=80.0,espLinha=5.0;
	Celula tab[][]=new Celula[3][3];
	Line2D.Double ln[]=new Line2D.Double[4];
	CtrlRegras ctrl;
	
	public PNVelha(CtrlRegras c) {
		double x=xIni,y=yIni;
		ctrl=c;
		
		for(int i=0;i<3;i++) {
			x=xIni;
			for(int j=0;j<3;j++) {
				tab[i][j]=new Celula(x,y);
				x+=larg+espLinha;
			}
			y+=alt+espLinha;
		}
			
		ln[0]=new Line2D.Double(155.0,75.0,155.0,325.0);
		ln[1]=new Line2D.Double(240.0,75.0,240.0,325.0);
		ln[2]=new Line2D.Double(75.0,155.0,325.0,155.0);
		ln[3]=new Line2D.Double(75.0,240.0,325.0,240.0);
	}
	
	public void paintComponent(Graphics g) {
		// inserir aqui os comandos iniciais padrão do método paintComponent()
		int mat[][]=ctrl.getMatriz();
		
		g2d.setStroke(new BasicStroke(5.0f,BasicStroke.CAP_BUTT,BasicStroke.JOIN_MITER,10.0f));
		
		// inserir aqui o teste do jogador da vez e a definição da cor dos segmentos de reta			
		
		// inserir aqui os comandos para desenhar os 4 segmentos de reta
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(mat[i][j]!=0) {
					// inserir aqui o código para definir a cor do quadrado a ser desenhado
					// e o desenho desse quadrado
					g2d.fill(rt);
				}
			}
		}
	}	
}