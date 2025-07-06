public class Pattern452{
public static void main(String[] args){
char x='A';
for(int i =5;i>=1;i--){
char y=x;
for(int k=5;k>=i;k--){
System.out.print(" ");

}
for(int j=3;j<=i*2+1;j++){

System.out.print(y);
y++;
}
x++;
System.out.println();
}
x-=2;
for(int i =2;i<=5;i++){
char y=x;
for(int k=5;k>=i;k--){
System.out.print(" ");

}
for(int j=3;j<=i*2+1;j++){

System.out.print(y);
y++;
}
x--;
System.out.println();
}
}
}