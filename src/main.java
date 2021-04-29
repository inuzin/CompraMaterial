import java.awt.List;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) 
	{
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		ArrayList<Solicitacao> solicitacoes = new ArrayList<Solicitacao>();		
		Cadastro cadastro = new Cadastro();
		
		cadastro.AddProduto(produtos, "Madeira", "Material para casa", "Cm", 7.49f);
		cadastro.AddProduto(produtos, "Pedra", "Material para casa", "", 2.53f);
		cadastro.AddProduto(produtos, "Areia", "Material para casa", "", 5.27f);
		
		ListarProdutos(produtos);
	}
	
	public static void ListarProdutos(ArrayList<Produto> p)
	{
		for(int i = 0; i <= p.size() - 1; i++)
		{
			System.out.println("" + p.get(i).getNome());
			System.out.println("      Desc: " + p.get(i).getDescricao());
			System.out.println("      Medida: " + p.get(i).getMedida());
			System.out.println("      Valor por medida: " + p.get(i).getValormedida());
		}
	}
	
	public static void ListarSolicitacoes(ArrayList<Solicitacao> s)
	{
		for(int i = 0; i <= s.size() - 1; i++)
		{
			System.out.println("" + s.get(i).getPagamento());
			System.out.println("      Desc: " + s.get(i).getDescricao());
			System.out.println("      Medida: " + p.get(i).getMedida());
			System.out.println("      Valor por medida: " + p.get(i).getValormedida());
		}
	}

}
