class Pattern226{
public static void main(String[] args){
char x='A';
for(int i=5;i>=1;i--){
char y=x;
for(int j=1;j<=5;j++){

if(j<=i){	

		System.out.print(y+" ");
		y++;

	}else{
		System.out.print("* ");
	
           
	}
} 

System.out.println();
}
}
}