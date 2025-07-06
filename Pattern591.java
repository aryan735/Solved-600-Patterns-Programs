public class Pattern591{
public static void main(String[] args){
int x=5;
for(int i=1;i<=5;i++){
for(int j=1;j<=5;j++){
if(i==1||j==x){
System.out.print("7 ");

}else{
System.out.print("  ");

}
}
x--;
System.out.println();
}
}}