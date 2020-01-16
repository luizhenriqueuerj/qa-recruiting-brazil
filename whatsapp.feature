# language: pt
  Funcionalidade: Alterar o PIN do WhatsApp
  
  Contexto: Estar logado no WhatsApp com a sua própria conta e já possuir uma senha de confirmação em duas etapas
  
    Cenário: Usuário irá mudar a senha do PIN
    	Dado que estou na área de conversas
        Quando acesso as Configurações
        E acesso a opção "Conta"
        E acesso a opção "Confirmação em duas etapas"
        E acesso a opção "Mudar PIN"
        Então deve aparecer a opção para inserir um PIN de 6 dígitos numéricos
        E o usuário digita os 6 números
        Então deve aparecer a opção para digitar, de novo, os 6 digítos numéricos
        E o usuário digita os mesmos 6 números da última opçao
        E o usuário seleciona a opção "Salvar"
        Então a senha é trocada com sucesso



  Funcionalidade: Alterar a foto de perfil

  Contexto: Estar logado no WhatsappWeb

	Cenário: Usuário irá mudar a própria foto de perfil
	Dado que estou na área de conversas
	Quando acesso o menu de opções
	E clico em Perfil
	E clico em "Mudar foto do Perfil"
	E clica em "Carregar foto"
	Então o Usuário seleciona a foto que se encontra no computador
	Então o Usuário personaliza o tamanho da foto para o perfil
	E clica no "Check", de cor verde.
	Então a foto é alterada com sucesso.
