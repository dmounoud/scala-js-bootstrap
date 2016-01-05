package ch.diadys.bootstrap

import scala.scalajs.js
import org.scalajs.jquery.JQuery
import org.scalajs.jquery.JQueryEventObject

@js.native
trait Bootstrap extends JQuery {

  def modal(options: js.UndefOr[js.Dynamic]): Bootstrap = js.native
  def modal(methodName: String): Bootstrap = js.native
  
  def dropdown(options: js.UndefOr[js.Dynamic]): Bootstrap = js.native
  def dropdown(methodName: String): Bootstrap = js.native
  
  def scrollspy(options: js.UndefOr[js.Dynamic]): Bootstrap = js.native
  def scrollspy(methodName: String): Bootstrap = js.native
  
  def tab(): Bootstrap = js.native
  def tab(methodName: String): Bootstrap = js.native
  
  def tooltip(options: js.UndefOr[js.Dynamic]): Bootstrap = js.native
  def tooltip(methodName: String): Bootstrap = js.native
  
  def popover(options: js.UndefOr[js.Dynamic]): Bootstrap = js.native
  def popover(methodName: String): Bootstrap = js.native
  
  def alert(): Bootstrap = js.native
  def alert(methodName: String): Bootstrap = js.native
  
  def button(methodName: String): Bootstrap = js.native
  
  def collapse(options: js.UndefOr[js.Dynamic]): Bootstrap = js.native
  def collapse(methodName: String): Bootstrap = js.native
  
  def carousel(options: js.UndefOr[js.Dynamic]): Bootstrap = js.native
  def carousel(methodName: String): Bootstrap = js.native
  
  def affix(options: js.UndefOr[js.Dynamic]): Bootstrap = js.native
  def affix(methodName: String): Bootstrap = js.native
  
}

object Bootstrap {
  implicit def jq2bs(jq: JQuery): Bootstrap = jq.asInstanceOf[Bootstrap]
}
