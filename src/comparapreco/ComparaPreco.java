package comparapreco;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class ComparaPreco {

    
    public static void main(String[] args) {
        //String tamanho;                
        int tamanho = Integer.parseInt(JOptionPane.showInputDialog("Quantidade "
                + "de produtos?"));
        
        
        String[] nomes = new String[tamanho];
        float [] quantidade = new float[tamanho];
        float [] valor = new float [tamanho];
        float [] peso = new float [tamanho];
        float [] resultado = new float [tamanho];
        
                
        for (int limite =0; limite<=nomes.length -1; limite++){
                 nomes[limite] =JOptionPane.showInputDialog("Nome do produto?");
                 quantidade [limite] = Float.parseFloat(JOptionPane.showInputDialog("Quantidade?"));
                 valor [limite] = Float.parseFloat(JOptionPane.showInputDialog("Valor?"));
                 peso [limite] = Float.parseFloat(JOptionPane.showInputDialog("Peso?"));
                 resultado [limite] = (quantidade[limite] * valor[limite]);
                 resultado [limite] = peso[limite]/resultado[limite];                 
                 System.out.println(resultado[limite]);
                 
        }
       
    }
}
    

