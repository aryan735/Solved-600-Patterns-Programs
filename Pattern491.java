public class Pattern491{
public static void main(String[] args){
int x=1,y=6;
for(int i=1;i<=10;i++){
for(int j=10;j>=i;j--){
System.out.print(" ");
}for(int k=1;k<=i;k++){
if(i>5&&k>x&&k<y){
System.out.print("  ");

}else{
System.out.print("* ");
}
}
if(i>5){
x++;

}
System.out.println();
}
}}