
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
  deploy adapters: [tomcat9(credentialsId: 'f83619d2-4f29-4c28-acb3-1d118422e053', path: '', url: 'http://172.31.21.34:8080')], contextPath: 'testapp', war: '**/*.war'
}
def executeSelenium(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
def newDeleviry()
{
  deploy adapters: [tomcat9(credentialsId: 'f83619d2-4f29-4c28-acb3-1d118422e053', path: '', url: 'http://172.31.25.234:8080')], contextPath: 'prodapp', war: '**/*.war'
}



