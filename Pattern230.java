class Pattern230{
public static void main(String[] args){
char x='E';
for(int i=1;i<=5;i++){
char y=x;
for(int j=1;j<=5;j++){

if(j>=i){	


	System.out.print(y+" ");y--;
	}else{
	
	   		System.out.print("* "); 
           
	}
} 

x--;
System.out.println();
}
}
}