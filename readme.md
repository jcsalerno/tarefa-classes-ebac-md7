# Tarefa de Criação de Classe em Java

Esta tarefa consiste em pegar um objeto do mundo real, criar uma classe representando esse objeto, definir suas propriedades e criar métodos simples para manipular essas propriedades. O objetivo é aplicar conceitos de Programação Orientada a Objetos (POO) em Java.

## Descrição

O objeto escolhido para esta tarefa é uma **Caneta**. A classe `Caneta` foi criada para representar uma caneta com suas características e comportamentos básicos.

## Propriedades da Caneta

A classe `Caneta` possui as seguintes propriedades:

- **cor**: A cor da caneta.
- **marca**: A marca da caneta.
- **comprimento**: O comprimento da caneta.
- **tampada**: Um booleano indicando se a caneta está tampada ou não.

## Métodos da Caneta

A classe `Caneta` inclui os seguintes métodos:

- **Construtor**
    - `Caneta(String cor, String marca, double comprimento)`: Inicializa uma nova caneta com as propriedades especificadas e define a caneta como tampada por padrão.

- **Métodos Getters e Setters**
    - `getCor()`: Retorna a cor da caneta.
    - `setCor(String cor)`: Define a cor da caneta.
    - `getMarca()`: Retorna a marca da caneta.
    - `setMarca(String marca)`: Define a marca da caneta.
    - `getComprimento()`: Retorna o comprimento da caneta.
    - `setComprimento(double comprimento)`: Define o comprimento da caneta.

- **Métodos de Estado**
    - `isTampada()`: Verifica se a caneta está tampada.
    - `tampar()`: Tampa a caneta.
    - `destampar()`: Destampa a caneta.

- **Método de Ação**
    - `escrever(String texto)`: Escreve o texto especificado se a caneta estiver destampada. Caso contrário, solicita que a caneta seja destampada.