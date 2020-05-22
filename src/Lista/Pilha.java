package Lista;

class Pilha {
	public int dado;
	public Pilha link; // referncia
}

class Lista {
	public Pilha inicio, fim;
	public int quantidade;

	public Lista() {
		inicio = null;
		fim = null;
		quantidade = 0;
	}

	public void empilhar(int x) {
		if (quantidade == 0) {
			Pilha novo = new Pilha();
			novo.dado = x;
			novo.link = null;
			inicio = novo;
			fim = novo;
			quantidade = 1;
		} else // já existem lementos na lista
		{
			Pilha novo = new Pilha();
			novo.dado = x;
			novo.link = inicio;
			inicio = novo;
			quantidade++;
		}
	}
	
	   public int desempilhar()
	   {
	      if(quantidade==0) throw new RuntimeException(); //lance exceção
	      else if(quantidade==1)
	      {
	         int aux = inicio.dado;
	         inicio = null;
	         fim = null;
	         quantidade=0;
	         return aux;
	      }
	      else
	      {
	         int aux = inicio.dado;
	         inicio = inicio.link;
	         quantidade--;
	         return aux;
	      }
	   }

	public boolean vazia() {
		if (quantidade == -1 || quantidade == 0)
			return true;
		else
			return false;
	}
}
