public class Pattern492{
public static void main(String[] args){

for(int i=1;i<=5;i++){
for(int j=5;j>=i;j--){
System.out.print(" ");
}for(int k=3;k<=2*i+1;k++){
if(k==3||k==i*2+1){
System.out.print("*");

}else if(i==5){
System.out.print("*");

}else{
System.out.print(" ");
}	


}
System.out.println();
}
}}