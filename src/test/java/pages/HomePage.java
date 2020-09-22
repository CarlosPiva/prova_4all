package pages;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    By menu = By.id("open-categories-btn");
    By categoriaDoce = By.id("category-1");
    By categoriaTodos = By.id("category-all");
    By categoriaBebidas = By.id("category-0");
    By opcaoBrigadeiro = By.id("add-product-4-btn");
    By opcaoAlfajor = By.id("add-product-5-btn");
    By opcaoCoca = By.id("add-product-0-btn");
    By opcaoFantaUva = By.id("add-product-1-btn");
    By opaoAgua  = By.id("add-product-2-btn");
    By opcaoRissole = By.id("add-product-3-btn");
    By carrinhoCompras = By.id("cart-btn");

   public void clickMenu(){
      driver.findElement(menu).click();
   }

   public void selecionarOpcaoDoce(){

       driver.findElement(categoriaDoce).click();
   }

   public void selecionarCategoriaTodos(){

       driver.findElement(categoriaTodos).click();
   }

   public void selecionarBrigadeiro(){

       driver.findElement(opcaoBrigadeiro).click();
   }

   public void selecionarAlfajor(){

       driver.findElement(opcaoAlfajor).click();
   }

   public void selecionarCategoriaBebidas(){
       driver.findElement(categoriaBebidas).click();
   }

   public void selecionarCoca(){
       driver.findElement(opcaoCoca).click();
   }

   public void selecionarFantaUva(){
       driver.findElement(opcaoFantaUva).click();
   }

   public void selecionarAgua(){
       driver.findElement(opaoAgua).click();
   }

   public void selecionarRissole(){
       driver.findElement(opcaoRissole).click();
   }

   public void  acessarCarrinhoCompras(){

       driver.findElement(carrinhoCompras).click();
   }
}
