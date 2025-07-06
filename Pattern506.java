public class Pattern506{
public static void main(String[] args){
for(int i=1;i<=4;i++){
for(int k=4;k>=i;k--){
System.out.print(" ");
}
for(int j=3;j<=2*i+1;j++){

System.out.print("*");


}

System.out.println();
}
int x=6;
for(int i=4;i>=1;i--){
for(int k=4;k>=i;k--){
System.out.print(" ");
}
for(int j=3;j<=2*i+1;j++){
if(j==x){
System.out.print("*");
}else{
System.out.print(" ");

}
}
x--;
System.out.println();
}
}}