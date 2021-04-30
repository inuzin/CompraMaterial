import java.util.ArrayList;

public class Cadastro 
{
	public int quantidade_total;
	public float valor_total;
	
	public void AddProduto(ArrayList<Produto> p, String nome, String descricao, String medida, double valormedida)
	{
		p.add(new Produto(nome,descricao,medida,valormedida));
	}
	
	public void AddSolicitacao(ArrayList<Solicitacao> s)
	{
		s.add(new Solicitacao(new ArrayList<Item>(), 0, "", "", "", false));
	}
	
	public void AtualizarSolicitacao(Solicitacao s, double precounitario, String formapagamento, String localcompra, String datacompra)
	{
		s.precounitario = precounitario;
		s.formapagamento = formapagamento;
		s.localcompra = localcompra;
		s.datacompra = datacompra;
	}
	
	public void AddItem(Produto p, Solicitacao s)
	{
		//Checa se o item ja existe
		
		for(int i = 0; i <= s.item.size() - 1; i++)
		{
			if(s.item.get(i).P.equals(p))
			{
				s.item.get(i).setQuantidade(s.item.get(i).getQuantidade() + 1);
				AtualizarSolicitacao(s, SomarPrecoSolicitacao(s,i), "", "", "");
				return;
			}
		}
		
		//Caso nao exista, criar novo item
		
		s.item.add(new Item(p, 1));
		AtualizarSolicitacao(s, SomarPrecoSolicitacao(s,0), "", "", "");
	}
	
	public double SomarPrecoSolicitacao(Solicitacao s, int i)
	{
		return s.item.get(i).P.getValormedida() + s.precounitario;
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

}
