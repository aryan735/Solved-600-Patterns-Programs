class Pattern188{
public static void main(String[] args){
int x=1,y=5;
for(int i=1;i<6;i++){
int a=x;

	if(x==1){
	for(int j=1;j<6;j++){
	System.out.print(a+" ");
      a++;
	}
	}else{
		for(int j=1;j<6;j++){
		System.out.print(a+" ");
		a--;
	}

}
x=x+y;
y=x-y;
x=x-y;
System.out.println();
}
}
}