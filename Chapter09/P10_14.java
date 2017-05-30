/*
爱因斯坦阶梯问题
*/
public class P10_14{
	static int jieti(){
		int i,res=0;
		int count;
		count=7;
		for(i=1;i<=100;i++){
			if((count%2==1) && (count%3==2) && (count%5==4) && (count%6==5) ){
				res=count;
				break;
			}
			count=7*(i+1);
		}
		return res;
	}
	public static void main(String[] args){
		int num;
		System.out.printf("爱因斯坦阶梯问题求解！\n");
		num=jieti();
		System.out.printf("最少共有%d个阶梯\n",num);
	}


}
