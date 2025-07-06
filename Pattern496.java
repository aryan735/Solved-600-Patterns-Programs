public class Pattern496{
public static void main(String[] args){

for(int i=4;i<=7;i++){
for(int k=1;k<=i;k++){
if(k==i||i==7){
System.out.print("*");
}else{
System.out.print(" ");
}
}
System.out.println();
}for(int i=6;i>=4;i--){
for(int k=1;k<=i;k++){
if(k==i){
System.out.print("*");
}else{
System.out.print(" ");
}
}
System.out.println();
}
}}