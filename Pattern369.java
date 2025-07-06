class Pattern369{
public static void main(String[] args){
int x=5,y=5;
for(int i =1;i<10;i++){
for(int j=1;j<10;j++){
if(j==x||j==y){
System.out.print("*");
}else{
System.out.print(" ");

}}
x--;
y++;
System.out.println();
}
}

}