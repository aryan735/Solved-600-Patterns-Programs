class Pattern268{
public static void main(String[] args){
	
for(int i =5;i>=1;i--){
char x='#',y='*';
for(int j=1;j<=i;j++){
System.out.print(x+" ");
char temp=x;
x=y;
y=temp;
}

System.out.println();
}
}
}