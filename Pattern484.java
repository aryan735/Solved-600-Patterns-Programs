public class Pattern484{
public static void main(String[] args){

for(int i=1;i<=5;i++){
char x='A';
for(int j=5;j>=i;j--){
System.out.print(" ");
}for(int k=1;k<=i*2;k++){
if(k>i){
System.out.print(x);x++;
}else{
System.out.print(k);
}
}

System.out.println();
}
}}