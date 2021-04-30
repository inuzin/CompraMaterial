import java.awt.List;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) 
	{
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		ArrayList<Solicitacao> solicitacoes = new ArrayList<Solicitacao>();		
		Cadastro cadastro = new Cadastro();
		
		cadastro.AddProduto(produtos, "Madeira", "Material para casa", "Cm", 7.49);
		cadastro.AddProduto(produtos, "Pedra", "Material para casa", "", 2.53);
		cadastro.AddProduto(produtos, "Areia", "Material para casa", "", 5.27);
		
		ListarProdutos(produtos);
		
		cadastro.AddSolicitacao(solicitacoes);
		cadastro.AddItem(produtos.get(2), solicitacoes.get(0));
		cadastro.AddItem(produtos.get(2), solicitacoes.get(0));
		cadastro.AddItem(produtos.get(1), solicitacoes.get(0));
		cadastro.AddSolicitacao(solicitacoes);
		cadastro.AddItem(produtos.get(0), solicitacoes.get(1));
		cadastro.AddItem(produtos.get(1), solicitacoes.get(1));
		
		ListarSolicitacoes(solicitacoes);
	}
	
	public static void ListarProdutos(ArrayList<Produto> p)
	{

		for(int i = 0; i <= p.size() - 1; i++)
		{
			System.out.println("Produto " + i);
			System.out.println("-------------------------------------------------------");
			System.out.println("" + p.get(i).getNome());
			System.out.println("      Desc: " + p.get(i).getDescricao());
			System.out.println("      Medida: " + p.get(i).getMedida());
			System.out.println("      Valor por medida: " + p.get(i).getValormedida());
			System.out.println("");
		}
	}
	
	public static void ListarSolicitacoes(ArrayList<Solicitacao> s)
	{
		for(int i = 0; i <= s.size() - 1; i++)
		{
			System.out.println("Solicitacao " + i);
			System.out.println("-------------------------------------------------------");
			
			for(int j = 0; j <= s.get(i).item.size() - 1; j++)
			{
				System.out.println("Item: " + s.get(i).item.get(j).P.getNome());
				System.out.println("    Quantidade: " + s.get(i).item.get(j).getQuantidade());
			}
			
			System.out.println("Pagamento: " + s.get(i).getPagamento());
			System.out.println("Forma pagamento: " + s.get(i).getFormapagamento());
			System.out.println("Local da Compra: " + s.get(i).getLocalcompra());
			System.out.println("Data da Compra: " + s.get(i).getDatacompra());
			System.out.println("Status: " + s.get(i).getStatus());
			System.out.println("");
		}
	}

}
