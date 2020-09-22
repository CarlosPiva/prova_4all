$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/desafio.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# language: pt"
    }
  ],
  "line": 3,
  "name": "Realizar compras",
  "description": "Como cliente da loja online 4all\r\nDaiani deseja selecionar alguns produtos\r\npara que ela possa realizar uma compra",
  "id": "realizar-compras",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "line": 8,
  "name": "Realizar compra de doces",
  "description": "",
  "id": "realizar-compras;realizar-compra-de-doces",
  "type": "scenario",
  "keyword": "Cenário"
});
formatter.step({
  "line": 9,
  "name": "que Daiani acessou a categoria de doces da loja 4all",
  "keyword": "Dado "
});
formatter.step({
  "line": 10,
  "name": "selecionou os doces que deseja comprar",
  "keyword": "E "
});
formatter.step({
  "line": 11,
  "name": "ela finaliza a compra",
  "keyword": "Quando "
});
formatter.step({
  "line": 12,
  "name": "será apresentada uma mensagem informando que o pideido foi realizado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 48
    }
  ],
  "location": "RealizarComprasStep.que_Daiani_acessou_a_categoria_de_doces_da_loja_all(int)"
});
formatter.result({
  "duration": 7970042800,
  "status": "passed"
});
formatter.match({
  "location": "RealizarComprasStep.selecionou_os_doces_que_deseja_comprar()"
});
formatter.result({
  "duration": 515904500,
  "status": "passed"
});
formatter.match({
  "location": "RealizarComprasStep.ela_finaliza_a_compra()"
});
formatter.result({
  "duration": 54109100,
  "status": "passed"
});
formatter.match({
  "location": "RealizarComprasStep.será_apresentada_uma_mensagem_informando_que_o_pideido_foi_realizado_com_sucesso()"
});
formatter.result({
  "duration": 789881700,
  "status": "passed"
});
});