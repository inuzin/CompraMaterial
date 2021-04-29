import java.util.ArrayList;

public class Cadastro 
{
	public int quantidade_total;
	public float valor_total;
	
	public void AddProduto(ArrayList<Produto> p, String nome, String descricao, String medida, double valormedida)
	{
		p.add(new Produto(nome,descricao,medida,valormedida));
	}
	
	public void AddSolicitacao(ArrayList<Solicitacao> s, String pagamento, String formapagamento, String localcompra, String datacompra, Boolean status)
	{
		s.add(new Solicitacao(new ArrayList<Item>(), pagamento, formapagamento, localcompra, datacompra, status));
	}
	
	public void AtualizarSolicitacao(Solicitacao s, String Item_Nome, int Quantidade, String pagamento, String formapagamento, String localcompra, String datacompra)
	{
		//adicionar item -- checar se ja existe primeiro
		s.item.get(s.item.size() -1).P.setNome(Item_Nome);
		s.item.get(s.item.size() -1).quantidade += 1;
		s.pagamento = pagamento;
		s.formapagamento = formapagamento;
		s.localcompra = localcompra;
		s.datacompra = datacompra;
	}
	
	public void AddItem(ArrayList<Produto> p, Solicitacao s, String Nome, int Quantidade)
	{
		//Checa se o produto existe
	}
	
	public void CancelarSolicitacao(Solicitacao s)
	{
		//Muda o status da solicitacao para fechada
		s.status = true;
	}
	
	public void ListagemDeProdutos(ArrayList<Solicitacao> s)
	{
		for(int i = 0; i <= s.size() - 1; i++)
		{
			for(int j = 0; j <= s.get(i).item.size() -1; j++)
			{
				//Retornar nome de cada produto
				System.out.println("" + s.get(i).item.get(j).P.getNome());
				//Somar preco
				quantidade_total += s.get(i).item.get(j).P.getValormedida();
			}			
		}
	}
	
	public ArrayList<Solicitacao> FilteredList(ArrayList<Solicitacao> s)
	{
		//Forma uma nova lista para evitar repeticoes 
		
		return s;
	}

}
