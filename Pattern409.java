class Pattern409{
public static void main(String[] args){
char x='A';
for(int i =1;i<5;i++){
char y=x;
	for(int k=5;k>=i;k--){
		
		System.out.print(" ");
	}				
for(int j=3;j<=i*2+1;j++){
if(j==3||j==i){
	System.out.print(y);
y--;

}else{
	System.out.print(y);
y--;
}

}
x+=2;
System.out.println();
}
x-=4;
for(int i =3;i>=1;i--){
char y=x;
	for(int k=5;k>=i;k--){
		
		System.out.print(" ");
	}				
for(int j=3;j<=i*2+1;j++){
if(j==3||j==i){
	System.out.print(y);
y--;

}else{
	System.out.print(y);
y--;
}

}
x-=2;
System.out.println();
}
}

}