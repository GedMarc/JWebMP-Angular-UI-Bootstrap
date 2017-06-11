package za.co.mmagon.jwebswing.plugins.angularuibootstrap;

import za.co.mmagon.jwebswing.base.angular.modules.AngularModuleBase;

/**
 * The module getting loaded into angular
 *
 * @author Marc Magon
 * @since 08 Jun 2017
 */
class AngularUIBootstrapModule extends AngularModuleBase
{

    private static final long serialVersionUID = 1L;

    /*
     * Constructs a new AngularUIBootstrapModule
     */
    public AngularUIBootstrapModule()
    {
        super("ui.bootstrap");
    }

    @Override
    public String renderFunction()
    {
        return null;
    }
}
