public class Pattern610{
public static void main(String[] args){

for(int i=1;i<=7;i++){
for(int j=1;j<=7;j++){
if(i<=5&&j==1||i<6&&j==5||i==1&&j<6||i==5&&j<6||i==4&&j==4||i==6&&j==6){
System.out.print("Q ");

}else{
System.out.print("  ");

}
}

System.out.println();
}
}}