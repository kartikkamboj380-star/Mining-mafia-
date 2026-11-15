package com.google.android.gms.internal.ads;

import K4.AbstractC0786o0;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p60, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4698p60 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ApplicationInfo f32301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PackageInfo f32302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f32303c;

    C4698p60(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.f32301a = applicationInfo;
        this.f32302b = packageInfo;
        this.f32303c = context;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        String strValueOf;
        String installingPackageName;
        String initiatingPackageName;
        String str = this.f32301a.packageName;
        PackageInfo packageInfo = this.f32302b;
        String str2 = null;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        String str3 = packageInfo == null ? null : packageInfo.versionName;
        try {
            Context context = this.f32303c;
            HandlerC3644gj0 handlerC3644gj0 = K4.F0.f2598l;
            strValueOf = String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str));
        } catch (PackageManager.NameNotFoundException unused) {
            strValueOf = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.le)).booleanValue()) {
                try {
                    InstallSourceInfo installSourceInfo = this.f32303c.getPackageManager().getInstallSourceInfo(str);
                    if (installSourceInfo != null) {
                        installingPackageName = installSourceInfo.getInstallingPackageName();
                        try {
                            if (TextUtils.isEmpty(installingPackageName)) {
                                AbstractC0786o0.k("No installing package name found");
                                installingPackageName = null;
                            }
                            initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                            try {
                                if (TextUtils.isEmpty(initiatingPackageName)) {
                                    AbstractC0786o0.k("No initiating package name found");
                                    initiatingPackageName = str2;
                                }
                            } catch (PackageManager.NameNotFoundException e10) {
                                e = e10;
                                str2 = initiatingPackageName;
                                G4.t.l().j(e, "PackageInfoSignalSource.getInstallSourceInfo");
                            }
                        } catch (PackageManager.NameNotFoundException e11) {
                            e = e11;
                        }
                    } else {
                        installingPackageName = null;
                        initiatingPackageName = null;
                    }
                } catch (PackageManager.NameNotFoundException e12) {
                    e = e12;
                    installingPackageName = null;
                }
            } else {
                installingPackageName = null;
                initiatingPackageName = null;
            }
        } else {
            installingPackageName = null;
            initiatingPackageName = null;
        }
        return AbstractC5685wx0.a(new C4824q60(str, numValueOf, str3, strValueOf, installingPackageName, initiatingPackageName));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 29;
    }
}
