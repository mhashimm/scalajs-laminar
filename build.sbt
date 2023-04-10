import org.scalajs.linker.interface.ModuleSplitStyle

lazy val livechart = project.in(file("."))
    .enablePlugins(ScalaJSPlugin)
    .settings(
        scalaVersion := "3.2.2",
        scalaJSUseMainModuleInitializer := true,
        scalaJSLinkerConfig ~= {
            _.withModuleKind(ModuleKind.ESModule)
             .withModuleSplitStyle(
                ModuleSplitStyle.SmallModulesFor(List("livechart")))
        },
        libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "2.4.0",
        libraryDependencies += "com.raquo" %%% "laminar" % "15.0.1"
    )