public class Pattern508{
public static void main(String[] args){
int x=7;
for(int i=1;i<=7;i++){
for(int j=1;j<=7;j++){
if(j<=x||j==i){
System.out.print("* ");
}else{
System.out.print("  ");

}
}
x--;
System.out.println();
}
}}