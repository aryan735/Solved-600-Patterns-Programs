class Pattern155{ 
public static void main(String[] args){
int y=0,z=0,x=1,s=1,a=1;
for(int i=1;i<=5;i++){
 
for( int j=5;j>=i;j--){
System.out.print(" ");
 }
if(i==x){ 
for(int k=3;k<=2*a+1;k++){
int multy=1;
for(int l=1;l<=2;l++){
multy*=s;
}	
System.out.print(multy+" ");
s++;
}
x+=2;
a++;
}else{
System.out.print(" ");

}

System.out.println();
}
}
}

