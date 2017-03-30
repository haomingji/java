package homework13;

public class h7 {
	public static void main(String[] args) {
		String[] score= new String[]{"80","26","51","78","94"};
		String[] score1=new String[score.length];
	   for(int i=0;i<score.length;i++){
		   int s=Integer.parseInt(score[i]);
		   if(s<60){
			  score1[i]=score[i].replace(score[i],"²»¼°¸ñ");
		   }else{
			   score1[i]=score[i];
		   }
	   }
	 for (int i = 0; i < score1.length; i++) {
		System.out.print(score1[i]+" ");
	
	}
		
	
	
	
	
	
	
	
	}

}
