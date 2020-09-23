package cordova.plugin.first.plugin;

import android.app.AlertDialog;

import com.example.hello.R;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

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
            AlertDialog alertDialog = new AlertDialog.Builder(cordova.getContext())
                    .setTitle("这是标题")//标题
                    .setMessage("这是内容")//内容
                    .setIcon(R.mipmap.ic_launcher)//图标
                    .create();
            alertDialog.show();
            callbackContext.success(message);
        } else {
            callbackContext.error("Expected one non-empty string argument.");
        }
    }
}
