public class Pattern589{
public static void main(String[] args){

for(int i=1;i<=5;i++){
for(int j=1;j<=5;j++){
if(i==3||i==1||i==5||i==2&&j==1||i==4&&j==5){
System.out.print("5 ");

}else{
System.out.print("  ");

}
}

System.out.println();
}
}}