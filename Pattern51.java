class Pattern51{
public static void main(String[] args){
int x=15,y=1,a=0;
for(int i=1;i<6;i++){
for(int j=1;j<=i;j++){
if(j==1){
System.out.print(x+" ");
a=x;
x-=y;
}else{
a--;
System.out.print(a+"   ");
}
}
y++;
System.out.println();
}
}}