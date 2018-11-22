name = userInput (
    type : "STRING",
    value : "This is a generic description name",
    description : "Please provide a repository name"
  )

artifactory(name){
   localRepository("docker-local") {
     packageType "docker"
     description "My local Docker registry"
   }
}