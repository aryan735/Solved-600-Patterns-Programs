class Pattern225{
public static void main(String[] args){
char x='E';
for(int i=5;i>=1;i--){
for(int j=1;j<=5;j++){

if(j<=i){	

		System.out.print(x+" ");

	}else{
		System.out.print("* ");
	
           
	}
} 
x--;

System.out.println();
}
}
}