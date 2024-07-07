
public class PrestadorDeServicos extends Usuario {
    private String numero;
    private String descricaoServicos;


    public PrestadorDeServicos(String nome, String email,String numero, String descricaoServicos) {
        super(nome, email);
        this.numero=numero;
        this.descricaoServicos= descricaoServicos;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricaoServicos() {
        return descricaoServicos;
    }

    public void setDescricaoServicos(String descricaoServicos) {
        this.descricaoServicos = descricaoServicos;
    }
}
