public class Pattern543{
public static void main(String[] args){
int x=1,y=4,a=6,b=9;int x1=1,y1=9;
for(int i=1;i<=7;i++){
for(int j=1;j<=9;j++){
if(i<3){
if(j>x&&j<y||j>a&&j<b){
System.out.print("*");
}else
{System.out.print(" ");
}
}else{
if(j>=x1&&j<=y1){
	System.out.print("*");

}else
{System.out.print(" ");
}
}
}
if(i<3){
x-=2;
y++;
a--;
b++;
}else{
	x1++;
	y1--;
}
System.out.println();
}}}