package {{ cookiecutter.modGroup }};

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class {{ cookiecutter.modMainClass }} implements ModInitializer {
	public static final String MOD_ID = "{{ cookiecutter.modId }}";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// Do stuff
	}
}
