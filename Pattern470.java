public class Pattern470{
public static void main(String[] args){
char x='A';
for(int i=1;i<=4;i++){
for(int j=1;j<=i;j++){
System.out.print(" ");
}for(int j=4;j>=i;j--){
System.out.print(x);
}x++;
System.out.println();			
}for(int i=3;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print(" ");
}for(int j=4;j>=i;j--){
System.out.print(x);
}x++;
System.out.println();			
}
}
}