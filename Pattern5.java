class Pattern5{
public static void main(String[] args){
int a=9,b=1;
for(int i=5;i>0;i--){
int x=i;
for(int j=1;j<6;j++){
if(j==2||j==4){
x+=b;
System.out.print(x+" ");
}else if(j==3||j==5){
x+=a;
System.out.print(x+" ");
}else{
System.out.print(i+" ");}
}
b+=2;
a-=2;
System.out.println();
}
}
}