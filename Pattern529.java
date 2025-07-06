public class Pattern529{
public static void main(String[] args){
int x=8;
for(int i=1;i<=4;i++){
for(int j=1;j<=8;j++){
if(j<=i||j>=x||i==4){
System.out.print("* ");

}else{
System.out.print("  ");

}

}
x--;
System.out.println();
}
x=6;
for(int i=3;i>=1;i--){
for(int j=1;j<=8;j++){
if(j<=i||j>=x){
System.out.print("* ");

}else{
System.out.print("  ");

}
}
x++;
System.out.println();
}

}
}