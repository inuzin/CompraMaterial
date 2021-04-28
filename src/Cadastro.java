import java.util.ArrayList;

public class Cadastro 
{
	private int quantidade_total;
	private float valor_total;
	
	public void AddProduto(ArrayList<Produto> p, String nome, String descricao, String medida, double valormedida)
	{
		p.add(new Produto(nome,descricao,medida,valormedida));
	}
	
	public void AddSolicitacao(ArrayList<Solicitacao> s, String pagamento, String formapagamento, String localcompra, String datacompra, Boolean status)
	{
		s.add(new Solicitacao(new ArrayList<Item>(), pagamento, formapagamento, localcompra, datacompra, status));
	}
	
	public void AtualizarSolicitacao(Solicitacao s, String pagamento, String formapagamento, String localcompra, String datacompra)
	{
		s.pagamento = pagamento;
		s.formapagamento = formapagamento;
		s.localcompra = localcompra;
		s.datacompra = datacompra;
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
				Console.writeline("" + s.get(i).item.get(j).P.getNome());	
			}			
		}
	}

}
