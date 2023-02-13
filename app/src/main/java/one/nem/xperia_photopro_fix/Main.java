package one.nem.xperia_photopro_fix;

import static de.robv.android.xposed.XposedHelpers.findAndHookMethod;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.XC_MethodReplacement;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;

public class Main implements IXposedHookLoadPackage {
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        if (lpparam.packageName.equals("com.sonymobile.photopro")) {
            XposedBridge.log("LogPoint1: " + lpparam.packageName);
            findAndHookMethod("com.sonymobile.photopro.idd.core.IddManager", lpparam.classLoader, "addAppData", "com.sonymobile.photopro.idd.core.IddEvent", XC_MethodReplacement.returnConstant(null));
        }
        else{
            XposedBridge.log("LogPoint3: " + lpparam.packageName);
        }
    }
}
