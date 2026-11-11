# Filtro de Nomes com Lambda e Interface Funcional

Projeto de prática em Java que usa **expressões Lambda**, uma **interface funcional própria** e a **Stream API** para filtrar uma lista de nomes.

## Objetivo

Armazenar uma lista de nomes e exibir no console apenas os que começam com a letra "A", aplicando a regra de filtragem por meio de uma interface funcional criada no próprio projeto.

## Conceitos praticados

- Interface funcional com `@FunctionalInterface`
- Implementação de comportamento com expressão Lambda
- Stream API: `stream()`, `filter()` e `forEach()`
- Organização e publicação de projeto no GitHub

## Estrutura do projeto

- `FiltroNome.java`: interface funcional com o método `boolean testar(String nome)`
- `Main.java`: cria a lista de nomes, define a regra com Lambda e aplica o filtro com `stream().filter()`

## Como executar

1. Clone o repositório:
   ```
   git clone <link-do-repositorio>
   ```
2. Abra o projeto em uma IDE Java (IntelliJ, Eclipse ou VS Code).
3. Execute a classe `Main`.

## Resultado esperado

No console aparecem apenas os nomes que começam com "A":

```
Alberto
Ana Clara
Amanda
```

## Tecnologias

- Java
- Git e GitHub

## Autor

Vini — projeto desenvolvido como exercício prático do curso de Java.
