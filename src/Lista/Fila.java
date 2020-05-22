package Lista;

class Fila {
	public int dado;
	public Fila link; // referncia
}

class ListaFila {
	public Fila inicio, fim;
	public int quantidade;

	public ListaFila() {
		inicio = null;
		fim = null;
		quantidade = 0;
	}

	public void enfileirar(int x) {
		if (quantidade == 0) {
			Fila novo = new Fila();
			novo.dado = x;
			novo.link = null;
			inicio = novo;
			fim = novo;
			quantidade = 1;
		} else // já existem elementos na lista
		{
			Fila novo = new Fila();
			novo.dado = x;
			novo.link = null;
			fim.link = novo;
			fim = novo;
			quantidade++;
		}
	}

	public int desenfileirar() {
		if (quantidade == 0)
			throw new RuntimeException(); // lance exceção
		else if (quantidade == 1) {
			int aux = inicio.dado;
			inicio = null;
			fim = null;
			quantidade = 0;
			return aux;
		} else {
			int aux = inicio.dado;
			inicio = inicio.link;
			quantidade--;
			return aux;
		}
	}

	public boolean vazia() {
		if (quantidade == 0)
			return true;
		else
			return false;
	}

	public boolean cheia() {
		if (quantidade > 0)
			return true;
		else
			return false;
	}

}
