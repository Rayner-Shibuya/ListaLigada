package Lista;

public class ExeListaLigada {
	public static void main(String args[])
	   {

		ListaLigadaSimples lista = new ListaLigadaSimples();
		lista.adicionarInicio(7);
		lista.adicionarInicio(4);
		lista.adicionarInicio(2);
		lista.adicionarFim(11);

		ListaLigadaSimples lista2 = new ListaLigadaSimples();
		lista2.adicionarInicio(7);
		lista2.adicionarInicio(4);
		lista2.adicionarInicio(2);
		lista2.adicionarFim(11);

		System.out.println("Lista no princ�pio: " + lista);
		System.out.println("Lista � crescente?  " + lista.crescente());
		System.out.println("M�nimo elemento da lista:  " + lista.minimo());
		System.out.println("M�nimo elemento da lista (recursivo):  " + lista.minimoRec(lista.inicio));
		System.out.println("Lista = Lista2?  " + lista.iguais(lista2));
		System.out.println("Removi o primeiro: " + lista.removerInicio());
		System.out.println("Lista ap�s remo��o: " + lista);
		System.out.println("Removi o �ltimo: " + lista.removerFim());
		System.out.println("Lista ap�s remo��o: " + lista);
		System.out.println("O elemento 7 existe na lista? Resposta: " + lista.existe(7));
		System.out.println("Lista = Lista2?  " + lista.iguais(lista2));
		lista2.inverter2();
		System.out.println("Inverso da lista2: " + lista2);
	}
}
