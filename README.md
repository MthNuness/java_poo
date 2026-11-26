# java_poo
Repositório onde guardo os projetos que faço durante meu aprendizado de Java. São exercícios simples, criados para praticar e demonstrar a minha evolução.

## Projetos

- **metodos**:Primeiro contato direto com métodos, objetos e atributos. Utilizo dois arquivos Java: um para a classe principal (main) e outro para a definição dos métodos e atributos. Em seguida, instancio objetos da classe Caneta para acessar e utilizar seus métodos.
- **depositar_sacar**: Utilizo métodos, objetos e atributos para desenvolver um sistema bancário que permite ao usuário realizar depósitos e saques conforme sua necessidade. Aplico conceitos de encapsulamento, trabalhando com atributos privados e públicos. Organizo o código em quatro métodos distintos, tornando-o mais limpo, estruturado e de fácil manutenção.
- **personagem_de_jogo**: Utilizo os métodos Getters e Setters, juntamente com os modificadores de acesso private e public, para organizar e estruturar um jogo de combate em uma dungeon, aplicando conceitos de organização de classes.
- **banco**: Utilizo os métodos Getters e Setters, juntamente com os modificadores de acesso private e public, para organizar e estruturar de um banco, aplicando conceitos de encapsulamento (Primeiro contato) e organização de classes.
- **lutadores** - Primeiro contato com o relacionamento entre classes. Utilizo métodos Getters e Setters para desenvolver um sistema de cadastro e combate entre oponentes, com resultados aleatórios de vitórias, derrotas e empates, utilizando a biblioteca random. Também aplico o conceito de encapsulamento para melhorar a organização do código e facilitar sua utilização pelo usuário.
- **livros** - Exercício que utiliza o relacionamento entre classes para desenvolver duas classes (Pessoa e Livro). O programa permite que o usuário crie uma pessoa e um livro personalizado, associe a pessoa ao livro e realize ações como avançar, voltar e folhear páginas, simulando a leitura de um livro.
- **Escola** - Primeiro contato com o conceito de herança. Desenvolvo um código básico com três classes distintas (Aluno, Professor e Funcionário), cada uma com suas características específicas, mas compartilhando atributos e métodos definidos na classe Pessoas, utilizando a herança para reutilizar e organizar o código.

## Como rodar

### Pré-requisitos

- JDK 17 ou superior instalado.
- VS Code com o *Extension Pack for Java* (opcional, porém bom).

### 1. Baixe o repositório

```bash
git clone https://github.com/MthNuness/java_learning.git
cd java_learning
```

### 2. Execute um exercício

**Pelo VS Code**

1. Abra a pasta `java_poo` em *Arquivo → Abrir Pasta*.
2. Dentro do exercício desejado, abra o arquivo `.java` que está em `src`.
3. Clique em **Run** (acima do método `main`) ou pressione `Ctrl + F5`.
4. Quando o programa pedir dados, digite-os no terminal integrado.

**Pelo terminal**

Entre na pasta do exercício, compile todos os arquivos e execute a classe que tem o `main`:

```bash
cd metodo
javac -d out src/*.java
java -cp out NomeDaClasseComMain
```

## Tecnologias

- Java
- Java POO
- VS Code
- Git e GitHub

---


