public class Pattern494{
public static void main(String[] args){
int x=4,y=2;
for(int i=1;i<=7;i++){
for(int j=1;j<=4;j++){
if(i<=4){
if(j==4||j==x){
System.out.print("*");
}else{
System.out.print(" ");
}
}else{
if(j==4||j==y){
System.out.print("*");
}else{
System.out.print(" ");
}
}
}
System.out.println();
if(i<=4){
x--;
}else{
y++;}
}
}}