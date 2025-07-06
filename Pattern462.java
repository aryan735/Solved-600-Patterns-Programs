public class Pattern462{
public static void main(String[] args){
int x=1;
for(int i=3;i>=0;i--){
for(int j=0;j<=i;j++){
System.out.print(x+" ");
}x++;
System.out.println();
}
for(int i=1;i<=3;i++){
for(int j=0;j<=i;j++){
System.out.print(x+" ");
}x++;
System.out.println();
}
}
}