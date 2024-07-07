import java.util.ArrayList;

public class Servicos {
    private String tituloDoServico;
    private String descricaoDoServico;
    private Double valor;
    private ArrayList<Avaliacao> avaliacoes;
    private String status;

    public Servicos(String descricaoDoServico, String tituloDoServico, Double valor){
        this.descricaoDoServico=descricaoDoServico;
        this.tituloDoServico=tituloDoServico;
        this.valor=valor;
        this.status= "Pendente";
        this.avaliacoes = new ArrayList<>();
    }

    public void mudarStatus(String novoStatus){
        this.status=novoStatus;
    }
    public void  adicionarAvaliacao(Avaliacao avaliacao){
        this.avaliacoes.add(avaliacao);
    }
    public void exclirAvaliacao(Avaliacao avaliacao){
        this.avaliacoes.remove(avaliacao);
    }

    public ArrayList<Avaliacao> getAvaliacaos() {
        return avaliacoes;
    }

    public void setAvaliacaos(ArrayList<Avaliacao> avaliacaos) {
        this.avaliacoes = avaliacaos;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTituloDoServico() {
        return tituloDoServico;
    }

    public void setTituloDoServico(String tituloDoServico) {
        this.tituloDoServico = tituloDoServico;
    }

    public String getDescricaoDoServico() {
        return descricaoDoServico;
    }

    public void setDescricaoDoServico(String descricaoDoServico) {
        this.descricaoDoServico = descricaoDoServico;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
