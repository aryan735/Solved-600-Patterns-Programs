public class Pattern466{
public static void main(String[] args){
char x='D';
for(int i=3;i>=0;i--){
char x1=x;
for(int j=0;j<=i;j++){
System.out.print(x1+" ");x1--;
}x--;
System.out.println();
}
x+=2;
for(int i=1;i<=3;i++){
char x1=x;
for(int j=0;j<=i;j++){
System.out.print(x1+" ");x1--;
}x++;
System.out.println();
}
}
}