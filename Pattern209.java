class Pattern209{
public static void main(String[] args){

for(int i=0;i<5;i++){
	int x=i,y=1;;
for(int j=0;j<5;j++){
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