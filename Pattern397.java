class Pattern397{
public static void main(String[] args){
int x=5,y=5;


for(int i =1;i<6;i++){
for(int j=1;j<=9;j++){
if(j==x){
if(j==5){
	System.out.print("#");
	}else{
		System.out.print("-");

	}

}else if(j==y){
if(j==5){
	System.out.print("#");
	}else{
		System.out.print("-");

	}

}else{
	System.out.print("  ");
}

}
x--;
y++;

System.out.println();
}
int x1=1,y1=9;


for(int i =5;i>=1;i--){
for(int j=1;j<=9;j++){
if(j==x1){
if(j==5){
	System.out.print("#");
	}else{
		System.out.print("-");

	}

}else if(j==y1){
if(j==5){
	System.out.print("#");
	}else{
		System.out.print("-");

	}

}else{
	System.out.print("  ");
}

}
x1++;
y1--;

System.out.println();
}
}

}