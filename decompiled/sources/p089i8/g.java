package p089i8;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p099j8.a;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static g f45107g = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ReactContext f45111d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f45113f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f45108a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f45109b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f45110c = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f45112e = Boolean.FALSE;

    private boolean g(a aVar) {
        ReactContext reactContext;
        if (this.f45112e.booleanValue() && (reactContext = this.f45111d) != null && reactContext.hasActiveCatalystInstance()) {
            try {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f45111d.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("rnfb_" + aVar.getEventName(), aVar.a());
                return true;
            } catch (Exception e10) {
                Log.wtf("RNFB_EMITTER", "Error sending Event " + aVar.getEventName(), e10);
            }
        }
        return false;
    }

    public static g i() {
        return f45107g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j(ReactContext reactContext) {
        this.f45111d = reactContext;
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(Boolean bool) {
        this.f45112e = bool;
        p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(a aVar) {
        synchronized (this.f45110c) {
            try {
                if (!this.f45110c.containsKey(aVar.getEventName()) || !g(aVar)) {
                    this.f45108a.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        synchronized (this.f45110c) {
            try {
                ArrayList arrayList = new ArrayList(this.f45108a);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    a aVar = (a) obj;
                    if (this.f45110c.containsKey(aVar.getEventName())) {
                        this.f45108a.remove(aVar);
                        o(aVar);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(String str) {
        synchronized (this.f45110c) {
            try {
                this.f45113f++;
                if (this.f45110c.containsKey(str)) {
                    this.f45110c.put(str, Integer.valueOf(((Integer) this.f45110c.get(str)).intValue() + 1));
                } else {
                    this.f45110c.put(str, 1);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f45109b.post(new Runnable() { // from class: i8.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f45104a.p();
            }
        });
    }

    public void f(final ReactContext reactContext) {
        this.f45109b.post(new Runnable() { // from class: i8.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f45102a.j(reactContext);
            }
        });
    }

    public WritableMap h() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap.putInt("listeners", this.f45113f);
        writableMapCreateMap.putInt("queued", this.f45108a.size());
        synchronized (this.f45110c) {
            try {
                for (Map.Entry entry : this.f45110c.entrySet()) {
                    writableMapCreateMap2.putInt((String) entry.getKey(), ((Integer) entry.getValue()).intValue());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        writableMapCreateMap.putMap("events", writableMapCreateMap2);
        return writableMapCreateMap;
    }

    public void m(final Boolean bool) {
        this.f45109b.post(new Runnable() { // from class: i8.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f45100a.k(bool);
            }
        });
    }

    public void n(String str, Boolean bool) {
        synchronized (this.f45110c) {
            try {
                if (this.f45110c.containsKey(str)) {
                    int iIntValue = ((Integer) this.f45110c.get(str)).intValue();
                    if (iIntValue <= 1 || bool.booleanValue()) {
                        this.f45110c.remove(str);
                    } else {
                        this.f45110c.put(str, Integer.valueOf(iIntValue - 1));
                    }
                    int i10 = this.f45113f;
                    if (!bool.booleanValue()) {
                        iIntValue = 1;
                    }
                    this.f45113f = i10 - iIntValue;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(final a aVar) {
        this.f45109b.post(new Runnable() { // from class: i8.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f45105a.l(aVar);
            }
        });
    }
}
