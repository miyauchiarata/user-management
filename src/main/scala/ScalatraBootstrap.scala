import com.example.app._
import org.scalatra._
import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle {
  // override def init(context: ServletContext) {
  //   context.mount(new MyScalatraServlet, "/*")
  // }
  override def init(context: ServletContext) {
    configureDb()
    context mount (new ArticlesController, "/*")
  }

  override def destroy(context:ServletContext) {
    closeDbConnection()
  }
}
