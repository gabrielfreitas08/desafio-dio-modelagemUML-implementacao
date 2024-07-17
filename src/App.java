import classes.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        
        Iphone iphone = new Iphone();
        iphone.ligar("119944-5533"); 
        iphone.exibirPagina("dio.me");
        iphone.selecionarMusica("qwe");

        System.out.println(iphone);
        
    }
}
