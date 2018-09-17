/**
 *
 * @author Patrick Latorre
 * @version 1.0.0
 *
 * GooeyController
 *
 * Each FXML file has a respective 'controller'. However,
 * JavaFX does not have a native strategy to generify
 * controller classes.
 *
 * Gooey handles this by letting the GooeyController be
 * the parent of all FXML controllers. Because of this,
 * it allows the Gooey class to properly store any given
 * FXML controller as an attribute; encapsulating it
 * with the FXML file.
 *
 * To allow this, simply EXTEND the FXML controller to
 * this GooeyController class.
 *
 * @see com.sectionfx.Gooey
 *
 * */

package com.sectionfx;

public abstract class GooeyController
{
}
