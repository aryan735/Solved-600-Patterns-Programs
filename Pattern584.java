public class Pattern584{
public static void main(String[] args){
int x=5;
for(int i=1;i<=5;i++){
for(int j=1;j<=5;j++){
if(j==x||i==1||i==5||j==1||j==5){
System.out.print("0 ");

}else{
System.out.print("  ");

}
}
x--;
System.out.println();
}
}}