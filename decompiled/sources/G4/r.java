package G4;

import H4.h2;
import K4.AbstractC0763d;
import K4.AbstractC0786o0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.AbstractC2553Vi;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f979c = new TreeMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f982f;

    public r(Context context, String str) {
        String strConcat;
        this.f977a = context.getApplicationContext();
        this.f978b = str;
        String packageName = context.getPackageName();
        try {
            String str2 = Wrappers.packageManager(context).getPackageInfo(context.getPackageName(), 0).versionName;
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 1 + String.valueOf(str2).length());
            sb.append(packageName);
            sb.append("-");
            sb.append(str2);
            strConcat = sb.toString();
        } catch (PackageManager.NameNotFoundException e10) {
            int i10 = AbstractC0786o0.f2696b;
            L4.p.d("Unable to get package version name for reporting", e10);
            strConcat = String.valueOf(packageName).concat("-missing");
        }
        this.f982f = strConcat;
    }

    public final String a() {
        return this.f981e;
    }

    public final String b() {
        return this.f980d;
    }

    public final String c() {
        return this.f978b;
    }

    public final String d() {
        return this.f982f;
    }

    public final Map e() {
        return this.f979c;
    }

    public final void f(h2 h2Var, L4.a aVar) {
        this.f980d = h2Var.f1300j.f1248a;
        Bundle bundle = h2Var.f1303m;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String str = (String) AbstractC2553Vi.f24351c.e();
        for (String str2 : bundle2.keySet()) {
            if (str.equals(str2)) {
                this.f981e = bundle2.getString(str2);
            } else if (str2.startsWith("csa_")) {
                this.f979c.put(str2.substring(4), bundle2.getString(str2));
            }
        }
        Map map = this.f979c;
        map.put("SDKVersion", aVar.f3097a);
        if (((Boolean) AbstractC2553Vi.f24349a.e()).booleanValue()) {
            Bundle bundleB = AbstractC0763d.b(this.f977a, (String) AbstractC2553Vi.f24350b.e());
            for (String str3 : bundleB.keySet()) {
                map.put(str3, bundleB.get(str3).toString());
            }
        }
    }
}
