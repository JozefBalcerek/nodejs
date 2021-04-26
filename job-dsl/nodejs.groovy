job('nodejs job')
{
    scm {
        git('https://github.com/Wielebny5666/nodejs.git')
        { node ->
            node / gitConfigName('DSL script')
            node / gitConfigEmail('jenkins-dsl-script@altkom.com')
        }


    }

    triggers{
        scm('H/5 * * * *')
    }

    wrappers{
        nodejs('nodejs')


    }
    steps{
        shell('node app.js')

    }

}



