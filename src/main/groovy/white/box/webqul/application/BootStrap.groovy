package white.box.webqul.application

import groovy.util.logging.Slf4j

/**
 * ロジックの初期化処理を行うクラス。<br>
 * 
 * @author seri
 */
@Slf4j
class BootStrap {
	
	/**
	 * アプリケーションの初期化処理。<br>
	 * 以下の処理を行う。<br>
	 * <ul>
	 * <li>JDBC設定の読み込み</li>
	 * <li>Optional:読み込んだJDBC別のDB設定を行う。</li>
	 * <li>処理対象とするテーブル一覧の読み込み（Excelファイル）。
	 * 読み込んだクラスの一覧を表示する。</li>
	 * <li>カラム名辞書を取り込むと対応するカラムの日本語を表示する（Excelファイル）。
	 * 存在しない場合は表示しない。</li>
	 * </ul>
	 * configディレクトリ配下のjdbc.propertiesを読み込む。<br>
	 * 当該ファイル、または必要な情報が存在しなければIllegalArgumentExceptionを発生させる。<br>
	 * 
	 * @return
	 */
	def init = { config ->
		config = new ConfigSlurper().parse(
				new File('./conf/Config.groovy').getText("UTF-8"))
	}
	
	/**
	 * JDBC設定の読み込みを行う。<br>
	 */
	void loadJdbc() {
		
	}
}
