public class Pattern606{
public static void main(String[] args){
int x=5;
for(int i=1;i<=5;i++){
for(int j=1;j<=5;j++){
if(i<=3&&j==i||i<=3&&j==x||j==1||j==5){
System.out.print("M ");

}else{
System.out.print("  ");

}
}
x--;
System.out.println();
}
}}