public class Pattern545{
public static void main(String[] args){
int x=7,x1=5,x2=3,a=3,b=5;
for(int i=1;i<=8;i++){
for(int j=1;j<=x;j++){
	if(i<=4){
	System.out.print("  ");
	}
}
for(int j=1;j<=i;j++){
		if(i<=4){
				System.out.print("*   ");

		}
	}
for(int k=1;k<=x1;k++){
	if(i>4&&i<=8){
	System.out.print("  ");
	}
}
for(int j=1;j<=a;j++){
		if(i>4&&i<=8){
				System.out.print("*   ");

		}
	}



if(i>4&&i<=8){
x1--;
a++;	
}else if(i>8&&i<=12){x2--;b--;}
x--;

System.out.println();
}

for(int k=1;k<=4;k++){
	for(int l=1;l<=4;l++){
		System.out.print("  ");
	}
	for(int l=1;l<=3;l++){
		System.out.print(" *   ");
	}
	System.out.println();

}




}}