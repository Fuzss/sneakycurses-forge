package com.fuzs.puzzleslib_sm.element;

import net.minecraftforge.common.ForgeConfigSpec;

/**
 * provides features for setting up a {@link AbstractElement} with config options
 */
public interface IConfigurableElement {

    /**
     * @return is the element enabled
     */
    boolean isEnabled();

    /**
     * @return is the element enabled by default
     */
    boolean getDefaultState();

    /**
     * @return name of this element
     */
    String getDisplayName();

    /**
     * @return description for this element
     */
    String getDescription();

    /**
     * add an entry for controlling this element in the general config section
     * @param builder active config builder
     */
    void setupGeneralConfig(ForgeConfigSpec.Builder builder);

    /**
     * clean-up actions to run when this element is disabled as a whole
     */
    void unload();

}
