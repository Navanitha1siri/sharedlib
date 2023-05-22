
def newGit(repo)
{
  git"https://github.com/intelliqittrainings/${repo}.git"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeploy()
{
 sh "deploy adapters: [tomcat9(credentialsId: '9a815754-0b6e-482f-a9b3-f118548f15c9', path: '', url: 'http://172.31.40.153:8080')], contextPath: 'textapp', war: '**/*.war'"
}

