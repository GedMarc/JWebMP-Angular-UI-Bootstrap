import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.plugins.angularuibootstrap.AngularUIBootstrapModule;
import com.jwebmp.plugins.angularuibootstrap.AngularUIBootstrapPageConfigurator;

module com.jwebmp.plugins.angularuibootstrap {
	exports com.jwebmp.plugins.angularuibootstrap;

	requires com.jwebmp.core;
	requires java.validation;
	provides IPageConfigurator with AngularUIBootstrapPageConfigurator;
	provides IAngularModule with AngularUIBootstrapModule;

}
