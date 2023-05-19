
def newGit(repo)
{
  git "https://github.com/intelliqittrainings/{repo}.git"
}
def new()
{
  sh 'mvn package' 
}

