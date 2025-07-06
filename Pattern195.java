class Pattern195{
public static void main(String[] args){
int a=1,b=4,x=0;
for(int i=1;i<6;i++){
if(i<=3){
x=a;
a+=2;
}else{
x=b;
b-=2;
}
for(int k=1;k<=5;k++)
{

System.out.print(x+" ");
}


System.out.println();
}
}
}