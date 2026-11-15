package b9;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.net.Uri;
import app.notifee.core.Logger;
import com.google.common.util.concurrent.w;
import com.unity3d.ads.BuildConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Map f11662a;

    public class a extends K2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ w f11663a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f11664b;

        public a(w wVar, String str) {
            this.f11663a = wVar;
            this.f11664b = str;
        }

        @Override // p083i2.b
        public void e(p083i2.c cVar) {
            Logger.e("ResourceUtils", "Failed to load an image: " + this.f11664b, cVar.d());
            this.f11663a.C(null);
        }

        @Override // K2.b
        public void g(Bitmap bitmap) {
            this.f11663a.C(bitmap);
        }
    }

    public static int a(String str, String str2) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String strReplace = str.toLowerCase().replace("-", "_");
        String str3 = strReplace + "_" + str2;
        synchronized (s.class) {
            try {
                if (c().containsKey(str3)) {
                    return ((Integer) c().get(str3)).intValue();
                }
                Context context = f.f11648a;
                int identifier = context.getResources().getIdentifier(strReplace, str2, context.getPackageName());
                c().put(str3, Integer.valueOf(identifier));
                return identifier;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static com.google.common.util.concurrent.p b(String str) {
        Uri uriD;
        String string;
        w wVarG = w.G();
        if (str.contains("/")) {
            try {
                Uri uriD2 = Uri.parse(str);
                if (uriD2.getScheme() == null) {
                    uriD2 = d(str);
                }
                uriD = uriD2;
            } catch (Exception unused) {
                uriD = d(str);
            }
        } else {
            int iA = a(str, "mipmap");
            if (iA == 0) {
                iA = a(str, "drawable");
            }
            if (iA == 0) {
                string = null;
            } else {
                string = iA > 0 ? new Uri.Builder().scheme("res").path(String.valueOf(iA)).build().toString() : Uri.EMPTY.toString();
            }
            if (string == null) {
                wVarG.C(null);
                return wVarG;
            }
            try {
                uriD = Uri.parse(string);
                if (uriD.getScheme() == null) {
                    uriD = d(string);
                }
            } catch (Exception unused2) {
                uriD = d(string);
            }
        }
        U2.b bVarA = U2.c.x(uriD).a();
        if (!p123m2.d.c()) {
            Logger.w("ResourceUtils", "Fresco initializing natively by Notifee");
            p123m2.d.d(f.f11648a);
        }
        p123m2.d.a().k(bVarA, f.f11648a).e(new a(wVarG, str), W1.a.a());
        return wVarG;
    }

    public static Map c() {
        if (f11662a == null) {
            synchronized (s.class) {
                try {
                    if (f11662a == null) {
                        f11662a = new HashMap();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f11662a;
    }

    public static Uri d(String str) {
        int iA = a(str, "drawable");
        return iA > 0 ? new Uri.Builder().scheme("res").path(String.valueOf(iA)).build() : Uri.EMPTY;
    }

    public static Uri e(String str) {
        Context context = f.f11648a;
        if (str == null) {
            return null;
        }
        if (str.contains("://")) {
            return Uri.parse(str);
        }
        if (str.equalsIgnoreCase(BuildConfig.FLAVOR)) {
            return RingtoneManager.getDefaultUri(2);
        }
        int iA = a(str, "raw");
        if (iA == 0 && str.contains(".")) {
            iA = a(str.substring(0, str.lastIndexOf(46)), "raw");
        }
        if (iA == 0) {
            return null;
        }
        return Uri.parse("android.resource://" + context.getPackageName() + "/raw/" + str);
    }
}
