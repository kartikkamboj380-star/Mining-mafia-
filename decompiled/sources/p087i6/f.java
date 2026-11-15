package p087i6;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import p117l6.AbstractC7048i;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f45085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f45086b = null;

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f45087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f45088b;

        private b() {
            int iP = AbstractC7048i.p(f.this.f45085a, "com.google.firebase.crashlytics.unity_version", "string");
            if (iP == 0) {
                if (!f.this.c("flutter_assets/NOTICES.Z")) {
                    this.f45087a = null;
                    this.f45088b = null;
                    return;
                } else {
                    this.f45087a = "Flutter";
                    this.f45088b = null;
                    g.f().i("Development platform is: Flutter");
                    return;
                }
            }
            this.f45087a = "Unity";
            String string = f.this.f45085a.getResources().getString(iP);
            this.f45088b = string;
            g.f().i("Unity Editor version is: " + string);
        }
    }

    public f(Context context) {
        this.f45085a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c(String str) {
        if (this.f45085a.getAssets() == null) {
            return false;
        }
        try {
            InputStream inputStreamOpen = this.f45085a.getAssets().open(str);
            if (inputStreamOpen != null) {
                inputStreamOpen.close();
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private b f() {
        if (this.f45086b == null) {
            this.f45086b = new b();
        }
        return this.f45086b;
    }

    public static boolean g(Context context) {
        return AbstractC7048i.p(context, "com.google.firebase.crashlytics.unity_version", "string") != 0;
    }

    public String d() {
        return f().f45087a;
    }

    public String e() {
        return f().f45088b;
    }
}
