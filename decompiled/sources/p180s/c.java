package p180s;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import p010b.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f48518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ComponentName f48519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f48520c;

    class a extends p010b.a.AbstractBinderC0188a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f48521a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p180s.b f48522b;

        /* JADX INFO: renamed from: s.c$a$a, reason: collision with other inner class name */
        class RunnableC0527a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f48524a;

            RunnableC0527a(Bundle bundle) {
                this.f48524a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f48522b.j(this.f48524a);
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f48526a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f48527b;

            b(int i10, Bundle bundle) {
                this.f48526a = i10;
                this.f48527b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f48522b.g(this.f48526a, this.f48527b);
            }
        }

        /* JADX INFO: renamed from: s.c$a$c, reason: collision with other inner class name */
        class RunnableC0528c implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f48529a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f48530b;

            RunnableC0528c(String str, Bundle bundle) {
                this.f48529a = str;
                this.f48530b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f48522b.a(this.f48529a, this.f48530b);
            }
        }

        class d implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f48532a;

            d(Bundle bundle) {
                this.f48532a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f48522b.e(this.f48532a);
            }
        }

        class e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f48534a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Bundle f48535b;

            e(String str, Bundle bundle) {
                this.f48534a = str;
                this.f48535b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f48522b.h(this.f48534a, this.f48535b);
            }
        }

        class f implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f48537a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Uri f48538b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f48539c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Bundle f48540d;

            f(int i10, Uri uri, boolean z9, Bundle bundle) {
                this.f48537a = i10;
                this.f48538b = uri;
                this.f48539c = z9;
                this.f48540d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f48522b.i(this.f48537a, this.f48538b, this.f48539c, this.f48540d);
            }
        }

        class g implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f48542a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f48543b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Bundle f48544c;

            g(int i10, int i11, Bundle bundle) {
                this.f48542a = i10;
                this.f48543b = i11;
                this.f48544c = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f48522b.d(this.f48542a, this.f48543b, this.f48544c);
            }
        }

        class h implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f48546a;

            h(Bundle bundle) {
                this.f48546a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f48522b.k(this.f48546a);
            }
        }

        class i implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f48548a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f48549b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f48550c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f48551d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ int f48552e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ Bundle f48553f;

            i(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
                this.f48548a = i10;
                this.f48549b = i11;
                this.f48550c = i12;
                this.f48551d = i13;
                this.f48552e = i14;
                this.f48553f = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f48522b.c(this.f48548a, this.f48549b, this.f48550c, this.f48551d, this.f48552e, this.f48553f);
            }
        }

        class j implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Bundle f48555a;

            j(Bundle bundle) {
                this.f48555a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f48522b.f(this.f48555a);
            }
        }

        a(p180s.b bVar) {
            this.f48522b = bVar;
        }

        @Override // p010b.a
        public Bundle M1(String str, Bundle bundle) {
            p180s.b bVar = this.f48522b;
            if (bVar == null) {
                return null;
            }
            return bVar.b(str, bundle);
        }

        @Override // p010b.a
        public void O2(String str, Bundle bundle) {
            if (this.f48522b == null) {
                return;
            }
            this.f48521a.post(new RunnableC0528c(str, bundle));
        }

        @Override // p010b.a
        public void P5(int i10, Bundle bundle) {
            if (this.f48522b == null) {
                return;
            }
            this.f48521a.post(new b(i10, bundle));
        }

        @Override // p010b.a
        public void X4(Bundle bundle) {
            if (this.f48522b == null) {
                return;
            }
            this.f48521a.post(new j(bundle));
        }

        @Override // p010b.a
        public void a3(Bundle bundle) {
            if (this.f48522b == null) {
                return;
            }
            this.f48521a.post(new h(bundle));
        }

        @Override // p010b.a
        public void d5(Bundle bundle) {
            if (this.f48522b == null) {
                return;
            }
            this.f48521a.post(new RunnableC0527a(bundle));
        }

        @Override // p010b.a
        public void f6(String str, Bundle bundle) {
            if (this.f48522b == null) {
                return;
            }
            this.f48521a.post(new e(str, bundle));
        }

        @Override // p010b.a
        public void k1(int i10, int i11, int i12, int i13, int i14, Bundle bundle) {
            if (this.f48522b == null) {
                return;
            }
            this.f48521a.post(new i(i10, i11, i12, i13, i14, bundle));
        }

        @Override // p010b.a
        public void k6(Bundle bundle) {
            if (this.f48522b == null) {
                return;
            }
            this.f48521a.post(new d(bundle));
        }

        @Override // p010b.a
        public void l5(int i10, int i11, Bundle bundle) {
            if (this.f48522b == null) {
                return;
            }
            this.f48521a.post(new g(i10, i11, bundle));
        }

        @Override // p010b.a
        public void n6(int i10, Uri uri, boolean z9, Bundle bundle) {
            if (this.f48522b == null) {
                return;
            }
            this.f48521a.post(new f(i10, uri, z9, bundle));
        }
    }

    c(b bVar, ComponentName componentName, Context context) {
        this.f48518a = bVar;
        this.f48519b = componentName;
        this.f48520c = context;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.b(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Service Intents must be explicit");
        }
        intent.setPackage(str);
        return context.bindService(intent, eVar, 33);
    }

    private p010b.a.AbstractBinderC0188a b(b bVar) {
        return new a(bVar);
    }

    public static String c(Context context, List list) {
        return d(context, list, false);
    }

    public static String d(Context context, List list, boolean z9) {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = context.getPackageManager();
        List<String> arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z9 && (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveInfoResolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT < 30) {
            return null;
        }
        Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
        return null;
    }

    private f f(b bVar, PendingIntent pendingIntent) {
        boolean zC5;
        p010b.a.AbstractBinderC0188a abstractBinderC0188aB = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                zC5 = this.f48518a.X2(abstractBinderC0188aB, bundle);
            } else {
                zC5 = this.f48518a.c5(abstractBinderC0188aB);
            }
            if (zC5) {
                return new f(this.f48518a, abstractBinderC0188aB, this.f48519b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f e(b bVar) {
        return f(bVar, null);
    }

    public boolean g(long j10) {
        try {
            return this.f48518a.S4(j10);
        } catch (RemoteException unused) {
            return false;
        }
    }
}
