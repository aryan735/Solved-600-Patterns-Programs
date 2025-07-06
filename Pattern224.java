class Pattern224{
public static void main(String[] args){
char x='A';
for(int i=1;i<=5;i++){
char y=x;
for(int j=1;j<=5;j++){

if(j>i){	

	System.out.print("* ");

	}else{
		System.out.print(y+" ");
           y++;
	}
} 


System.out.println();
}
}
}