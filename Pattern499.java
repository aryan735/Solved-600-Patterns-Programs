public class Pattern499{
public static void main(String[] args){
int x=6;
for(int i=4;i>=1;i--){
for(int j=4;j>=i;j--){
System.out.print(" ");
}
for(int k=3;k<=2*i+1;k++){
 if(k==x){
System.out.print("*");

}else{
System.out.print(" ");
}
}x--;
System.out.println();
}
 x=6;
for(int i=4;i>=1;i--){
for(int j=4;j>=i;j--){
System.out.print(" ");
}
for(int k=3;k<=2*i+1;k++){
 if(k==2*i+1||k==3){
System.out.print("*");
}else if(k==x){
System.out.print("*");

}else{
System.out.print(" ");
}
}x--;
System.out.println();
}
}}