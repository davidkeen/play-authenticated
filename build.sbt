name := "play-authenticated"

version := "1.0"

lazy val `authenticated` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  evolutions,
  "com.typesafe.play" %% "anorm" % "2.5.0",
  cache,
  ws,
  specs2 % Test )

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )  

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

routesGenerator := InjectedRoutesGenerator