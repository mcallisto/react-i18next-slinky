package demo.i18next

import org.scalatest.funsuite.AnyFunSuite
import vision.id.i18next.facade.reactI18next.components._
import vision.id.i18next.facade.reactI18next.mod.{Namespace, useTranslation}

class I18nextTest extends AnyFunSuite {

  val namespace: Namespace = "z"
  val (t, i18n) = useTranslation(namespace)
  t("my text")

  Trans().i18nKey("userMessagesUnread").count(1)(
    s"Hello ${Trans.t("name")}"
  )

}
