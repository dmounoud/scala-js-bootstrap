package ch.diadys

import org.scalajs.jquery.JQuery

package object bootstrap {
  implicit def jq2bs(jq: JQuery): Bootstrap = jq.asInstanceOf[Bootstrap]
}
