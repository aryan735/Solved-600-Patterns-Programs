class Pattern199{
public static void main(String[] args){
int y=2, a=0;
for(int i=1;i<6;i++){

for(int j=1;j<6;){

if(isPrime(y)){
	System.out.print(y+" ");
	j++;
}
y++;
} 
System.out.println();
}
}
public static boolean isPrime(int y){
	int x=2;
	while(x<y){
		if(y%x==0){
			return false;
		}
		x++;
	}
	return true;
}
}