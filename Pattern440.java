public class Pattern440{
public static void main(String[] args){
int x=1,y=17,x1=4,x2=0,y1=3,y2=0;
for(int i=1;i<=4;i++){

for(int j=1;j<=i;j++){
	if(i==1){
		System.out.print("");

	}else{
System.out.print("_");
	}
	}
for(int j2=4;j2>=i;j2--){
if(j2==4){
System.out.print(x);
 x2=x;
x+=x1;
}else{
	x2++;
System.out.print(x2);

}
	}
for(int l=4;l>=i;l--){
if(l==4){
System.out.print(y);
 y2=y;
y-=y1;
}else{
	y2++;
System.out.print(y2);

}
	}
	x1--;
	y1--;
System.out.println();

}

}
}


