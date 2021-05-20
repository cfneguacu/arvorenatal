package arvorenatal;

public class ArvoreNatal {

	public static void main(String[] args) {
		
		int tamanho = 20;
		int pos1 = tamanho/2;
		int pos2 = tamanho/2;
		
		for(int x = 0 ; x<=tamanho/2; x++) {
			
			for(int i = 0; i<=tamanho; i++) {
					
				 if(i >= pos1  && i <= pos2) {
				    	
				    System.out.print("*");
				    	
				 }else {
				    	
				    System.out.print(" ");
				    	
				 }
					
			}
            	
            pos1--;
    		pos2++;
    			
    		System.out.println();
    			
    		if(x==tamanho/2) {
    				
    			for(int w = 0; w < tamanho/10;w++) {
    					
    				for (int z = 0; z < tamanho ;z++) {
    					
    					if(tamanho%2!=0) {
    						
    						if (z >= tamanho/3 && z<=((tamanho/3)*2)) {
    							
    							System.out.print("*");
    							
    						}else {
    							
    							System.out.print(" ");
    							
    						}
    						
    					}else {
    						
    						if (z >= tamanho/3 && z<=((tamanho/3)*2)+1) {
    							
    							System.out.print("*");
    							
    						}else {
    							
    							System.out.print(" ");
    							
    						}
    						
    						
    					}
    				
    							
    				}
    				
    				System.out.println();
    					
    			}
    				
    			for(int i = 0; i<=tamanho; i++) {
    					
    				System.out.print("*");
    			
    			}
    				
    			System.out.println();
    			System.out.println();
    			
    		} // fim do if 
    		
		} // fim do for de fora 
		
	}
	
}
