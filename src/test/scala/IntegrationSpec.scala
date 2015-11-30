import org.specs2.mutable._
import org.specs2.runner._
import org.junit.runner._

import play.api.test._
import play.api.test.Helpers._

/**
 * add your integration spec here.
 * An integration test will fire up a whole play application in a real (or headless) browser
 */
@RunWith(classOf[JUnitRunner])
class IntegrationSpec extends Specification {

  "Application" should {

    "work from within a browser to psmaster1 application index page then move to psmod1 module index page" in new WithBrowser {

      // Home page
      browser.goTo("http://localhost:" + port)
      browser.pageSource must contain("Message from psmaster1")

      // psmod1 module entry page
      browser.goTo("http://localhost:" + port + "/psmod1")
      browser.pageSource must contain("Message from psmod1")

      // example view with with full namespace (check src/main/twirl/views/)
      browser.goTo("http://localhost:" + port + "/fns")
      browser.pageSource must contain("full namespace")

    }

  }
}

