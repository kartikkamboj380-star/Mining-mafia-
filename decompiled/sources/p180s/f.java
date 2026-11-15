package p180s;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.List;
import p010b.a;
import p010b.b;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f48572a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f48573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f48574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ComponentName f48575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PendingIntent f48576e;

    f(b bVar, a aVar, ComponentName componentName, PendingIntent pendingIntent) {
        this.f48573b = bVar;
        this.f48574c = aVar;
        this.f48575d = componentName;
        this.f48576e = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.f48576e;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        a(bundle2);
        return bundle2;
    }

    private Bundle c(Uri uri) {
        Bundle bundle = new Bundle();
        if (uri != null) {
            bundle.putParcelable("target_origin", uri);
        }
        if (this.f48576e != null) {
            a(bundle);
        }
        if (bundle.isEmpty()) {
            return null;
        }
        return bundle;
    }

    IBinder d() {
        return this.f48574c.asBinder();
    }

    ComponentName e() {
        return this.f48575d;
    }

    PendingIntent f() {
        return this.f48576e;
    }

    public boolean g(Uri uri, Bundle bundle, List list) {
        try {
            return this.f48573b.C4(this.f48574c, uri, b(bundle), list);
        } catch (RemoteException unused) {
            return false;
        }
    }

    public int h(String str, Bundle bundle) {
        int iF1;
        Bundle bundleB = b(bundle);
        synchronized (this.f48572a) {
            try {
                try {
                    iF1 = this.f48573b.f1(this.f48574c, str, bundleB);
                } catch (RemoteException unused) {
                    return -2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iF1;
    }

    public boolean i(Uri uri) {
        return j(uri, null, new Bundle());
    }

    public boolean j(Uri uri, Uri uri2, Bundle bundle) {
        try {
            Bundle bundleC = c(uri2);
            if (bundleC == null) {
                return this.f48573b.j5(this.f48574c, uri);
            }
            bundle.putAll(bundleC);
            return this.f48573b.Z0(this.f48574c, uri, bundle);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
