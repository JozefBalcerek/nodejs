job('nodejs job')
{
    scm {
        git('https://github.com/Wielebny5666/nodejs.git')



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



