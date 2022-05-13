<div align="center">

# Magic the Gathering


Esse repositório contém o código-fonte escrito em Java que dá origem a uma API desenvolvida por Gustavo Caruso para teste técnico da [Zappts](https://www.zappts.com.br/) ©

<img src="https://uploads-ssl.webflow.com/60d39ec767d1cd6ee3eb6f5e/6122c24c585295aac26de440_zappts-logo.svg" width="150px">

</div>

### Consumindo API

- Para consumir a API, clone o repositório em sua máquina e instale as depêndencias com o comando `mvn install`

- A API está rodando na porta `:8080`

- A API possui as rotas:
    - POST e GET: `/players`
    - GET: `/players/{playerId}`
    - PUT: `/players/add-deck/{playerId}`

    - POST e GET: `/cards`
    - GET: `/cards/{cardId}`

A API permite que você crie um Player através da rota POST `http://localhost:8080/players` passando no body um json no formato:

```json
  {
    "playerName": "string",
    "playerUsername": "string",
    "playerPassword": "string"
  }
```

A API permite que você crie Cards através da rota POST `http://localhost:8080/cards` passando no body um json no formato:

```json
  {
    "cardName": "string",
    "edition": "string",
    "language": "string",
    "itsFoil": "boolean",
    "priceBRL": "double"
  }
```

Após criar novos Cards através da rota acima, as cartas criadas ficarão em uma espécie "staging area" aguardando para serem associadas à um player.

Para associar as ultimas cartas criadas (staging area) à um player, utilize a rota PUT `http://localhost:8080/players/add-deck/{playerId}` passando no path da rota no lugar de `playerId` o id do player que receberá as cartas em seu deck.

Essa rota resultará em um retorno similar a:

```json
  {
    "playerId": "627a88a68352d561efbddc21",
    "playerName": "Joey Tribiani",
    "playerUsername": "jtribi",
    "playerPassword": "123455",
    "deck": [
      {
        "cardId": "627a88ef8352d561efbddc23",
        "cardName": "Murdolonte Enfurecido",
        "edition": "primeira",
        "language": "Português",
        "itsFoil": true,
        "priceBRL": 10.0
      }
    ]
  } 
```


#

<div align="center">

Essa é minha primeira API em Java.
Não obtive o resultado que gostaria, mas de qualquer maneira, agradeço a oportunidade de mostrar meu trabalho.

Com tempo, avançarei nos conhecimentos sobre a linguagem estarei mais pronto para esse desafio.

Obrigado Zappts pela condução do processo até aqui!

</div>

#