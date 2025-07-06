public class Pattern505{
public static void main(String[] args){
for(int i=1;i<=4;i++){
for(int k=4;k>=i;k--){
System.out.print(" ");
}
for(int j=1;j<=2*i;j++){
if(j<=i){
System.out.print("*");
}else if(i==4){

System.out.print("*");

}else{
System.out.print(" ");

}
}

System.out.println();
}for(int i=3;i>=1;i--){
for(int k=4;k>=i;k--){
System.out.print(" ");
}
for(int j=1;j<=2*i;j++){
if(j<=i){
System.out.print("*");
}else{
System.out.print(" ");

}
}

System.out.println();
}
}}