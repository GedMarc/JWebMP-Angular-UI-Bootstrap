import com.jwebmp.core.base.angular.services.IAngularModule;
import com.jwebmp.core.services.IPageConfigurator;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;
import com.jwebmp.plugins.angularuibootstrap.AngularUIBootstrapModule;
import com.jwebmp.plugins.angularuibootstrap.AngularUIBootstrapPageConfigurator;
import com.jwebmp.plugins.angularuibootstrap.implementations.AngularUIBootstrapExclusionsModule;

module com.jwebmp.plugins.angularuibootstrap {
	exports com.jwebmp.plugins.angularuibootstrap;

	requires com.jwebmp.core;
	requires java.validation;
	requires com.jwebmp.guicedinjection;

	provides IPageConfigurator with AngularUIBootstrapPageConfigurator;
	provides IAngularModule with AngularUIBootstrapModule;

	provides IGuiceScanModuleExclusions with AngularUIBootstrapExclusionsModule;
	provides IGuiceScanJarExclusions with AngularUIBootstrapExclusionsModule;

}
