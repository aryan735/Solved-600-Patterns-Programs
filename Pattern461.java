public class Pattern461{
public static void main(String[] args){
int x=3;
for(int i=3;i>=0;i--){
int x1=x;
for(int j=0;j<=i;j++){
System.out.print(x1+" ");x1--;
}
x--;
System.out.println();
}x+=2;
for(int i=1;i<=3;i++){
int x1=x;
for(int j=0;j<=i;j++){
System.out.print(x1+" ");
x1--;
}x++;
System.out.println();
}
}
}