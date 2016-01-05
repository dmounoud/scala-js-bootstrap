package ch.diadys.bootstrap

import org.scalajs.jquery.JQuery

package object bootstrap {
  implicit def jq2fv(jq: JQuery): Bootstrap = jq.asInstanceOf[Bootstrap]
}
