public class Pattern489{
public static void main(String[] args){
char x='#',y='*';
for(int i=1;i<=5;i++){
for(int j=5;j>=i;j--){
System.out.print(" ");
}for(int k=3;k<=i*2+1;k++){
System.out.print(y);
char temp=x;
x=y;
y=temp;
}

System.out.println();
}
}}