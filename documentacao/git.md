# documentação GIT

##Comandos GIT

Comando para adicionar arquivos na caixa

    git add .                

Comando para fechar a caixa

    git commit - m "Descrição do comentario"

comando para salvar credenciais

    git config credential.helper 'store'

comando para criar nova branch

    git checkout -b nova_branch

comando para upar branch local para remoto

    git push origin nome_branch

comando para deletar branch

    git branch -d nome_branch

comando para deletar branch do git

    git push origin --delete nome_branch

comando para navegar entre branchs

    git checkout nome_branch

comando para formatar codigo

    CNTRL + ALT + L

comando para desfazer tudo o que eu fiz desde o ultimo commit

    git clean -df
    git checkout -- .

comando para alterar arquivos ja commitados ( nao serve para arquivos novos)

    git commit -a -m "comentario"



