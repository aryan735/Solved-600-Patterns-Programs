class Pattern44{
//Pattern44
public static void main(String[] args){
int x=1,y=2,d=0;
for(int i = 1;i<6;i++){
for(int j=1;j<=i;j++){
	if(j==1){	
	System.out.print(x+" ");
	d=x;
	x+=y;
	}else{
	
		d--;
		System.out.print(d+" ");
	}
}
y++;
System.out.println();
}
}

}