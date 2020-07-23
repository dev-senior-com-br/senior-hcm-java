# Senior API SDK para Java

Esta biblioteca permite desenvolvedores criar integrações das APIs do HCM da Senior.

## Instalação

### Usando Maven
1. Executar `mvn clean install`, após a execução do comando Senior API SDK para Java estará instalado no repositório local do maven.

2. Adicionar a dependência Senior HCM no pom.xml do seu projeto

  ```xml
    ...
    <dependencies>
        <dependency>
            <groupId>br.com.senior</groupId>
            <artifactId>senior-hcm-java</artifactId>
            <version>{version}</version>
        </dependency>
    </dependencies>
    ...
  ```
3. Para obter a última versão da SDK verifique no repositório. https://mvnrepository.com/artifact/br.com.senior/senior-hcm-java

## Exemplo Rápido

Implementamos no pacote **/src/test/java/br/com/senior/hcm** um conjunto de testes de integração para cada serviço. Alguns serviços dependem de variáveis que precisam ser informadas pelos usuários, como login e senha.

O ambiente pode ser definido no construtor de cada client, por padrão é utilizado o ambiente de homologação.

Os  testes servem como exemplos de implementação, basta copiar o código do exemplo que se deseja para sua aplicação.

Utilizando como exemplo o dependentQuery, basta instanciar o client utilizando o token, retornado pelo login, após isto criar o payload de entrada informando os parâmetros e passando para o client:

```java
    ...
    DependentClient client = new DependentClient(token);
    DependentQueryInput input = new DependentQueryInput(dependentId);
    DependentQueryOutput output = client.dependentQuery(input);
    ...
```
Definir as seguintes variáveis de ambiente:

```
SENIOR_USERNAME=<usuario>
PASS=<senha_do_usuario>
```

### Entidades

Implementamos a parte de utilidades para entidades, para facilitar as requisições realizadas para as mesmas. Conforme exemplos abaixo:

Como realizar uma chamada rest de uma entidade:
```
// O Objeto.class define ao objeto da entidade que você deseja requisitar. Disponibiliamos as classes das entidades publicas no pacote pojos de cada módulo
Objeto retorno = new EntitiesUtils<>(dominio, serviço, token de autenticação, Objeto.class).executeGet(entity_name, filter);

// Caso seja necessário utilizar a classe de filtro
String filter = new FilterBuilder().field("id").equals("123").build();
// O mesmo terá como retorno o seguinte : ?filter=id eq 123
```


### Suporte

1. Criar um issue https://github.com/dev-senior-com-br/senior-hcm-java/issues