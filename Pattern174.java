class Pattern174{
public static void  main(String[] args){
int x=1;
for(int i=1;i<5;i++){
for(int j=1;j<=i;j++){
System.out.print(x+" ");
x++;
}

System.out.println();
}

for(int k=4;k>=1;k--){

for(int l=2;l<=k;l++){
System.out.print(x+" ");
x++;
}

System.out.println();
}
}

}