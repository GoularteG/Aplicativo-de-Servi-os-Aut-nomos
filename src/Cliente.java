public class Cliente extends Usuario {
    private String descricaoDoDesejo;

    public Cliente(String nome, String email,String descricaoDoDesejo) {
        super(nome, email);
        this.descricaoDoDesejo=descricaoDoDesejo;
    }

    public String getDescricaoDoDesejo() {
        return descricaoDoDesejo;
    }

    public void setDescricaoDoDesejo(String descricaoDoDesejo) {
        this.descricaoDoDesejo = descricaoDoDesejo;
    }
}
