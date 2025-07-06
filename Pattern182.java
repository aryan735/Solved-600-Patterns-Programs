class Pattern182{
public static void  main(String[] args){
int x=3;
for(int i=1;i<5;i++){
int y=x;
for(int j=4;j>=i;j--){
System.out.print(" ");

}
for(int j=1;j<=i;j++){
System.out.print(y);
y++;
}
x--;
System.out.println();
}
x+=2;
for(int k=4;k>=1;k--){
	int y=x;
for(int j=5;j>=k;j--){
System.out.print(" ");

}
for(int j=2;j<=k;j++){
System.out.print(y);
y++;

}
x++;
System.out.println();
}
}

}