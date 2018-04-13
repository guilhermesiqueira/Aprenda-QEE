# Aprenda QEE.
**INSTRUÇÕES PARA A EXECUÇÃO DO PROGRAMA:**

**1º Passo:** Clone o repositório **https://gitlab.com/guilhermesiqueira/ep2** em um diretório de sua preferência (ou baixe a pasta).

**2º Passo:** No **ECLIPSE**, clique em file -> Open Projects from File System e selecione a pasta "ep2" que foi clonada no passo 1.

**3º Passo:** Com o projeto já aberto no Eclipse, abra a pasta "src" e clique com o botão direito do mouse em "main" e selecione a opção "Run as -> Java Application".

**MANUAL PARA BOM FUNCIONAMENTO DO PROGRAMA:**
* Quando selecionada a opção Fluxo de Potencia Fundamental, deve-se preencher o campo "Amplitude (Vrms)" com valores entre 0 e 220, o campo "Amplitude (Irms)" com valores entre 0 e 100, o campo "Ângulo de Fases da Tensão (θº)" e "Ângulo de Fases da Corrente (θº)" com valores entre -180 e 180.
* A qualquer momento pode-se retornar ao menu inicial ao pressionar o botão "Voltar".

* Quando selecionada a opção Distorção Harmônica, deve-se preencher os campos de "Amplitude" 0 e 220, e os campos de "Ângulos" com valores entre -180 e 180.
* A qualquer momento pode-se retornar ao menu inicial ao pressionar o botão "Voltar".




**Considerações:**
* Mesmo sabendo que não é uma boa prática a comunicação entre a View e a Model no MVC, ela foi feita, mas de modo que não prejudique o padrão MVC, mantendo uma boa manutenibilidade ao programa.
* No caso Fluxo de Potência Fundamental, houve um problema com thread que não consegui sanar, entretanto, é possível, com certa sorte e clicando no botão simular repetidas vezes, verificar todos os resultados das potências e os gráficos ao mesmo tempo.
* Foi utilizada uma interface simples, apenas para demonstrar a capacidade de uso da mesma.
* O teste unitário foi feito com o JUnit 4.

 

**Autor:** Guilherme Siqueira Brandão

**Disciplina:** Orientação a Objetos - 2º Semestre de 2017

**Instituição:** Universidade de Brasília - UnB
