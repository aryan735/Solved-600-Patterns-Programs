class Pattern315{

public static void main(String[] args){
char a='A';
int x=1;
for(int i=1;i<=5;i++){

for(int j=5;j>=i;j--){
System.out.print(" ");
}
for(int j=3;j<=i*2+1;j++){
if(i%2==1){
	if(x>9){
		x=1;
		System.out.print(x);
x++;
	}else{
System.out.print(x);
x++;
	}
}else{

System.out.print(a);
a++;
}}

System.out.println();}}

}