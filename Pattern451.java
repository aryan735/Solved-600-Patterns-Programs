public class Pattern451{
public static void main(String[] args){
char x='A';
for(int i =5;i>=1;i--){
for(int k=5;k>=i;k--){
System.out.print(" ");

}
for(int j=3;j<=i*2+1;j++){

System.out.print(x);

}
x++;
System.out.println();
}
for(int i =2;i<=5;i++){
for(int k=5;k>=i;k--){
System.out.print(" ");

}
for(int j=3;j<=i*2+1;j++){

System.out.print(x);

}
x++;
System.out.println();
}
}
}