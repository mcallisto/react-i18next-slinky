package demo.i18next

import slinky.core
import org.scalajs.dom.raw.{Blob, BlobPropertyBag}
import org.scalatest.funsuite.AnyFunSuite
import vision.id.i18next.facade.reactI18next.components._
import vision.id.i18next.facade.reactI18next.mod.{Namespace, useTranslation}

import scala.scalajs.js

class I18nextTest extends AnyFunSuite {

  val namespace: Namespace = "z"
  val (t, i18n) = useTranslation(namespace)
  t("my text")

  Trans().i18nKey("userMessagesUnread").count(1)(
    s"Hello ${Trans.t("name")}"
  )

}
