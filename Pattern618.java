public class Pattern618{
public static void main(String[] args){
int x=5;
for(int i=1;i<=5;i++){
for(int j=1;j<=5;j++){
if(i<3&&j==i||i<3&&j==x||i>2&&j==3){
System.out.print("Y ");

}else{
System.out.print("  ");

}
}
x--;
System.out.println();
}
}}