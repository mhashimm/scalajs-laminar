package livechart

import com.raquo.laminar.api.L.{*, given}
import org.scalajs.dom

@main
def LiveChart(): Unit = 
    renderOnDomContentLoaded(
        dom.document.querySelector("#app"), Main.appElement()
    )

object Main:
    def appElement(): Element =
        div(
            h1("Hello Scala.js, Vite and Laminar!"),
            a(href :="httpss://vitejs.dev/guide/feature.html",
                target := "_blank", "Documentation"),
                
        )