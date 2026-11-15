package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.Ki, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1982Ki {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p180s.f f20257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p180s.c f20258b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p180s.e f20259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC1930Ji f20260d;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i10 = 0; i10 < listQueryIntentActivities.size(); i10++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i10).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(AbstractC5619wQ0.a(context));
                    }
                }
            }
        }
        return false;
    }

    public final void b(Activity activity) {
        p180s.e eVar = this.f20259c;
        if (eVar == null) {
            return;
        }
        activity.unbindService(eVar);
        this.f20258b = null;
        this.f20257a = null;
        this.f20259c = null;
    }

    public final p180s.f c() {
        p180s.c cVar = this.f20258b;
        if (cVar == null) {
            this.f20257a = null;
        } else if (this.f20257a == null) {
            this.f20257a = cVar.e(null);
        }
        return this.f20257a;
    }

    public final void d(InterfaceC1930Ji interfaceC1930Ji) {
        this.f20260d = interfaceC1930Ji;
    }

    public final void e(Activity activity) {
        String strA;
        if (this.f20258b == null && (strA = AbstractC5619wQ0.a(activity)) != null) {
            C5745xQ0 c5745xQ0 = new C5745xQ0(this);
            this.f20259c = c5745xQ0;
            p180s.c.a(activity, strA, c5745xQ0);
        }
    }

    public final void f(p180s.c cVar) {
        this.f20258b = cVar;
        cVar.g(0L);
        InterfaceC1930Ji interfaceC1930Ji = this.f20260d;
        if (interfaceC1930Ji != null) {
            interfaceC1930Ji.zza();
        }
    }

    public final void g() {
        this.f20258b = null;
        this.f20257a = null;
    }
}
