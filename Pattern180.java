class Pattern180{
public static void  main(String[] args){

for(int i=1;i<5;i++){
for(int j=4;j>=i;j--){
System.out.print(" ");

}
for(int j=1;j<=i;j++){
System.out.print("*");

}

System.out.println();
}

for(int k=4;k>=1;k--){
for(int j=5;j>=k;j--){
System.out.print(" ");

}
for(int j=2;j<=k;j++){
System.out.print("*");

}

System.out.println();
}
}

}