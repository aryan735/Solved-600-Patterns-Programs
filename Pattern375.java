class Pattern375{
public static void main(String[] args){
int x=1,y=9;

for(int i =1;i<6;i++){
for(int j=1;j<=9;j++){
if(j==x||j==y){
System.out.print("*");

}else{
System.out.print(" ");

}}
x++;
y--;

System.out.println();
}
}

}