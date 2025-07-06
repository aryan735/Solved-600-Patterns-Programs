public class Pattern471{
public static void main(String[] args){
char y='A';
for(int i=1;i<=4;i++){
	char x=y;
for(int j=1;j<=i;j++){
System.out.print(" ");
}for(int j=4;j>=i;j--){
System.out.print(x);x++;
}
System.out.println();			
}
y='C';
for(int i=3;i>=1;i--){
	char x=y;
for(int j=1;j<=i;j++){
System.out.print(" ");
}for(int j=4;j>=i;j--){
System.out.print(x);x++;
}y--;
System.out.println();			
}
}
}