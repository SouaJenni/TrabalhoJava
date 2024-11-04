# Trabalho em Java

Trabalho dedicado ao aprendizado da Programação Orientada a Objetos (POO), feito inteiramente em Java. 
A versão presente neste repositório foi orientada e feita em conjunto com meu professor @BiaginiMatheus. 

Este é um programa dedicado a fazer telas de cadastro para uma simulação de controle de usuários para um canal de stream na Twitch. 
A seguir, acompanhe as telas e suas especificidades:

1. **tela login:** tela dedicada ao login do streamer/usuário para acesso completo das funcionalidades do programa. 

![tela_login](https://github.com/user-attachments/assets/c9b2bb7c-cd6c-4030-9a4c-5ed69174d5c8)

Elementos:
* **botão registrar:** abre uma próxima tela para preenchimento de dados de cadastro. 
* **botão login:** faz validação de usuário e senha pré cadastrados na tela de registro e permite o login ou envia um aviso caso os dados não estejam corretos.

2. **tela registro:** Tela utilizada para fazer o cadastro de usuários incluindo o preenchimento de dados como nome, email, nome de usuário, data de nascimento, senha e uma confirmação para senha.
Nesta tela temos validações para o nome de usuário, email, senha e confirmação de idade, permitindo o cadastro apenas para usuários maiores de 18 anos.

![tela_registro](https://github.com/user-attachments/assets/d49e3252-c98d-4f00-a677-68023b734a58)

Ao cadastrar um usuário você retorna para a tela de login podendo utilizar os dados que preencheu anteriormente para seguir para a próxima tela.

3. **tela de apresentação dos seguidores:** 
Aqui é o local onde o dono do canal conseguirá ver os dados dos seguidores cadastrados por ele em forma de tabela.  

![tela_tabela](https://github.com/user-attachments/assets/65ac8614-e94b-4c78-91ad-3786c0086f97)

Além disso, nesta tela temos botões para adicionar seguidores, editar dados já cadastrados e excluir algum seguidor já registrado. 
* **botão adicionar:** abre uma nova tela para preenchimento dos dados que serão enviados para a tabela, dados de nome, nome de usuário, idade, sexo, data de inscrição, se é inscrito ou não e quantidade de bits enviados no canal.
Ao preencher os dados e clicar em salvar temos a validação dos campos preenchidos mostrando aviso de erro caso não passem por alguma das validações ou voltando para a tabele e exibindo os dados cadastrados com sucesso. 

![tela_addseguidor](https://github.com/user-attachments/assets/107f6032-f3a5-4575-9fcc-909081c01968)

* **botão editar:** ao selecionar um seguidor na tabele e clicar neste botão, ele abrirá a mesma tela do botão adicionar com uma diferença, aqui os dados pré cadastrados estarão disponíveis nos devidos campos para que o usuário possa editar o que for necessário. Ao clicar no botão salvar, os dados passarão novamente pelas validações e, caso esteja tudo certo, serão atualizados na tabela.

* **botão excluir:** ao selecionar um seguidor cadastrado na tabela e clicar neste botão, o usuário receberáum aviso para avaliar se realmente quer excluir os dados daquele seguidor, caso sim, então será feito. 

![aviso_excluir](https://github.com/user-attachments/assets/38c671f7-5068-476b-9564-f2660d31d51c)


