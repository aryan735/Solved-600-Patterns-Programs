class Pattern380{
public static void main(String[] args){
int x=1,y=9;
char a='A',b='I';
for(int i =1;i<6;i++){
for(int j=1;j<=9;j++){
if(j==x||j==y){
if(j<=5){
System.out.print(a);
a++;
}else{
System.out.print(b);
b--;
}

}else{
System.out.print(" ");

}}
x++;
y--;

System.out.println();
}
}

}