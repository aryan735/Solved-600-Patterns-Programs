class Pattern184{
public static void  main(String[] arg){
char x='D';
for(int i=1;i<5;i++){
char y=x;
for(int j=4;j>=i;j--){
System.out.print(" ");

}
for(int j=1;j<=i;j++){
System.out.print(y);
y--;
}

System.out.println();
}

for(int k=4;k>=1;k--){
char y=x;
for(int j=5;j>=k;j--){
System.out.print(" ");

}
for(int j=2;j<=k;j++){
System.out.print(y);
y--;

}

System.out.println();
}
}

}