import java.util.Arrays;
import java.util.List;

public class Computador implements IComputador{

    private Integer id;
    private String nomeDono;
    private String gabinete;
    private String processador;
    private String placaVideo;
    private String memoriaRam;
    private String placaMae;
    private String fonte;

    public Computador(int id){
        this.id = id;
        Computador computador = BD.getComputador(id);
        this.nomeDono = computador.nomeDono;
        this.gabinete = computador.gabinete;
        this.fonte = computador.fonte;
        this.processador = computador.processador;
        this.placaVideo = computador.placaVideo;
        this.memoriaRam = computador.memoriaRam;
        this.placaMae = computador.placaMae;
    }

    public Computador(Integer id, String nomeDono, String gabinete, String processador, String placaVideo, String memoriaRam, String placaMae, String fonte){
        this.id = id;
        this.nomeDono = nomeDono;
        this.gabinete = gabinete;
        this.processador = processador;
        this.placaVideo = placaVideo;
        this.memoriaRam = memoriaRam;
        this.placaMae = placaMae;
        this.fonte = fonte;

    }

    public Integer getId(){
        return id;
    }

    @Override
    public List<String> obterDadosComputador(){
        return Arrays.asList(this.nomeDono, this.gabinete);
    }

}
