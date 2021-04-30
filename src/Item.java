

public class Item 
{
	Produto P;
	private int quantidade;
	
public Item(Produto p, int Quantidade)
{
	P = p;
	quantidade = Quantidade;
}

public int getQuantidade()
{
	return quantidade;
}

public void setQuantidade(int quantidade)
{
	this.quantidade = quantidade;
}

}
