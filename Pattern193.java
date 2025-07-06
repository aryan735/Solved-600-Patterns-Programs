class Pattern193{
public static void main(String[] args){
int x=1;
int a=1;
for(int i=1;i<6;i++){
for(int j=5;j>=i;j--)
{
System.out.print(x+" ");

}

for(int k=2;k<=i;k++)
{
System.out.print(a+" ");

}
a++;

System.out.println();
}
}
}