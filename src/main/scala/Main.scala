import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.geometry.Insets
import scalafx.scene.Scene
import scalafx.scene.control.Label
import scalafx.scene.layout.BorderPane

object Main extends JFXApp{
  stage = new PrimaryStage {
    title = "Cell"
    scene = new Scene {
      root = new BorderPane {
        padding = Insets(25)
        center = new Label("Hello World")
      }
    }
  }

  case class Cell(name: String, health: Int, position: (Int, Int)) {
    def move (x: Int, y: Int): Cell = {
      Cell(this.name, this.health, (x, y))
    }
  }

  val myCell = Cell("Bob", 10, (0, 0))
}



