import java.util.ArrayList;

public class Solicitacao {
	ArrayList<Item> item;
	int quantidade;
	double precounitario;
	String pagamento;
	String formapagamento;
	String localcompra;
	String datacompra;
	Boolean status; 
	
	public Solicitacao(ArrayList<Item> Item, double Precounitario, String Formapagamento, String Localcompra, String Datacompra, Boolean Status)
	{
		item = Item;
		precounitario = Precounitario;
		formapagamento = Formapagamento;
		localcompra = Localcompra;
		datacompra = Datacompra;
		status = Status;
	}
	
	public Boolean getStatus() {
		return status;
	}

	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPrecounitario() {
		return precounitario;
	}
	public void setPrecounitario(double precounitario) {
		this.precounitario = precounitario;
	}
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	public String getFormapagamento() {
		return formapagamento;
	}
	public void setFormapagamento(String formapagamento) {
		this.formapagamento = formapagamento;
	}
	public String getLocalcompra() {
		return localcompra;
	}
	public void setLocalcompra(String localcompra) {
		this.localcompra = localcompra;
	}
	public String getDatacompra() {
		return datacompra;
	}
	public void setDatacompra(String datacompra) {
		this.datacompra = datacompra;
	}

}
