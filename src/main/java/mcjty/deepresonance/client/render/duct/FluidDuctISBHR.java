package mcjty.deepresonance.client.render.duct;

import mcjty.deepresonance.client.render.DefaultISBRH;
import mcjty.deepresonance.client.render.ModRenderers;

/**
 * Created by Elec332 on 15-8-2015.
 */
public class FluidDuctISBHR extends DefaultISBRH{

    @Override
    public int getRenderId() {
        return ModRenderers.ductRenderID;
    }

}
