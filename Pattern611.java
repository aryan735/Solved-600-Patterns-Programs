public class Pattern611{
public static void main(String[] args){
int x=2;
for(int i=1;i<=7;i++){
for(int j=1;j<=5;j++){
if(i==1||j==1||j==5&&i<5||i>4&&j==x||i==4){
System.out.print("R ");

}else{
System.out.print("  ");

}
}
if(i>4){
x++;}
System.out.println();
}
}}