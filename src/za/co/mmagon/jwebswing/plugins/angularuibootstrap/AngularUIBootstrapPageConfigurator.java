package za.co.mmagon.jwebswing.plugins.angularuibootstrap;

import za.co.mmagon.jwebswing.Page;
import za.co.mmagon.jwebswing.PageConfigurator;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.plugins.PluginInformation;
import za.co.mmagon.jwebswing.plugins.bootstrap.BootstrapPageConfigurator;
import za.co.mmagon.jwebswing.plugins.jquery.JQueryPageConfigurator;

/**
 * The Angular UI Sortable Configurator
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
@PluginInformation(pluginName = "Angular UI Bootstrap",
		pluginDescription = "Bootstrap components written in pure AngularJS by the AngularUI Team",
		pluginUniqueName = "jwebswing-angular-ui-bootstrap",
		pluginVersion = "2.5.0",
		pluginCategories = "angular,bootstrap, ui,web ui, framework",
		pluginSubtitle = "Bootstrap components written in pure AngularJS by the AngularUI Team",
		pluginSourceUrl = "https://github.com/angular-ui/bootstrap",
		pluginWikiUrl = "https://github.com/GedMarc/JWebSwing-Angular-UI-Bootstrap/wiki",
		pluginGitUrl = "https://github.com/GedMarc/JWebSwing-Angular-UI-Bootstrap",
		pluginIconUrl = "",
		pluginIconImageUrl = "",
		pluginOriginalHomepage = "https://angular-ui.github.io/bootstrap/",
		pluginDownloadUrl = "https://sourceforge.net/projects/jwebswing/files/plugins/AngularUIBootstrap.jar/download"
) class AngularUIBootstrapPageConfigurator extends PageConfigurator
{

	private static final long serialVersionUID = 1L;

	/*
	 * Constructs a new AngularUIBootstrapPageConfigurator
	 */
	public AngularUIBootstrapPageConfigurator()
	{
		//Nothing needed
	}

	@Override
	public Page configure(Page page)
	{
		if (!page.isConfigured())
		{
			JQueryPageConfigurator.setRequired(true);
			AngularPageConfigurator.setRequired(true);
			BootstrapPageConfigurator.setRequired(page.getBody(), true);

			page.getBody().addJavaScriptReference(AngularUIBootstrapReferencePool.AngularUIBootstrap.getJavaScriptReference());
			page.getBody().addCssReference(AngularUIBootstrapReferencePool.AngularUIBootstrap.getCssReference());
			page.getAngular().getAngularModules().add(new AngularUIBootstrapModule());
		}
		return page;
	}
}
