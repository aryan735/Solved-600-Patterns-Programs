public class Pattern519{
public static void main(String[] args){

for(int i=1;i<=7;i++){
for(int j=1;j<=7;j++){
if(i<5&&j==1||i==1&&j>3||i>3&&j==7||i==7&&j<5||j==4||i==4){
System.out.print("* ");
}else{
System.out.print("  ");

}
}

System.out.println();
}
}}