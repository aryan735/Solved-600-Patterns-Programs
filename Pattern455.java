public class Pattern455{
public static void main(String[] args){
int x=7;int y=1;
for(int i=1;i<=4;i++){
for(int j=1;j<=7;j++){
if(j<=i){
System.out.print(i);
}else if(j>=x){
System.out.print(x);
}else{
System.out.print(" ");

}
}
y++;
x--;
System.out.println();
}
x=5;
for(int i=3;i>=1;i--){
for(int j=1;j<=7;j++){
if(j<=i){
System.out.print(i);
}else if(j>=x){
System.out.print(x);
}else{
System.out.print(" ");

}
}
x++;y++;
System.out.println();
}
}}