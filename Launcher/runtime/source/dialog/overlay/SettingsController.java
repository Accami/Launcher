package launcher.runtime.dialog.overlay;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import launcher.helper.IOHelper;
import launcher.runtime.dialog.DialogController;

public final class SettingsController extends OverlayController {
	private final DialogController dialog;

	public SettingsController(DialogController dialog) throws IOException {
		super(IOHelper.getResourceURL("launcher/runtime/dialog/overlay/settings/settings.fxml"));
		this.dialog = dialog;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	@Override
	public void reset() {
		// Doesn't need
	}
}
