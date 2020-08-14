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

### Ambiente

Atualmente o ambiente padrão para o desenvolvimento é o da Homologx.
Para fazer a troca do ambiente basta chamar o construtor da api passando um dos Environments configurados:

```java
public enum Environment {

    PROD("https://api.senior.com.br"),
    HOMOLOG("https://platform-homologx.senior.com.br/t/senior.com.br/bridge/1.0");

    private final String url;

    Environment(String url) {
        this.url = url;
    }
}
```

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

Para mudar o ambiente para produção é necessário informar o environment ao chamar o construtor do Client:

```java
  AuthenticationClient client = new AuthenticationClient(Environment.PROD);
```

```
SENIOR_USERNAME=<usuario>
PASS=<senha_do_usuario>
```

### Entidades

Implementamos a parte de utilidades para entidades, para facilitar as requisições realizadas para as mesmas. Conforme exemplos abaixo:

Como realizar uma chamada rest de uma entidade:
```java
// Criando um filtro, caso seja necessário.
// Tendo como retorno o seguinte: ?filter=id eq 123
String filter = new FilterBuilder().field("id").equals("123").build();

// O Objeto.class define ao objeto da entidade que você deseja requisitar.
// Disponibiliamos as classes das entidades públicas no pacote pojos de cada módulo.
Objeto retorno = new EntitiesUtils<>(dominio, serviço, token de autenticação, Objeto.class).executeGet(entity_name, filter);

```

#### Entidades do Recruitment

* Currículo - [Resume.java](src/main/java/br/com/senior/hcm/recruitment/pojos/Resume.java)
* Contato telefônico (Currículo) - [ResumePhoneContact.java](src/main/java/br/com/senior/hcm/recruitment/pojos/ResumePhoneContact.java)
* Educação (Currículo) - [EducationSection.java](src/main/java/br/com/senior/hcm/recruitment/pojos/EducationSection.java)
* Experiência profissional (Currículo) - [ProfessionalExperienceSection.java](src/main/java/br/com/senior/hcm/recruitment/pojos/ProfessionalExperienceSection.java)
* Vaga de emprego - [Vacancy.java](src/main/java/br/com/senior/hcm/recruitment/pojos/Vacancy.java)
* Processo seletivo do candidato - [RecruitmentProcess.java](src/main/java/br/com/senior/hcm/recruitment/pojos/RecruitmentProcess.java)
* Etapa do processo seletivo do candidato - [RecruitmentProcessStage.java](src/main/java/br/com/senior/hcm/recruitment/pojos/RecruitmentProcessStage.java)
* Compromisso do processo seletivo - [Appointment.java](src/main/java/br/com/senior/hcm/recruitment/pojos/Appointment.java)

#### Entidades do Payroll
N/A

#### Entidades do Dependent
N/A


### Suporte

1. Criar um issue https://github.com/dev-senior-com-br/senior-hcm-java/issues