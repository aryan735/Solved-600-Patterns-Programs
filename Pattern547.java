public class Pattern547{
public static void main(String[] args){
for(int i=1;i<=5;i++){
for(int j=1;j<=6;j++){
if(j==1){
System.out.print("["+i+"]");}
else if(i==1&&j<=5||i==2&&j<=4||i==3||j==2||i==5&&j==3){
System.out.print(" # ");
}else{
System.out.print("   ");

}
}
System.out.println();
}
}}