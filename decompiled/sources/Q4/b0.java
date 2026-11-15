package Q4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Base64;
import android.webkit.WebView;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.internal.ads.AbstractC1903Iu0;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import com.google.android.gms.internal.ads.AbstractC4775pj;
import com.google.android.gms.internal.ads.C2395Sh;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f4900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ApplicationInfo f4901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f4902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L4.a f4903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONObject f4904e = new JSONObject();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f4905f = new AtomicBoolean(false);

    b0(Context context, C2395Sh c2395Sh, List list, L4.a aVar) {
        this.f4900a = context;
        this.f4901b = context.getApplicationInfo();
        this.f4902c = list;
        this.f4903d = aVar;
    }

    public final void a(WebView webView) {
        if (this.f4905f.getAndSet(true)) {
            return;
        }
        PackageInfo packageInfo = null;
        try {
            ApplicationInfo applicationInfo = this.f4901b;
            if (applicationInfo != null) {
                packageInfo = Wrappers.packageManager(this.f4900a).getPackageInfo(applicationInfo.packageName, 0);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo != null) {
            try {
                JSONObject jSONObject = this.f4904e;
                jSONObject.put("vc", packageInfo.versionCode);
                jSONObject.put("vnm", packageInfo.versionName);
            } catch (JSONException e10) {
                G4.t.l().j(e10, "PawAppSignalGenerator.initialize");
            }
        }
        ApplicationInfo applicationInfo2 = this.f4901b;
        if (applicationInfo2 != null) {
            this.f4904e.put("pn", applicationInfo2.packageName);
        }
        JSONObject jSONObject2 = this.f4904e;
        List list = this.f4902c;
        ArrayList arrayList = new ArrayList();
        for (String str : ((String) H4.B.c().d(AbstractC3892ii.mb)).split(",", -1)) {
            if (list.contains(str)) {
                arrayList.add(str);
            }
        }
        jSONObject2.put("eid", arrayList);
        jSONObject2.put("js", this.f4903d.f3097a);
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject2.get(next);
            if (obj != null) {
                jSONObject2.put(next, Base64.encodeToString(obj.toString().getBytes(), 2));
            }
        }
        if (((Boolean) AbstractC4775pj.f32462b.e()).booleanValue() && I0.j.a("DOCUMENT_START_SCRIPT") && webView != null) {
            I0.i.a(webView, String.format(Locale.getDefault(), (String) H4.B.c().d(AbstractC3892ii.lb), b()), AbstractC1903Iu0.l("*"));
        }
    }

    public final JSONObject b() {
        if (!this.f4905f.get()) {
            a(null);
        }
        return this.f4904e;
    }
}
