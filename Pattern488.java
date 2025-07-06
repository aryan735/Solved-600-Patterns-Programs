public class Pattern488{
public static void main(String[] args){
char x='A';
int y=1;
for(int i=1;i<=5;i++){
char x1=x;int y1=y;
for(int j=5;j>=i;j--){
System.out.print(" ");
}for(int k=1;k<=i*2;k++){
if(k>i){
System.out.print(y1);y1++;
}else{

System.out.print(x1);x1++;
}
}
x++;
y++;
System.out.println();
}
}}