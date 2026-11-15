package com.google.android.gms.internal.ads;

import H4.C0654z;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p70, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C4700p70 implements InterfaceC3191d70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceExecutorServiceC1805Gx0 f32312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f32313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C4367mU f32314c;

    C4700p70(InterfaceExecutorServiceC1805Gx0 interfaceExecutorServiceC1805Gx0, Context context, C4367mU c4367mU) {
        this.f32312a = interfaceExecutorServiceC1805Gx0;
        this.f32313b = context;
        this.f32314c = c4367mU;
    }

    private static ResolveInfo b(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0107  */
    /* JADX WARN: Code duplicated, block: B:32:0x011a  */
    /* JADX WARN: Code duplicated, block: B:34:0x012c  */
    /* JADX WARN: Code duplicated, block: B:38:0x013e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0141  */
    /* JADX WARN: Code duplicated, block: B:49:0x018c A[EDGE_INSN: B:49:0x018c->B:50:0x018f BREAK  A[LOOP:1: B:43:0x015e->B:48:0x0187], PHI: r2
      0x018c: PHI (r2v9 java.lang.String) = (r2v8 java.lang.String), (r2v8 java.lang.String), (r2v10 java.lang.String) binds: [B:40:0x0159, B:41:0x015b, B:88:0x018c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:55:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:64:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:69:0x0202  */
    /* JADX WARN: Code duplicated, block: B:70:0x0205  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    final /* synthetic */ C4448n70 a() {
        ActivityInfo activityInfo;
        boolean z9;
        String string;
        String str;
        String string2;
        boolean zEquals;
        String language;
        String str2;
        String strA;
        Context context;
        List<ResolveInfo> listQueryIntentActivities;
        String str3;
        boolean z10;
        Bundle bundle;
        boolean z11;
        boolean z12;
        Context context2 = this.f32313b;
        PackageManager packageManager = context2.getPackageManager();
        Locale locale = Locale.getDefault();
        ResolveInfo resolveInfoB = b(packageManager, "geo:0,0?q=donuts");
        ResolveInfo resolveInfoB2 = b(packageManager, "http://www.google.com");
        String country = locale.getCountry();
        G4.t.g();
        C0654z.a();
        boolean zD = L4.g.D();
        boolean zIsLatchsky = DeviceProperties.isLatchsky(context2);
        boolean zIsSidewinder = DeviceProperties.isSidewinder(context2);
        String language2 = locale.getLanguage();
        ArrayList arrayList = new ArrayList();
        LocaleList localeList = LocaleList.getDefault();
        for (int i10 = 0; i10 < localeList.size(); i10++) {
            arrayList.add(localeList.get(i10).getLanguage());
        }
        ResolveInfo resolveInfoB3 = b(packageManager, "market://details?id=com.google.android.gms.ads");
        String string3 = null;
        if (resolveInfoB3 == null || (activityInfo = resolveInfoB3.activityInfo) == null) {
            string = null;
            z9 = true;
        } else {
            try {
                z9 = true;
                try {
                    PackageInfo packageInfo = Wrappers.packageManager(context2).getPackageInfo(activityInfo.packageName, 0);
                    if (packageInfo != null) {
                        int i11 = packageInfo.versionCode;
                        String str4 = activityInfo.packageName;
                        StringBuilder sb = new StringBuilder(String.valueOf(i11).length() + 1 + String.valueOf(str4).length());
                        sb.append(i11);
                        sb.append(".");
                        sb.append(str4);
                        string = sb.toString();
                    } else {
                        string = null;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            } catch (PackageManager.NameNotFoundException unused2) {
                z9 = true;
            }
        }
        try {
            PackageInfo packageInfo2 = Wrappers.packageManager(this.f32313b).getPackageInfo("com.android.vending", IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            if (packageInfo2 != null) {
                int i12 = packageInfo2.versionCode;
                String str5 = packageInfo2.packageName;
                str = string;
                try {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 1 + String.valueOf(str5).length());
                    sb2.append(i12);
                    sb2.append(".");
                    sb2.append(str5);
                    string2 = sb2.toString();
                } catch (Exception unused3) {
                    string2 = null;
                }
                zEquals = false;
                String str6 = Build.FINGERPRINT;
                language = Locale.getDefault().getLanguage();
                if (((Boolean) H4.B.c().d(AbstractC3892ii.Ve)).booleanValue()) {
                    K4.A0 a0Z = K4.F0.Z(this.f32313b);
                    String strB = a0Z.b();
                    strA = a0Z.a();
                    str2 = strB;
                } else {
                    if (((Boolean) H4.B.c().d(AbstractC3892ii.Ue)).booleanValue()) {
                        language = K4.F0.Z(this.f32313b).b();
                    }
                    str2 = language;
                    strA = null;
                }
                context = this.f32313b;
                if (packageManager == null) {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
                    ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
                    listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
                    if (listQueryIntentActivities == null || resolveInfoResolveActivity == null) {
                        str3 = string2;
                        zEquals = false;
                        break;
                    }
                    int i13 = 0;
                    while (true) {
                        if (i13 >= listQueryIntentActivities.size()) {
                            str3 = string2;
                            zEquals = false;
                            break;
                        }
                        str3 = string2;
                        if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i13).activityInfo.name)) {
                            zEquals = resolveInfoResolveActivity.activityInfo.packageName.equals(AbstractC5619wQ0.a(context));
                            break;
                        }
                        i13++;
                        string2 = str3;
                    }
                } else {
                    str3 = string2;
                }
                G4.t.g();
                long availableBytes = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
                if (((Boolean) H4.B.c().d(AbstractC3892ii.Pc)).booleanValue()) {
                    G4.t.g();
                    if (K4.F0.g(context)) {
                        z10 = z9;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (((Boolean) H4.B.c().d(AbstractC3892ii.Tc)).booleanValue()) {
                    try {
                        bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
                        if (bundle != null && bundle.containsKey("com.google.unity.ads.UNITY_VERSION")) {
                            string3 = bundle.getString("com.google.unity.ads.UNITY_VERSION");
                        }
                    } catch (PackageManager.NameNotFoundException unused4) {
                    }
                } else {
                    string3 = "";
                }
                String str7 = string3;
                if (resolveInfoB2 != null) {
                    z11 = z9;
                } else {
                    z11 = false;
                }
                if (resolveInfoB != null) {
                    z12 = z9;
                } else {
                    z12 = false;
                }
                return new C4448n70(z12, z11, country, zD, zIsLatchsky, zIsSidewinder, language2, arrayList, str, str3, str6, zEquals, Build.MODEL, availableBytes, z10, str7, Build.VERSION.SDK_INT, str2, strA, this.f32314c.a());
            }
            str = string;
        } catch (Exception unused5) {
        }
        string2 = null;
        zEquals = false;
        String str8 = Build.FINGERPRINT;
        language = Locale.getDefault().getLanguage();
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Ve)).booleanValue()) {
            K4.A0 a0Z2 = K4.F0.Z(this.f32313b);
            String strB2 = a0Z2.b();
            strA = a0Z2.a();
            str2 = strB2;
        } else {
            if (((Boolean) H4.B.c().d(AbstractC3892ii.Ue)).booleanValue()) {
                language = K4.F0.Z(this.f32313b).b();
            }
            str2 = language;
            strA = null;
        }
        context = this.f32313b;
        if (packageManager == null) {
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity2 = packageManager.resolveActivity(intent2, 0);
            listQueryIntentActivities = packageManager.queryIntentActivities(intent2, 65536);
            if (listQueryIntentActivities == null) {
                str3 = string2;
                zEquals = false;
                break;
            }
            str3 = string2;
            zEquals = false;
            break;
        }
        str3 = string2;
        G4.t.g();
        long availableBytes2 = new StatFs(Environment.getDataDirectory().getAbsolutePath()).getAvailableBytes() / 1024;
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Pc)).booleanValue()) {
            G4.t.g();
            if (K4.F0.g(context)) {
                z10 = z9;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (((Boolean) H4.B.c().d(AbstractC3892ii.Tc)).booleanValue()) {
            bundle = Wrappers.packageManager(context).getApplicationInfo(context.getPackageName(), IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT).metaData;
            if (bundle != null) {
                string3 = bundle.getString("com.google.unity.ads.UNITY_VERSION");
            }
        } else {
            string3 = "";
        }
        String str9 = string3;
        if (resolveInfoB2 != null) {
            z11 = z9;
        } else {
            z11 = false;
        }
        if (resolveInfoB != null) {
            z12 = z9;
        } else {
            z12 = false;
        }
        return new C4448n70(z12, z11, country, zD, zIsLatchsky, zIsSidewinder, language2, arrayList, str, str3, str8, zEquals, Build.MODEL, availableBytes2, z10, str9, Build.VERSION.SDK_INT, str2, strA, this.f32314c.a());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final com.google.common.util.concurrent.p zza() {
        return this.f32312a.e0(new Callable() { // from class: com.google.android.gms.internal.ads.o70
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.f31968a.a();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3191d70
    public final int zzb() {
        return 38;
    }
}
