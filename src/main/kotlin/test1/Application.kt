package test1

import javafx.stage.Stage
import tornadofx.*

class Application : App() {
    override val primaryView = Calculator::class

    override fun start(stage: Stage) {
        importStylesheet("/test1/style.css")
        stage.isResizable = false
        super.start(stage)
    }
}