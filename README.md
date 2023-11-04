
# AWS Email Service JAVA

Projeto desenvolvido para fins educativos. Microserviço de envio de email em JAVA com Spring utilizando o Simple Email Service do AWS. Este projeto teve como início um teste técnico antigo da empresa UBER e foi feito segundo seus objetivos.


## Referência

- [Repositório UBER](https://github.com/uber-archive/coding-challenge-tools/blob/master/coding_challenge.md)
- [AWS](https://aws.amazon.com/pt/)


## Stack utilizada

**Back-end:** Java


## Documentação da API

#### Enviar o email

```http
  POST /api/email
```

| Parâmetro   | Tipo       | Descrição                           |
| :---------- | :--------- | :---------------------------------- |
| `to` | `string` | **Obrigatório**. Email para quem será enviado |
| `subject` | `string` | **Obrigatório**. O título/assunto do email |
| `body` | `string` | **Obrigatório**. O corpo do email |



## Autor

- [@LuizAGDomingues](https://github.com/LuizAGDomingues)

