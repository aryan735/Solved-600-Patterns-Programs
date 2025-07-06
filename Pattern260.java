class Pattern260{
public static void main(String[] args){
	char y='E',z='0';
for(int i=6;i>=1;i--){
char x='@';
for(int j=2*i;j>=3;j--){
	if(x>=y){
	
		System.out.print(z);
		z--;

	}else{
		x++;
System.out.print(x);

z=x;
} 
}
y--;
System.out.println();
}
}
}