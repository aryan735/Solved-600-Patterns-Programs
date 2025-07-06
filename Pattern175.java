class Pattern175{
public static void  main(String[] args){
int x=1;
for(int i=1;i<4;i++){
for(int j=3;j<=i*2+1;j++){
System.out.print(x+" ");

}
x+=2;
System.out.println();
}
x-=4;
for(int k=2;k>=1;k--){

for(int l=3;l<=k*2+1;l++){
System.out.print(x+" ");

}
x-=2;
System.out.println();
}
}

}