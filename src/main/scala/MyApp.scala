import scalafx.application.JFXApp
import scalafx.application.JFXApp.PrimaryStage
import scalafx.scene.Scene
import scalafx.scene.paint.Color
import scalafx.scene.text.{Font, Text}


object MyApp extends JFXApp{
  stage = new PrimaryStage(){
    title = "test app"
    alwaysOnTop = true
    scene = new Scene( width = 500, height = 400){
      fill = Color.Blue
      content =
        List(
          new Text(30, 45,"welcome to PRG2104"){
            font = new Font( name= "Serif", size = 55.0)

      }
        )
    }
  }


}