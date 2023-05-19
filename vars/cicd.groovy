
def newGit(repo)
{
  git"https://github.com/intelliqittrainings/{repo}.git"
}
defnewMaven()
{
  sh 'mvn package'
}
