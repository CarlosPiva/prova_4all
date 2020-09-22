package pages;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.lang.ref.SoftReference;

public class CarrinhoComprasPage extends BasePage {

    By addBrigadeiro = By.id("add-product-4-qtd");
    By btnFinalizar  = By.id("finish-checkout-button");
    By msgSucesso    = By.xpath("//*[contains(text(), 'Pedido realizado com sucesso!')]");
    By btnFechar     = By.xpath(("//*[contains(text(), 'Fechar')]"));
    By valorItem1    = By.id("product-0-price");
    By valorItem2    = By.id("product-1-price");
    By valorItem3    = By.id("product-2-price");
    By valorItem4    = By.id("product-3-price");
    By addRissole    = By.id("add-product-3-qtd");
    By removeRissole = By.id("remove-product-3-qtd");
    By total         = By.id("subtotal-price");
    By qtd1          = By.id("product-0-qtd");
    By qtd2          = By.id("product-1-qtd");
    By qtd3          = By.id("product-2-qtd");
    By qtd4          = By.id("product-3-qtd");

    public void addBrigadeiro(int quantidade){
        for (int x = 0; x < quantidade;){
            driver.findElement(addBrigadeiro).click();
            ++x;
        }
    }

    public void finalizarCompras(){
        driver.findElement(btnFinalizar).click();
    }

    public void verificarMsgSucesso(String mensagem){
        Assert.assertEquals(mensagem, driver.findElement(msgSucesso).getText());
    }

    public void fecharMsgSucesso(){
        driver.findElement(btnFechar).click();
    }

    public void addRissole(int quantidade){
            for (int x = 1; x < quantidade;){
            driver.findElement(addRissole).click();
            ++x;
        }
    }

    public void removeRissole(int quantidade){
        for (int x = 1; x < quantidade;){
            driver.findElement(removeRissole).click();
            ++x;
        }
    }

    public void verificarValor(){
        String n1 = driver.findElement(valorItem1).getText();
        String n2 = driver.findElement(valorItem2).getText();
        String n3 = driver.findElement(valorItem3).getText();
        String n4 = driver.findElement(valorItem4).getText();
        String subtotal = (driver.findElement(total).getText());

        String quantidade1 = driver.findElement(qtd1).getText();
        String quantidade2 = driver.findElement(qtd2).getText();
        String quantidade3 = driver.findElement(qtd3).getText();
        String quantidade4 = driver.findElement(qtd4).getText();

        String num1 = n1.substring(2,7).replace(",", ".");
        String num2 = n2.substring(2,7).replace(",", ".");
        String num3 = n3.substring(2,7).replace(",", ".");
        String num4 = n4.substring(2,7).replace(",", ".");
        String valorTotal = subtotal.substring(2,7).replace(",",".");


       double v1 = Double.parseDouble(num1);
       double v2 = Double.parseDouble(num2);
       double v3 = Double.parseDouble(num3);
       double v4 = Double.parseDouble(num4);

       double q1 = Double.parseDouble(quantidade1);
       double q2 = Double.parseDouble(quantidade2);
       double q3 = Double.parseDouble(quantidade3);
       double q4 = Double.parseDouble(quantidade4);

       double total = Double.parseDouble(valorTotal);

       double soma = (v1 * q1) + (v2 * q2) + (v3 * q3) + (v4 * q4);
       System.out.println(soma);
       System.out.println(total);

       Assert.assertEquals(soma, total, 0);
    }
}
