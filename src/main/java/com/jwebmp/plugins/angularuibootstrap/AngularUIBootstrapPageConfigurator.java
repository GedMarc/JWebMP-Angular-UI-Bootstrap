/*
 * Copyright (C) 2017 GedMarc
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.jwebmp.plugins.angularuibootstrap;

import com.jwebmp.core.Page;
import com.jwebmp.core.base.angular.AngularPageConfigurator;
import com.jwebmp.core.plugins.PluginInformation;
import com.jwebmp.core.plugins.jquery.JQueryPageConfigurator;
import com.jwebmp.core.services.IPageConfigurator;

import javax.validation.constraints.NotNull;

/**
 * The Angular UI Sortable Configurator
 *
 * @author GedMarc
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular UI Bootstrap",
		pluginDescription = "Bootstrap components written in pure AngularJS by the AngularUI Team",
		pluginUniqueName = "jwebswing-angular-ui-bootstrap",
		pluginVersion = "2.5.0",
		pluginCategories = "angular,bootstrap, ui,web ui, framework",
		pluginSubtitle = "Bootstrap components written in pure AngularJS by the AngularUI Team",
		pluginSourceUrl = "https://github.com/angular-ui/bootstrap",
		pluginWikiUrl = "https://github.com/GedMarc/JWebMP-Angular-UI-Bootstrap/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebMP-Angular-UI-Bootstrap",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://angular-ui.github.io/bootstrap/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularUIBootstrap.jar/download")
public class AngularUIBootstrapPageConfigurator
		implements IPageConfigurator<AngularUIBootstrapPageConfigurator>
{
	/**
	 * If this configurator is enabled
	 */
	private static boolean enabled = true;

	/*
	 * Constructs a new AngularUIBootstrapPageConfigurator
	 */
	public AngularUIBootstrapPageConfigurator()
	{
		//Nothing needed
	}

	/**
	 * Method isEnabled returns the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @return the enabled (type boolean) of this AngularAnimatedChangePageConfigurator object.
	 */
	public static boolean isEnabled()
	{
		return AngularUIBootstrapPageConfigurator.enabled;
	}

	/**
	 * Method setEnabled sets the enabled of this AngularAnimatedChangePageConfigurator object.
	 * <p>
	 * If this configurator is enabled
	 *
	 * @param mustEnable
	 * 		the enabled of this AngularAnimatedChangePageConfigurator object.
	 */
	public static void setEnabled(boolean mustEnable)
	{
		AngularUIBootstrapPageConfigurator.enabled = mustEnable;
	}

	@NotNull
	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);

			page.getBody()
			    .addJavaScriptReference(AngularUIBootstrapReferencePool.AngularUIBootstrap.getJavaScriptReference());
			page.getBody()
			    .addCssReference(AngularUIBootstrapReferencePool.AngularUIBootstrap.getCssReference());
		}
		return page;
	}

	@Override
	public boolean enabled()
	{
		return AngularUIBootstrapPageConfigurator.enabled;
	}
}
