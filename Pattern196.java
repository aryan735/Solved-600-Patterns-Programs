class Pattern196{
public static void main(String[] args){
int a=1,x=0;
for(int i=1;i<6;i++){
	int b=1;
 x=a;
for(int k=5;k>=i;k--)
{
System.out.print(x+" ");
x+=2;
}
for(int j=2;j<=i;j++){
System.out.print(b+" ");
b+=2;
}
a+=2;
System.out.println();
}
}
}