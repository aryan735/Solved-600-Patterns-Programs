class Pattern259{
public static void main(String[] args){
	int x=1,y=7,z=3,a=5;
for(int i=4;i>=1;i--){
int b=y;
for(int j=2*i;j>=1;j--){
	if(j<a){
	
		System.out.print(b);
		b++;

	}else{
	
System.out.print(x);
x++;

} 
}
y-=z;
a--;
z--;
System.out.println();
}
}
}