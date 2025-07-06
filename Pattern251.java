class Pattern251{
public static void main(String[] args){

for(int i=1;i<=5;i++){
	int x=1;
for(int j=3;j<=2*i+1;j++){
if(j%2==0){
	System.out.print("* ");
}else{
		System.out.print(x+" ");
		x++;

}
} 

System.out.println();
}
}
}