public class Pattern487{
public static void main(String[] args){

for(int i=1;i<=5;i++){
char x='A';int y=1;
for(int j=5;j>=i;j--){
System.out.print(" ");
}for(int k=1;k<=i*2;k++){
if(k>i){
System.out.print(y);y++;
}else{
System.out.print(x);x++;
}
}

System.out.println();
}
}}