package Lista;

public class Exe9 {
	 public static void main(String[] args)
	 {
	  Lista p1 = new Lista();
	  Lista p2 = new Lista();
	  
	  p1.empilhar(1);
	  p1.empilhar(2);
	  p1.empilhar(3);
	  p1.empilhar(4);
	  p1.empilhar(5);
	  p1.empilhar(6);
	  p1.empilhar(7);

	  while(! p1.vazia())
	  {
	   int aux = p1.desempilhar();
	   System.out.println(aux);
	   p2.empilhar( aux );
	  }
	  
	  while(! p2.vazia())
	  {
	   System.out.println(p2.desempilhar());
	  }
	 }
	}
	

