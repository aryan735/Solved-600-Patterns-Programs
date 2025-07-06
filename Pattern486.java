public class Pattern486{
public static void main(String[] args){
char x='A';
for(int i=1;i<=5;i++){
for(int j=5;j>=i;j--){
System.out.print(" ");
}for(int k=1;k<=i*2;k++){
if(k>i){
System.out.print(i);
}else{
System.out.print(x);
}
}
x++;
System.out.println();
}
}}