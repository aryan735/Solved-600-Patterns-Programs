public class Pattern558{
public static void main(String[] args){

for(int i=1;i<=5;i++){
for(int k=5;k>=i;k--){
System.out.print(" ");
}
for(int j=3;j<=2*i+1;j++){

if(j==3||j==2*i+1||i==3){
System.out.print("*");

}else{
System.out.print(" ");

}
}

System.out.println();
}
}}