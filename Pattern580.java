public class Pattern580{
public static void main(String[] args){
int x=3,y=3;
for(int i=1;i<=5;i++){
for(int j=1;j<=5;j++){
if(j==1||j==5||i>=3&&j==x||i>=3&&j==y){
System.out.print("* ");

}else{
System.out.print("  ");

}
}
if(i>=3){
x--;
y++;}
System.out.println();
}
}}