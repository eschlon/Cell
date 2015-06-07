name := "Cell"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies += "org.scalafx" %% "scalafx" % "8.0.40-R8"

libraryDependencies += "com.typesafe.akka" % "akka-actor_2.10" % "2.3.11"

unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/jfxrt.jar"))