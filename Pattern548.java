public class Pattern548{
public static void main(String[] args){
int x=5;
for(int i=1;i<=5;i++){
for(int j=1;j<=5;j++){
if(j==1||i==1||j==5||i==5||j==x){
System.out.print("* ");

}else{
System.out.print("  ");

}
}
x--;
System.out.println();
}
}}