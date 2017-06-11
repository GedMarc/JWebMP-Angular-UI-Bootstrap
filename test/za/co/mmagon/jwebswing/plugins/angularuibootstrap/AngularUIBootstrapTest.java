/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.co.mmagon.jwebswing.plugins.angularuibootstrap;

import za.co.mmagon.jwebswing.plugins.angularuibootstrap.AngularUIBootstrap;
import org.junit.Test;
import za.co.mmagon.jwebswing.base.html.List;

/**
 *
 * @author Marc Magon
 */
public class AngularUIBootstrapTest
{

    public AngularUIBootstrapTest()
    {
    }

    @Test
    public void testSomeMethod()
    {
        List list = new List();
        AngularUIBootstrap.applyToList(list);
        System.out.println(list.toString(true));
    }

}
