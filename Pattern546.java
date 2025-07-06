public class Pattern546{
public static void main(String[] args){
for(int i=1;i<=6;i++){
for(int j=1;j<=5;j++){
if(i==6){
System.out.print("["+j+"]");}
else if(i>1&&j==1||j==3||i>2&&j==2||i==5||i==4&&j==5){
System.out.print(" # ");
}else{
System.out.print("   ");

}
}
System.out.println();
}
}}