# YourDesignPatterns

Design Patterns são padrões de projeto cuja origem inicial é proveniente da área da arquitetura e construção civil. Criado por Christopher Alexander.

Na área de desenvolvimento de software, os design patterns são utilizados no desenvolvimento de componentes e soluções.

Cada pattern possui um conjunto de informações que são compartilhadas com outros desenvolvedores:
- Nome do padrão
- Descrição do problema em que o padrão é recomendado
- Solução
- Resultados esperados

Os principais benefícios da utilização dos patterns são:
- Flexibilidade
- Reusabilidade
- Vocabulário compartilhado
- Boas práticas

Os design patterns são classificados em três categorias:
- Criacionais: são padrões baseados em herança para instanciar processos e objetos.
- Estruturais: são padrões que utilizam classes e objetos para criar estruturas complexas.
- Comportamentais: relacionados a algoritmos e diretivas de responsabilidades entre os componentes.

# 1. Singleton

Descrição: Padrão recomendado para situações em que apenas uma instancia de um determinado componente pode ser utilizada pelo sistema. Ex: Gerenciador de conexões de BD, serviço de mensageria, etc.

Resultados esperados: Instanciação de apenas um objeto, garantindo a economia do uso de recursos e acesso concorrente entre os componentes consumidores.

Solução: criação de uma classe com constructor privado e método de obtenção de instância único para iniciação do objeto único.

# 2. Factory Method

Descrição: Padrão utilizado quando uma classe pai ou interface possui diversas classes filhas e a aplicação precisa selecionar o tipo de subclasse a ser instanciada de forma dinâmica.

Resultados esperados: Flexibilidade na instanciação de subclasses conforme o escopo da solução.

Solução: criação de uma classe com constructor privado e método de obtenção de instância único para iniciação do objeto único.
