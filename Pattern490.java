public class Pattern490{
public static void main(String[] args){
int x=4;
for(int i=2;i<=5;i++){
for(int j=5;j>=i;j--){
System.out.print(" ");
}for(int k=3;k<=i*2+1;k++){
if(k==x){
System.out.print("*");
}else if(k<x){
System.out.print("(");
}else {
System.out.print(")");

}

}
x++;
System.out.println();
}
}}