package p109k8;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;

/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static l f45711a = new l();

    private Bundle b() {
        ApplicationInfo applicationInfo;
        try {
            Context contextA = d.a();
            PackageManager packageManager = contextA.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(contextA.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT)) == null) {
                return null;
            }
            return applicationInfo.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static l c() {
        return f45711a;
    }

    public WritableMap a() {
        Bundle bundleB = b();
        WritableMap writableMapCreateMap = Arguments.createMap();
        if (bundleB != null) {
            for (String str : bundleB.keySet()) {
                if (str.startsWith("rngooglemobileads")) {
                    Object obj = bundleB.get(str);
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
}
