class Pattern52{
public static void main(String[] args){
int x=5,y=4,a=0,u=0;
for(int i=1;i<6;i++){
for(int j=1;j<=i;j++){
if(j==1){
System.out.print(x+" ");
a=x;
x+=y;
u=y+2;
}else{
a-=u;
System.out.print(a+"   ");
u++;
}
}
y--;

System.out.println();
}
}}