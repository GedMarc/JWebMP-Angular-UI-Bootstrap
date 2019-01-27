module com.jwebmp.plugins.angularuibootstrap {
	exports com.jwebmp.plugins.angularuibootstrap;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;
	requires com.jwebmp.core.angularjs;

	provides com.jwebmp.core.services.IPageConfigurator with com.jwebmp.plugins.angularuibootstrap.AngularUIBootstrapPageConfigurator;
	provides com.jwebmp.core.base.angular.services.IAngularModule with com.jwebmp.plugins.angularuibootstrap.AngularUIBootstrapModule;

	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions with com.jwebmp.plugins.angularuibootstrap.implementations.AngularUIBootstrapExclusionsModule;
	provides com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions with com.jwebmp.plugins.angularuibootstrap.implementations.AngularUIBootstrapExclusionsModule;

}
