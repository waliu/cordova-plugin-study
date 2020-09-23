package cordova.plugin.first.plugin;

import android.app.AlertDialog;
import android.content.Intent;

import com.example.hello.R;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import cordova.plugin.first.plugin.activity.FirstActivity;

/**
 * This class echoes a string called from JavaScript.
 */
public class FirstPlugin extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("testFirstPlugin")) {
            String message = args.getString(0);
            this.testFirstPlugin(message, callbackContext);
            return true;
        }
        return false;
    }

    private void testFirstPlugin(String message, CallbackContext callbackContext) {
        if (message != null && message.length() > 0) {
            Intent intent = new Intent(this.cordova.getActivity(), FirstActivity.class);
            this.cordova.startActivityForResult(this, intent, 0);
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
