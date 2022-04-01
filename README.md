> <img src="https://img.shields.io/maintenance/no/2014" />
>
> **Atenção:** O desenvolvimento deste projeto foi finalizado há anos. Provavelmente os webservices e regras para comunicação com o datasus já foram alterados neste tempo, então podem ser necessárias várias mudanças para que este projeto volte a operar. Fique a vontade para fazer um fork e continuar seu desenvolvimento.

# CNS (Cartão Nacional de Saúde)

[![Build Status](https://travis-ci.org/jhemarcos/cns.svg?branch=master)](https://travis-ci.org/jhemarcos/cns)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/br.com.jhemarcos/cns/badge.svg)](https://maven-badges.herokuapp.com/maven-central/br.com.jhemarcos/cns/)
<a href="http://www.methodscount.com/?lib=br.com.jhemarcos%3Acns%3A1.0.0"><img src="https://img.shields.io/badge/Methods and size-core: 39 | deps: 9939 | 13 KB-e91e63.svg"/></a>
[![License: GPL v3](https://img.shields.io/badge/License-GPL%20v3-blue.svg)](http://www.gnu.org/licenses/gpl-3.0)

Esse software tem como objetivo integrar os serviços oferecidos pelo Datasus, facilitando o acesso ás informações do Cartão Nacional de Saúde.

Mais informações acerca do projeto e a documentação completa podem ser encontrados na [Wiki](https://github.com/jhemarcos/cns/wiki) desse repositório.

## Dependências
* [cns-api 1.0.0](https://github.com/jhemarcos/cns-api) 

## Instalação
Adicionar no seu pom.xml:

```xml
<dependency>
    <groupId>br.com.jhemarcos</groupId>
    <artifactId>cns</artifactId>
    <version>1.0.0</version>
</dependency>

```

## Uso básico

```java
ConexaoDatasusImpl cd = new ConexaoDatasusImpl ("MeuUsuario", "MinhaSenha", true);
CnsDatasus cns = new CnsDatasus(cd);
DadosDemograficosImpl dadosDemograficosResponse = cns.buscaPorCPF("71662652054");
```
