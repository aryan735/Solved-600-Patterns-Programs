class Pattern179{
public static void  main(String[] args){
char x='A';
for(int i=1;i<5;i++){
	char y=x;
for(int j=1;j<=i;j++){
System.out.print(y+" ");

}
x++;
System.out.println();
}

for(int k=4;k>=1;k--){
char z=x;
for(int l=2;l<=k;l++){
System.out.print(z+" ");

}
x++;
System.out.println();
}
}

}