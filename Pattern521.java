public class Pattern521{
public static void main(String[] args){

for(int i=1;i<=9;i++){
for(int j=1;j<=9;j++){
if(i==1||i==9||j==1||j==9||i>2&&j==3&&i<8||i>2&&j==7&&i<8){
System.out.print("* ");
}else if(i==3&&j>2&&j<8||i==7&&j<8&&j>2||i==5&&j==5){
	System.out.print("* ");
}else{
System.out.print("  ");

}
}

System.out.println();
}
}}