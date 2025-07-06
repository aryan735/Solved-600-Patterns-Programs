public class Pattern481{
public static void main(String[] args){
int x=5,y=5;int z=0,a=-1,b=-2;
for(int i=5;i>=0;i--){
int y1=y;int z1=z,b1=b;
for(int j=1;j<=9;j++){
	if(i==5){
		
	}
else if(j<=i){
System.out.print("*");
}else if(j>=x){
	
	System.out.print("*");
}else{
	if(z1>a){
		System.out.print(b1);
		b1--;
	}else{
System.out.print(z1);

z1++;

	}
}
}
b+=2;
a+=2;
x++;
y--;z++;
System.out.println();
}
}}