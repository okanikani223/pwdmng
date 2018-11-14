name := "pwdmng"

version := "0.1"

scalaVersion := "2.12.7"

// https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-web
libraryDependencies += "org.springframework.boot" % "spring-boot-starter-web" % "2.1.0.RELEASE"
// https://mvnrepository.com/artifact/org.spockframework/spock-core
libraryDependencies += "org.spockframework" % "spock-core" % "1.2-groovy-2.5" % Test
// https://mvnrepository.com/artifact/org.codehaus.groovy/groovy-all
libraryDependencies += "org.codehaus.groovy" % "groovy-all" % "2.5.4" pomOnly()