package tornadofx.tests

import javafx.beans.property.SimpleDoubleProperty
import javafx.scene.control.Label
import javafx.stage.Stage
import org.junit.Assert
import org.junit.Test
import org.testfx.api.FxToolkit
import tornadofx.bind
import java.text.DecimalFormat
import java.text.DecimalFormatSymbols
import java.util.*

class BindingTests {
    val primaryStage: Stage = FxToolkit.registerPrimaryStage()

    @Test
    fun testBindingFormat() {
        val property = SimpleDoubleProperty(Math.PI)

        val label = Label()
        label.bind(property, format = DecimalFormat("#0.0", DecimalFormatSymbols.getInstance(Locale.ENGLISH)))

        Assert.assertEquals("3.1", label.text)
    }

}