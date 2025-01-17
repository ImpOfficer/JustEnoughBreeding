package com.christofmeg.justenoughbreeding.rei;

import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.forge.REIPluginClient;

@SuppressWarnings("unused")
@REIPluginClient
public class REIPlugin implements REIClientPlugin {

    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new BreedingCategoryREI());
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        REIUtils.registerMobBreedingRecipes(registry);
    }

}
