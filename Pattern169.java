class Pattern169{ 
public static void main(String[] args){
char x='A';
for(int i=5;i>=1;i--){
	char y=x;
for( int j=5;j>=i;j--){
System.out.print(" ");
 }	
for(int k=2*i+1;k>=3;k--){	
System.out.print(y);
y++;
}

System.out.println();
}


}
}



