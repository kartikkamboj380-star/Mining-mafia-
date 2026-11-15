package p002a1;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends n {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f7257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f7258g;

    public o(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.f7257f = null;
        this.f7258g = null;
    }

    @Override // p002a1.n
    public void l(ReadableMap readableMap) {
        String strI;
        System.out.println(h());
        if (h() != null || b() != null || i() != null) {
            if (n.k(h(), this.f7252a)) {
                System.out.println("INSTALLED");
                if (a() != null) {
                    f().setComponent(new ComponentName(h(), a()));
                } else {
                    f().setPackage(h());
                }
                super.l(readableMap);
                return;
            }
            System.out.println("NOT INSTALLED");
            if (b() != null) {
                strI = b().replace("{url}", n.o(readableMap.getString("url"))).replace("{message}", n.o(readableMap.getString(PglCryptUtils.KEY_MESSAGE)));
            } else {
                strI = i() != null ? i() : "";
            }
            n(new Intent(new Intent("android.intent.action.VIEW", Uri.parse(strI))));
        }
        super.l(readableMap);
    }

    @Override // p002a1.n
    protected void m() {
        p(null);
    }

    protected void p(ReadableMap readableMap) {
        if (!this.f7256e.hasKey("forceDialog") || !this.f7256e.getBoolean("forceDialog")) {
            f().addFlags(268435456);
            this.f7252a.startActivity(f());
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putBoolean("success", true);
            writableMapCreateMap.putString(PglCryptUtils.KEY_MESSAGE, f().getPackage());
            r.b(writableMapCreateMap);
            return;
        }
        Activity currentActivity = this.f7252a.getCurrentActivity();
        if (currentActivity == null) {
            r.a("Something went wrong");
            return;
        }
        if (readableMap != null && !n.j("social", readableMap)) {
            throw new IllegalArgumentException("social is empty");
        }
        if (r.d()) {
            Intent intentCreateChooser = Intent.createChooser(f(), this.f7254c, r.c(this.f7252a));
            intentCreateChooser.addFlags(1073741824);
            currentActivity.startActivityForResult(intentCreateChooser, 16845);
            return;
        }
        Intent intentCreateChooser2 = Intent.createChooser(f(), this.f7254c);
        intentCreateChooser2.addFlags(1073741824);
        currentActivity.startActivityForResult(intentCreateChooser2, 16845);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        writableMapCreateMap2.putBoolean("success", true);
        writableMapCreateMap2.putString(PglCryptUtils.KEY_MESSAGE, "OK");
        r.b(writableMapCreateMap2);
    }
}
