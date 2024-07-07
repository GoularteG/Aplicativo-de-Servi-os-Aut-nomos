import java.util.ArrayList;
import java.util.List;

    public class Agenda {
        List<Compromisso> compromissos;

        public Agenda(){
            this.compromissos= new ArrayList<>();
        }
        public void adicioniarCompromisso(Compromisso compromisso){
            compromissos.add(compromisso);
        }
        // metodo para listar compromissos
        public void listarCompromissos(){
                for (int i = 0; i < compromissos.size(); i++) {
                    Compromisso compromisso1 = compromissos.get(i);
                    System.out.println((i + 1) + ". Descrição: " + compromisso1.getDescricao());
                    System.out.println("   Data: " + compromisso1.getData());
                    System.out.println("   Hora: " + compromisso1.getHora());
            }
        }
    }