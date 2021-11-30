- Mapear entidade Produto com os seguintes atributos:

Exercício de Query Methods:
    Criar métodos no repositório para:
    - Buscar todos os produtos
    - Buscar produtos pelo nome
    - Buscar produtos no intervalo de valor (mínimo, máximo)
    XXX - Buscar o primeiro produto ativo com valor superior a 100 reais

Exercício de JPQL:
    Criar método no repositório para:
    - Listar produtos ativos filtrando por nome

Exercício de SQL:
- Listar todos os produtos ativos ordenando por preço
- contar a quantidade de produtos inativos

Agendamentos:

- Criar nova entidade Agendamento com os seguintes atributos (id, dataHoraInicio, dataHoraFim, observações)
- Criar Repositório com as seguintes consultas (uma utilizando QueryMethod, outra jpql e outra sql):
  - Buscar agendamentos do dia.
  - Buscar agendamentos dos próximos 7 dias.
  - Buscar agendamento por ID.

Escolha sua estratégia:
- deixar as datas no Java, e passa duas datas (between) pro SQL.
  - direto no SQL usando funções do SQL como o CURRENT_DATE()
    - select * from tabela where nascimento between CURRENT_DATE()-7 and CURRENT_DATE()


Exercício DTO de Produtos:

- Criar Service ProdutoService.
- Criar método listar produtos.
- Criar DTO ProdutoListagem com ID, NOME, VALOR.
- Usando stream com .map, converter a entidade no DTO.
- Criar factory para fazer a criação do DTO.
- Criar método de teste da lista de produtos.

