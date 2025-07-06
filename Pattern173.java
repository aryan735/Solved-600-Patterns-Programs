class Pattern173{
public static void  main(String[] args){
int x=1;
for(int i=1;i<5;i++){
int y=x;
for(int j=1;j<=i;j++){
System.out.print(y+" ");
y++;
}
System.out.println();
}

for(int k=4;k>=1;k--){
int z=x;
for(int l=2;l<=k;l++){
System.out.print(z+" ");
z++;
}

System.out.println();
}
}

}