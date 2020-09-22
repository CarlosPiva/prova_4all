#language: pt
#econdig: utf-8

Funcionalidade: Realizar compras de doces
  Como cliente da loja online 4all
  Daiani deseja selecionar alguns produtos
  para que ela possa realizar uma compra

@doces
  Cenário: Realizar compra de doces
    Dado que Daiani acessou a categoria de doces da loja 4all
    E selecionou os doces que deseja comprar
    Quando ela finaliza a compra
    Então será apresentada uma mensagem informando que o pedido foi realizado com sucesso

@total
  Cenário: Realizar compra de diversos produtos
    Dado que Daiani acessou a loja 4all
    E selecionou todos os produtos que deseja comprar
    Quando ela valida o valor total dos produtos
    E ela finaliza a compra
    Então será apresentada uma mensagem informando que o pedido foi realizado com sucesso
