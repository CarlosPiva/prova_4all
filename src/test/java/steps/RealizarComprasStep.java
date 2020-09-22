package steps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.pt.*;
import org.openqa.selenium.support.PageFactory;
import pages.BasePage;
import pages.CarrinhoComprasPage;
import pages.HomePage;
import static pages.BasePage.driver;


public class RealizarComprasStep {
    WebDriver driver;
    BasePage acessar = PageFactory.initElements(driver, BasePage.class);
    HomePage home = PageFactory.initElements(driver, HomePage.class);
    CarrinhoComprasPage carrinho = PageFactory.initElements(driver, CarrinhoComprasPage.class);

    @Dado("^que Daiani acessou a categoria de doces da loja (\\d+)all$")
    public void que_Daiani_acessou_a_categoria_de_doces_da_loja_all(int arg1) throws Throwable {
        acessar.iniciar();
        home.clickMenu();
        home.selecionarOpcaoDoce();
    }

    @Dado("^selecionou os doces que deseja comprar$")
    public void selecionou_os_doces_que_deseja_comprar() throws Throwable {
        home.selecionarBrigadeiro();
        home.selecionarAlfajor();
        home.clickMenu();
        home.selecionarCategoriaTodos();
        home.acessarCarrinhoCompras();
        carrinho.addBrigadeiro(4);
    }

    @Quando("^ela finaliza a compra$")
    public void ela_finaliza_a_compra() throws Throwable {
        carrinho.finalizarCompras();
    }

    @Então("^será apresentada uma mensagem informando que o pedido foi realizado com sucesso$")
    public void será_apresentada_uma_mensagem_informando_que_o_pideido_foi_realizado_com_sucesso() throws Throwable {
        carrinho.verificarMsgSucesso("Pedido realizado com sucesso!");
        carrinho.fecharMsgSucesso();
        acessar.fechar();
    }

    @Dado("^que Daiani acessou a loja (\\d+)all$")
    public void que_Daiani_acessou_a_loja_all(int arg1) throws Throwable {
        acessar.iniciar();
   }

    @Dado("^selecionou todos os produtos que deseja comprar$")
    public void selecionou_todos_os_produtos_que_deseja_comprar() throws Throwable {
        home.clickMenu();
        home.selecionarCategoriaBebidas();
        home.selecionarCoca();
        home.selecionarFantaUva();
        home.selecionarAgua();

        home.clickMenu();
        home.selecionarCategoriaTodos();
        home.selecionarRissole();
        home.acessarCarrinhoCompras();

        carrinho.addRissole(9);
        carrinho.removeRissole(5);
    }

        @Quando("^ela valida o valor total dos produtos$")
        public void ela_valida_o_valor_total_dos_produtos() throws Throwable {
        carrinho.verificarValor();
    }
}
