package p089i8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import io.invertase.firebase.app.a;

/* JADX INFO: loaded from: classes3.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f45116a = new j();

    private Bundle c() {
        ApplicationInfo applicationInfo;
        try {
            Context contextA = a.a();
            PackageManager packageManager = contextA.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) == null) {
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static j d() {
        return f45116a;
    }

    public WritableMap a() {
        Bundle bundleC = c();
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (bundleC != null) {
            for (String str : bundleC.keySet()) {
                if (str.startsWith("rnfirebase_")) {
                    Object obj = bundleC.get(str);
                    if (obj == null) {
                        writableMapCreateMap.putNull(str);
                    } else if (obj instanceof String) {
                        writableMapCreateMap.putString(str, (String) obj);
                    } else if (obj instanceof Boolean) {
                        writableMapCreateMap.putBoolean(str, ((Boolean) obj).booleanValue());
                    }
                }
            }
        }
        return writableMapCreateMap;
    }

    public boolean b(String str, boolean z9) {
        Bundle bundleC = c();
        if (bundleC == null) {
            return z9;
        }
        return bundleC.getBoolean("rnfirebase_" + str, z9);
    }
}
