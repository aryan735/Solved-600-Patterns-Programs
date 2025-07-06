public class Pattern474{
public static void main(String[] args){
int x=5;
for(int i=5;i>=1;i--){

for(int j=1;j<=9;j++){
if(j<=i){
System.out.print("*");
}else if(j>=x){
System.out.print("*");
}else{
System.out.print(" ");

}
}
x++;
System.out.println();
}
}}