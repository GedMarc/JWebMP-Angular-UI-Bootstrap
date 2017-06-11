package za.co.mmagon.jwebswing.plugins.angularuibootstrap;

import za.co.mmagon.jwebswing.base.ComponentHierarchyBase;
import za.co.mmagon.jwebswing.base.html.List;
import za.co.mmagon.jwebswing.plugins.ComponentInformation;

/**
 * Angular UI Sortable Helper
 *
 * @author Marc Magon
 * @since 09 Jun 2017
 */
@ComponentInformation(name = "Angular UI Bootstrap", description = "Bootstrap components written in pure AngularJS by the AngularUI Team",
        url = "https://angular-ui.github.io/bootstrap/")
public class AngularUIBootstrap
{

    /*
     * Constructs a new AngularUIBootstrap
     */
    AngularUIBootstrap()
    {
        //Nothing needed
    }

    /**
     * Apply to a UL list
     *
     * @param list
     */
    public static void applyToList(List list)
    {
        list.addAttribute("ui-sortable", "");
    }

    /**
     * Apply to any component
     *
     * @param list
     */
    public static void applyToComponent(ComponentHierarchyBase list)
    {
        list.addAttribute("ui-sortable", "");
    }
}
