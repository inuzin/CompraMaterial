
public class Produto {
	private String nome;
	private String descricao;
	private String medida;
	private double valormedida;
	
	public Produto(String Nome, String Descricao, String Medida, double Valormedida)
	{
		nome = Nome;
		descricao = Descricao;
		medida = Medida;
		valormedida = Valormedida;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public double getValormedida() {
		return valormedida;
	}
	public void setValormedida(double valormedida) {
		this.valormedida = valormedida;
	}

}
