class Pattern3{
public static void main(String[] args){
	int a=9,b=1;
for(int i = 1;i<=5;i++){
	int x=i;
for(int j = 1; j<=5;j++){
	if(j==1){
		System.out.print(x+" ");
	}
if(j==2||j==4){
x+=a;
System.out.print(x+" ");

}
else if(j==3||j==5){
x+=b;
System.out.print(x+" ");
}
}
a-=2;
b+=2;
System.out.println();
}

}}