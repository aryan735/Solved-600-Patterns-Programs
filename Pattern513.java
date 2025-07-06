public class Pattern513{
public static void main(String[] args){
int x=7;
for(int i=1;i<=7;i++){
for(int j=1;j<=7;j++){
if(i>4&&j==x||j==i||i==1||j==7){
System.out.print("* ");
}else{
System.out.print("  ");

}
}
x--;
System.out.println();
}
}}