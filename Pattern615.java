public class Pattern615{
public static void main(String[] args){
int x=9;
for(int i=1;i<=5;i++){
for(int j=1;j<=9;j++){
if(j==i||j==x){
System.out.print("V ");

}else{
System.out.print("  ");

}
}
x--;
System.out.println();
}
}}