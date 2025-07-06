class Pattern189{
public static void main(String[] args){
int x=1,y=0;
for(int i=1;i<6;i++){
int a=x;

	if(i%2==1){
	for(int j=1;j<6;j++){
	System.out.print(a+" ");
      a++;
		
	}
	x+=9;
	}else{
		for(int j=1;j<6;j++){
		System.out.print(a+" ");
		a--;
	}
x+=1;
}
System.out.println();
}
}
}