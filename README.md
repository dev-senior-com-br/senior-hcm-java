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

* Histórico de natureza de despesa - [HistoricalExpenseNature.java](src/main/java/br/com/senior/hcm/payroll/pojos/HistoricalExpenseNature.java)
* Histórico de movimentação de um colaborador - [Movimentation.java](src/main/java/br/com/senior/hcm/payroll/pojos/Movimentation.java)
* Vínculo do telefone de contato com a pessoa - [Personphonecontact.java](src/main/java/br/com/senior/hcm/payroll/pojos/Personphonecontact.java)
* Documentação de uma pessoa - [Document.java](src/main/java/br/com/senior/hcm/payroll/pojos/Document.java)
* Histórico de sindicato - [Syndicate.java](src/main/java/br/com/senior/hcm/payroll/pojos/Syndicate.java)
* Aviso Prévio - [PriorNotice.java](src/main/java/br/com/senior/hcm/payroll/pojos/PriorNotice.java)
* Histórico de posto de trabalho - [HistoricalJobPosition.java](src/main/java/br/com/senior/hcm/payroll/pojos/HistoricalJobPosition.java)
* Histórico de afastamento - [Historicalleave.java](src/main/java/br/com/senior/hcm/payroll/pojos/Historicalleave.java)
* Histórico de horário - [HistoricalWorkshift.java](src/main/java/br/com/senior/hcm/payroll/pojos/HistoricalWorkshift.java)
* Tipo de atuação - [Actingtype.java](src/main/java/br/com/senior/hcm/payroll/pojos/Actingtype.java)
* Estrutura do posto de trabalho - [Workstationgroupstructure.java](src/main/java/br/com/senior/hcm/payroll/pojos/Workstationgroupstructure.java)
* Pessoa - [Person.java](src/main/java/br/com/senior/hcm/payroll/pojos/Person.java)
* Histórico de centro de custo - [HistoricalCostCenter.java](src/main/java/br/com/senior/hcm/payroll/pojos/HistoricalCostCenter.java)
* Vínculo do colaborador - [HistoricalEmploymentRelationship.java](src/main/java/br/com/senior/hcm/payroll/pojos/HistoricalEmploymentRelationship.java)
* Histórico de categoria do eSocial - [HistoricalEsocialCategory.java](src/main/java/br/com/senior/hcm/payroll/pojos/HistoricalEsocialCategory.java)
* Outros contratos - [OtherContract.java](src/main/java/br/com/senior/hcm/payroll/pojos/OtherContract.java)
* Telefone de contato - [Phonecontact.java](src/main/java/br/com/senior/hcm/payroll/pojos/Phonecontact.java)
* Local de trabalho - [Department.java](src/main/java/br/com/senior/hcm/payroll/pojos/Department.java)
* Endereço de email da pessoa - [Email.java](src/main/java/br/com/senior/hcm/payroll/pojos/Email.java)
* Conta bancária - [Account.java](src/main/java/br/com/senior/hcm/payroll/pojos/Account.java)

#### Entidades do Dependent

* Dependente - [Dependent.java](src/main/java/br/com/senior/hcm/dependent/pojos/Dependent.java)
* Tutela - [Tutelage.java](src/main/java/br/com/senior/hcm/dependent/pojos/Tutelage.java)
* Auxílio creche - [ChildcareAssistance.java](src/main/java/br/com/senior/hcm/dependent/pojos/ChildcareAssistance.java)
* Salário família - [FamilySalary.java](src/main/java/br/com/senior/hcm/dependent/pojos/FamilySalary.java)
* Documento do salário família - [FamilySalaryDocument.java](src/main/java/br/com/senior/hcm/dependent/pojos/FamilySalaryDocument.java)
* Dependente do imposto de renda - [DependentIncomeTax.java](src/main/java/br/com/senior/hcm/dependent/pojos/DependentIncomeTax.java)
* Dependente do plano saúde - [DependentHealthInsurance.java](src/main/java/br/com/senior/hcm/dependent/pojos/DependentHealthInsurance.java)
* Pensão judicial - [JudicialPension.java](src/main/java/br/com/senior/hcm/dependent/pojos/JudicialPension.java)

## [Guia de contribuição](https://dev.senior.com.br/guia-de-contribuicao/)

## Suporte

Criar um issue https://github.com/dev-senior-com-br/senior-hcm-java/issues

## License

Copyright © 2020.
