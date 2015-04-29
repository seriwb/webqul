package white.box.webqul.application

import static groovyx.javafx.GroovyFX.start

/**
 *
 *
 * @author seri
 */
start {
	stage(title: 'Webqul', visible: true) {
//		scene(width: 840, height: 600) {
		scene() {
			fxml this.class.getResource('/Application.fxml')
		}
	}
}
