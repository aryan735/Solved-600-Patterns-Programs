class Pattern210{
public static void main(String[] args){

for(int i=4;i>=0;i--){
	int x=i,y=1;;
for(int j=4;j>=0;j--){
if(x>=0){	
	System.out.print(x+" ");
	x--;
	}else{
		System.out.print(y+" ");
		y++;
	}
} 


System.out.println();
}
}
}