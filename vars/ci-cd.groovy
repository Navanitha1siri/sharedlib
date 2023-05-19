
def newGit(repo)
{
  git "https://github.com/intelliqittrainings/{repo}.git"
}
def maven()
{
  sh 'mvn package' 
}

