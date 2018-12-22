package controllers

import play.api.mvc._
import play.api.data._
import play.api.data.Forms._
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.i18n.{MessagesApi, I18nSupport}
import play.api.db.slick._
import slick.driver.JdbcProfile
import models.Tables._
import javax.inject.Inject
import scala.concurrent.Future
import slick.driver.H2Driver.api._

/*
* DatabaseConfigProvider : コントローラ内でDBにアクセスするため
* MessageAPI : Playの国際化機能(日本語を使うか英語を使うかなど)を使用するため
*              実際は使用しないが、テンプレート内で使用するヘルパーのために必要
* I18nSupport : 国際化のために必要
* @Inject : DI(依存性の注入)のためのアノテーション
*/
class UserController @Inject()(val dbCfgProvider: DatabaseConfigProvider, val msgApi: MessagesApi) extends Controller
  with HasDatabaseConfigProvider[JdbcProfile] with I18nSupport {
  def list = TODO

  def edit(id: Option[Long]) = TODO

  def create = TODO

  def update = TODO

  def remove(id: Long) = TODO
}
