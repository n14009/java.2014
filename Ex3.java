class Ex3{

	public String ex3_0(int n){
          if (n > 0){
		return "その値は正です";
          }        
                return "その値は０か負です";
        }

	public int ex3_1(int n){
		
		return Math.abs(n);

	}

	public String ex3_2(int a, int b){
          if (a % b ==0){
                return "bはaの約数です";
          }
                return "bはaの約数ではありません";
	}

	public String ex3_3(int a, int b){
        if(a > b){
                return "aの方が大きいです";
        }
	else if(a == 0){
                return "同じ値です";
        }
                return "bの方が大きいです";

        }
	public String ex3_4(int a){
        if (a > 0){
          if(a % 5 ==0){
                return "その値は5で割り切れます";
          } 
		return "その値は5では割り切れません";
          
	}
                return "正でない整数値です";
        }
	public String ex3_5(int a){

		return "dummy";
	}
	
	public String ex3_6(int a){
		return "dummy";
	}

	public String ex3_7(int a){
		return "dummy";
	}

	public double ex3_8(double a, double b){
		return -1.0;
	}

	public int ex3_9(int a, int b){
		return 0;
	}

	public String ex3_10(int a, int b){
		return "dummy";
	}
}

