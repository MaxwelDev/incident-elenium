# incident-elenium

Este projeto foi desenvolvido para testar o front-end da aplicação que está disponível na url http://front-incident.surge.sh/. O projeto utiliza a ferramenta Selenium para a realização dos testes, abaixo seguem instruções para que o projeto possa ser executado com sucesso.

![Alt Text](https://www.sam-solutions.com/blog/wp-content/uploads/2017/10/Selenium.png)</br></br></br>

- Para que o teste possa ser executado é necessário fazer o download do chrome driver que está disponivel na urlhttps://chromedriver.storage.googleapis.com/index.html?path=2.33/.

- Após fazer o download do chrome driver é necessário ir até a classe SettingsToExecuteTests, e inserir dentro do contrutor do enum DRIVE_LOCATION o caminho no qual o chrome driver está. como no exemplo abaixo:

- Exemplo: DRIVE_LOCATION("/home/maxwel/Documents/chromedriver")

- Feito isso, basta ir até a classe IncidentTest e executar o teste.

Caso não consiga executar o projeto ou tenha algum problema me mande um email maxwel.silva2@fatec.sp.gov.br
