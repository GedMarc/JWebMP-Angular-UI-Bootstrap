package com.jwebmp.plugins.angularuibootstrap.implementations;

import com.jwebmp.guicedinjection.interfaces.IGuiceScanJarExclusions;
import com.jwebmp.guicedinjection.interfaces.IGuiceScanModuleExclusions;

import javax.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Set;

public class AngularUIBootstrapExclusionsModule
		implements IGuiceScanModuleExclusions<AngularUIBootstrapExclusionsModule>,
				           IGuiceScanJarExclusions<AngularUIBootstrapExclusionsModule>
{

	@Override
	public @NotNull Set<String> excludeJars()
	{
		Set<String> strings = new HashSet<>();
		strings.add("jwebmp-angular-ui-bootstrap-*");
		return strings;
	}

	@Override
	public @NotNull Set<String> excludeModules()
	{
		Set<String> strings = new HashSet<>();
		strings.add("com.jwebmp.plugins.angularuibootstrap");
		return strings;
	}
}
