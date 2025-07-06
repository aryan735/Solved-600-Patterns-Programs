public class Pattern544{
public static void main(String[] args){
int x=2,y=3,a=7,b=8;int x1=1,y1=9;
for(int i=1;i<=7;i++){
for(int j=1;j<=9;j++){
if(i<3){
if(j==x||j==y||j==a||j==b){
System.out.print("*");
}else
{System.out.print(" ");
}
}else{
if(j==x1||j==y1||i==3&&j==5){
	System.out.print("*");

}else
{System.out.print(" ");
}
}
}
if(i<3){
x--;
y++;
a--;
b++;
}else{
	x1++;
	y1--;
}
System.out.println();
}}}