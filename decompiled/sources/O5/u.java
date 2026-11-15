package O5;

import P5.AbstractC0925c;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p176r5.AbstractC7096m;
import p176r5.C7094k;

/* JADX INFO: loaded from: classes2.dex */
final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final P5.p f4544e = new P5.p("AppUpdateService");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Intent f4545f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    P5.A f4546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f4548c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final w f4549d;

    u(Context context, w wVar) {
        this.f4547b = context.getPackageName();
        this.f4548c = context;
        this.f4549d = wVar;
        if (AbstractC0925c.a(context)) {
            this.f4546a = new P5.A(P5.C.a(context), f4544e, "AppUpdateService", f4545f, q.f4535a, null);
        }
    }

    static /* bridge */ /* synthetic */ Bundle b(u uVar, String str) {
        Integer numValueOf;
        Bundle bundle = new Bundle();
        bundle.putAll(g());
        bundle.putString("package.name", str);
        try {
            numValueOf = Integer.valueOf(uVar.f4548c.getPackageManager().getPackageInfo(uVar.f4548c.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused) {
            f4544e.a("The current version of the app could not be retrieved", new Object[0]);
            numValueOf = null;
        }
        if (numValueOf != null) {
            bundle.putInt("app.version.code", numValueOf.intValue());
        }
        return bundle;
    }

    static /* bridge */ /* synthetic */ C0916a d(u uVar, Bundle bundle, String str) {
        int i10 = bundle.getInt("version.code", -1);
        int i11 = bundle.getInt("update.availability");
        int i12 = bundle.getInt("install.status", 0);
        Integer numValueOf = bundle.getInt("client.version.staleness", -1) == -1 ? null : Integer.valueOf(bundle.getInt("client.version.staleness"));
        int i13 = bundle.getInt("in.app.update.priority", 0);
        long j10 = bundle.getLong("bytes.downloaded");
        long j11 = bundle.getLong("total.bytes.to.download");
        long j12 = bundle.getLong("additional.size.required");
        long jA = uVar.f4549d.a();
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("blocking.intent");
        PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable("nonblocking.intent");
        PendingIntent pendingIntent3 = (PendingIntent) bundle.getParcelable("blocking.destructive.intent");
        PendingIntent pendingIntent4 = (PendingIntent) bundle.getParcelable("nonblocking.destructive.intent");
        HashMap map = new HashMap();
        map.put("blocking.destructive.intent", i(bundle.getIntegerArrayList("update.precondition.failures:blocking.destructive.intent")));
        map.put("nonblocking.destructive.intent", i(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.destructive.intent")));
        map.put("blocking.intent", i(bundle.getIntegerArrayList("update.precondition.failures:blocking.intent")));
        map.put("nonblocking.intent", i(bundle.getIntegerArrayList("update.precondition.failures:nonblocking.intent")));
        return C0916a.d(str, i10, i11, i12, numValueOf, i13, j10, j11, j12, jA, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4, map);
    }

    private static Bundle g() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map mapA = P5.n.a("app_update");
        bundle2.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
        if (mapA.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) mapA.get("native")).intValue());
        }
        if (mapA.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    private static Task h() {
        f4544e.a("onError(%d)", -9);
        return AbstractC7096m.e(new R5.a(-9));
    }

    private static HashSet i(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }

    public final Task c(String str) {
        if (this.f4546a == null) {
            return h();
        }
        f4544e.c("requestUpdateInfo(%s)", str);
        C7094k c7094k = new C7094k();
        this.f4546a.s(new r(this, c7094k, str, c7094k), c7094k);
        return c7094k.a();
    }
}
