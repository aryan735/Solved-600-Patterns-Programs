class Pattern1{
public static void main(String[] args){
int sum=1;
for(int i =1;i<=5;i++){
for(int j=1;j<=6;j++){
	if(j==2){
		System.out.print(j+" ");
	}else if(j==4){
		System.out.print("2 ");
	}else if(j==6){
		System.out.print("3 ");
	}
	else{
		System.out.print(sum+" ");
		
	}
}
sum++;
System.out.println();
}}
}