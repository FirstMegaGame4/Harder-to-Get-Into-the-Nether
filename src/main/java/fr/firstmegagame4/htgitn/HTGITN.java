package fr.firstmegagame4.htgitn;

import com.mmodding.mmodding_lib.library.base.MModdingModInitializer;
import com.mmodding.mmodding_lib.library.initializers.ElementsInitializer;
import org.quiltmc.loader.api.ModContainer;

import java.util.List;

public class HTGITN implements MModdingModInitializer {

	@Override
	public List<ElementsInitializer> getElementsInitializers() {
		return null;
	}

	@Override
	public void onInitialize(ModContainer mod) {
		MModdingModInitializer.super.onInitialize(mod);

	}
}
