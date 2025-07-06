public class Pattern493{
public static void main(String[] args){
int x=3;
for(int i=1;i<=7;i++){
for(int j=1;j<=i;j++){
if(i<=4){
if(j==i||j==1){
System.out.print("*");

}else{
System.out.print("  ");
}
}else{
if(j==1||j==x){
System.out.print("*");

}else{
System.out.print("  ");
}
}
}
if(i>4){
x--;}
System.out.println();
}
}}