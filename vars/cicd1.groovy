def newGit(repo)
{
  git"https://github.com/intelliqittrainings/${repo}.git"
}
def newMaven()
{
  sh 'mvn package'
}
def newDeploy(ipaddress,context)
{
    deploy adapters: [tomcat9(credentialsId: 'f6c6cf4b-a5ee-4927-8583-0d6f62a9589b', path: '', url: 'http://${ipaddress}:8080')], contextPath: '${testapp}', war: '**/*.war'
}
def executeSelenium(jobname)
{
  sh "java -jar /var/lib/jenkins/workspace/${jobname}/testing.jar"
}
