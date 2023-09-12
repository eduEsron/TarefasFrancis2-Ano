package tarefa;
import java.util.*;
public class Copo {
    Scanner s = new Scanner(System.in);
    private int Cap_max, Cap_Atual;
    private String Cor, Material;
    Copo(){
        this.Cap_max = 0;
        this.Cap_Atual = 0;
        this.Cor = null;
        this.Material = null;
    }
    Copo(int Cap_max, int Cap_Atual, String Cor, String Material){
        this.Cap_max = Cap_max;
        this.Cap_Atual = Cap_Atual;
        this.Cor = Cor;
        this.Material = Material;
    }
    public void setCap_max(int Cap_max){
       this.Cap_max = Cap_max;
    }
    public void setCap_Atual(int Cap_Atual){
        this.Cap_Atual = Cap_Atual;
    }
    public void setCor(String Cor){
        this.Cor = Cor;
    }
    public void setMaterial(String Material){
        this.Material = Material;
    }
    void Cadastro(){
        this.Cap_max = s.nextInt();
        this.Cap_Atual = s.nextInt();
        this.Cor = s.next();
        this.Material = s.next();
    }
    void Atualizar(){
        this.Cap_max = s.nextInt();
        this.Cap_Atual = s.nextInt();
        this.Cor = s.next();
        this.Material = s.next();
    }
    void Apagar(){
    
    }
    void Encher(){
        System.out.println("Enchendo mais 50 ml");
        Cap_Atual += 50;
    }
    void Esvaziar(){
        System.out.println("Esvaziando (- 50ml)");
        Cap_Atual -= 50;
    }
    void Exibir(){
        System.out.println("o copo " +Cor," de " +Material," armazena " +Cap_max, " ml e possui "+Cap_Atual," ml de líquido ");
    }

}
