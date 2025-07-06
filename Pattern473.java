public class Pattern473{
public static void main(String[] args){
int x=9,y=1;
for(int i=1;i<=5;i++){
int c=y;
for(int j=1;j<=9;j++){
if(j<=i){
System.out.print(j);
}else if(j>=x){
System.out.print(c);c--;
}else{
System.out.print(" ");

}
}y++;
x--;
System.out.println();
}
}}