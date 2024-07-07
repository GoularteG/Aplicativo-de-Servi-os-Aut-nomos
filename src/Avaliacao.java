public class Avaliacao {
    int nota;
    String prestadorDeServicos;
    String servicos;
    String comentario;


    public Avaliacao(int nota, String prestadorDeServicos, String servicos,String comentario) {
        this.nota = nota;
        this.prestadorDeServicos = prestadorDeServicos;
        this.servicos = servicos;
        this.comentario= comentario;
    }


    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getPrestadorDeServicos() {
        return prestadorDeServicos;
    }

    public void setPrestadorDeServicos(String prestadorDeServicos) {
        this.prestadorDeServicos = prestadorDeServicos;
    }

    public String getServicos() {
        return servicos;
    }

    public void setServicos(String servicos) {
        this.servicos = servicos;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "nota= " + nota +
                ", comentario= " + comentario;
    }
}
