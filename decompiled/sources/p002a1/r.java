package p002a1;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Build;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes.dex */
public class r extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f7259a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f7260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static r f7261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Promise f7262d;

    public static void a(String str) {
        Promise promise = f7262d;
        if (promise != null) {
            promise.reject(str);
        }
        f7262d = null;
    }

    public static void b(Object obj) {
        Promise promise = f7262d;
        if (promise != null) {
            promise.resolve(obj);
        }
        f7262d = null;
    }

    public static IntentSender c(ReactContext reactContext) {
        synchronized (f7259a) {
            try {
                if (f7260b == null) {
                    f7260b = reactContext.getPackageName() + "/" + r.class.getName() + "_ACTION";
                }
                Context applicationContext = reactContext.getApplicationContext();
                r rVar = f7261c;
                if (rVar != null) {
                    applicationContext.unregisterReceiver(rVar);
                }
                f7261c = new r();
                if (Build.VERSION.SDK_INT < 34 || applicationContext.getApplicationInfo().targetSdkVersion < 34) {
                    applicationContext.registerReceiver(f7261c, new IntentFilter(f7260b));
                } else {
                    applicationContext.registerReceiver(f7261c, new IntentFilter(f7260b), 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Intent intent = new Intent(f7260b);
        intent.setPackage(reactContext.getPackageName());
        intent.setClass(reactContext.getApplicationContext(), r.class);
        intent.putExtra("receiver_token", f7261c.hashCode());
        return PendingIntent.getBroadcast(reactContext, 0, intent, 1409286144).getIntentSender();
    }

    public static boolean d() {
        return true;
    }

    public static void e(Promise promise) {
        f7262d = promise;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        synchronized (f7259a) {
            try {
                if (f7261c != this) {
                    return;
                }
                context.getApplicationContext().unregisterReceiver(f7261c);
                f7261c = null;
                if (intent.hasExtra("receiver_token") && intent.getIntExtra("receiver_token", 0) == hashCode()) {
                    ComponentName componentName = (ComponentName) intent.getParcelableExtra("android.intent.extra.CHOSEN_COMPONENT");
                    WritableMap writableMapCreateMap = Arguments.createMap();
                    writableMapCreateMap.putBoolean("success", true);
                    if (componentName != null) {
                        writableMapCreateMap.putString(PglCryptUtils.KEY_MESSAGE, componentName.flattenToString());
                    } else {
                        writableMapCreateMap.putString(PglCryptUtils.KEY_MESSAGE, "OK");
                    }
                    b(writableMapCreateMap);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
