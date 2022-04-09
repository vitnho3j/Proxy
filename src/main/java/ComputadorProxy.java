import java.util.List;

public class ComputadorProxy implements IComputador{

    private Computador computador;

    private Integer id;

    public ComputadorProxy(Integer id){
        this.id = id;
    }

    @Override
    public List<String> obterDadosComputador(){
        if (this.computador == null){
            this.computador = new Computador(this.id);
        }
        return this.computador.obterDadosComputador();
    }




}
