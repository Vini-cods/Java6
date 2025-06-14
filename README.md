# Sistema de Academia - Cálculo de IMC

Este projeto demonstra conceitos básicos de Programação Orientada a Objetos (POO) em Java, criando um sistema simples para gerenciar alunos de uma academia e calcular seu Índice de Massa Corporal (IMC).

## 📋 Descrição

O sistema é composto por duas classes principais que trabalham juntas para representar alunos de uma academia e calcular automaticamente seu IMC, fornecendo também a classificação correspondente.

## 🏗️ Estrutura do Projeto

### Classe `AlunoAcademia`
Representa um aluno da academia com os seguintes atributos:
- **nome**: Nome completo do aluno
- **peso**: Peso em quilogramas (kg)
- **altura**: Altura em metros (m)

#### Métodos:
- `AlunoAcademia(String nome, double peso, double altura)`: Construtor que inicializa um novo aluno
- `calcularIMC()`: Calcula e retorna o IMC usando a fórmula: peso ÷ (altura²)
- `exibirStatus()`: Exibe as informações completas do aluno, incluindo IMC e classificação

### Classe `Academia`
Classe principal que contém o método `main` e demonstra o uso do sistema criando dois alunos exemplo.

## 📊 Classificação do IMC

O sistema classifica automaticamente o IMC conforme os padrões médicos:

| IMC | Classificação |
|-----|---------------|
| < 18.5 | Abaixo do peso |
| 18.5 - 24.9 | Peso normal |
| 25.0 - 29.9 | Sobrepeso |
| ≥ 30.0 | Obesidade |

## 🚀 Como Executar

1. Compile as classes Java:
```bash
javac Academia.java AlunoAcademia.java
```

2. Execute o programa:
```bash
java Academia
```

## 💻 Exemplo de Saída

```
Nome: Lucas Mendes
IMC: 26.122448979591837
Classificação: Sobrepeso

Nome: Marina Lopes
IMC: 20.3125
Classificação: Peso normal
```

## 🎯 Conceitos Demonstrados

- **Encapsulamento**: Atributos e métodos organizados dentro de classes
- **Construtores**: Inicialização adequada de objetos
- **Métodos**: Operações específicas para calcular IMC e exibir informações
- **Estruturas condicionais**: Classificação baseada em faixas de valores
- **Instanciação de objetos**: Criação de múltiplos alunos

## 📝 Observações

- O cálculo do IMC utiliza a fórmula padrão: IMC = peso ÷ altura²
- As classificações seguem os padrões estabelecidos pela Organização Mundial da Saúde (OMS)
- O sistema pode ser facilmente expandido para incluir mais funcionalidades como histórico de peso, metas, etc.
