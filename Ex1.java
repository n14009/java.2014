abstract class Ex {
	abstract void execute();
}

class Ex1_0 extends Ex {
	void execute(){
		System.out.println("Hello World!");
	}
}

class Ex1_2 extends Ex {
	void execute(){
		System.out.println("渡\n久\n地\n駿");
                 
	}
}
class Ex1_3 extends Ex {
        void execute(){
<<<<<<< HEAD
          System.out.println("渡\n久\n地\n\n駿");
        
        
        }
=======
                System.out.println("渡\n久\n地\n\n駿");
        
        }


>>>>>>> chap1
}
public class Ex1 {
	public static void main(String[] args){
		Ex a;
		a = new Ex1_0();
		a.execute();
		a = new Ex1_2();
		a.execute();
                a = new Ex1_3();
                a.execute();
	}
}
