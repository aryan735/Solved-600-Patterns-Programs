class Pattern204{
public static void main(String[] args){
int y=0,z=1;
for(int i=1;i<6;i++){
y=i;
for(int j=1;j<6;j++){
if(y>5){	
	System.out.print(z+" ");
	z++;
	}else{
		System.out.print(y+" ");
          y++;
	}
} 

z=1;
System.out.println();
}
}
}