<a name="readme-top"></a>

<!--
*** Template baseado em https://github.com/othneildrew/Best-README-Template 
-->

![GitHub contributors](https://img.shields.io/github/contributors/ValSousa/lanchonete?style=for-the-badge)
![GitHub top language](https://img.shields.io/github/languages/top/ValSousa/lanchonete?style=for-the-badge)
![spring](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![[postgres]](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)



<!-- TITULO DO PROJETO -->
<br />
<div align="center">
  <h3 align="center">Lanchonete</h3>
</div>



<!-- TABELA DE CONTEUDOS -->
<details>
  <summary>Tabela de conteúdos</summary>
  <ol>
    <li>
      <a href="#sobre-o-projeto">Sobre o Projeto</a>
    </li>
    <li>
      <a href="#começando">Começando</a>
      <ul>
        <li><a href="#pré-requisitos">Pré-requisitos</a></li>
        <li><a href="#instalação">Instalação</a></li>
      </ul>
    </li>
    <li><a href="#exemplos-de-uso">Exemplos de uso</a></li>
    <li><a href="#roteiro">Roteiro</a></li>
  </ol>
</details>



<!-- SOBRE O PROJETO -->
## Sobre o Projeto

Este é uma projeto é um projeto para uma sistema para uma lanchonete usando as melhores práticas de arquitetura de software. 


<!-- COMECANDO -->
## Começando

Para executar o projeto localmente siga as próximas etapas.

### Pré-requisitos

* Docker com compose
  Veja a [documentação](https://docs.docker.com/engine/install/) para instalar o docker no seu sistema se ainda não tiver instalado.
* NodeJS no mínimo na versão 16. Recomendado a versão 18 (LTS) disponível no [site oficial](https://nodejs.org/en).

### Instalação

A instalação é bem simples, siga as seguintes etapas:

1. Clone o repositório
   ```sh
   git clone https://github.com/ValSousa/lanchonete.git
   ```
2. Entre na pasta do projeto
   ```sh
   cd lanchonete
   ```
3. Crie um arquivo novo arquivo com as váriaveis de ambiente `.env` usando o `.env.example`
   ```sh
   cp .env.example .env
   ```
4. Agora execute o projeto usando o docker compose
   ```sh
   docker compose up
   ```

<p align="right">(<a href="#readme-top">Voltar para o topo</a>)</p>

<!-- Aplicação de pagamento (mock) -->
## Aplicação de pagamento (mock)

Este sistema conta com uma aplicação externa que realiza os pagamentos, de forma mockada, visando apenas dar suporte ao fluxo da aplicação principal.

<!-- EXEMPLOS DE USO -->
## Exemplos de uso

### Para acessar o Swagger UI use uma das seguintes URLs
- http://localhost:8081/api/docs
- http://localhost:8081/swagger-ui.html

### Para acessar a documentação da API (JSON)
    http://localhost:8081/v3/api-docs

### Health Check
    http://localhost:8081/actuator/health

<p align="right">(<a href="#readme-top">Voltar para o topo</a>)</p>



<!-- ROTEIRO -->
## Roteiro

- [x] Começando o projeto
- [x] Dockerização
- [x] Documentação

<p align="right">(<a href="#readme-top">Voltar para o topo</a>)</p>
