package p117l6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;
import p087i6.f;

/* JADX INFO: renamed from: l6.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C7040a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f46133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f46135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f46136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46137e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f46138f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f46139g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f f46140h;

    public C7040a(String str, String str2, List list, String str3, String str4, String str5, String str6, f fVar) {
        this.f46133a = str;
        this.f46134b = str2;
        this.f46135c = list;
        this.f46136d = str3;
        this.f46137e = str4;
        this.f46138f = str5;
        this.f46139g = str6;
        this.f46140h = fVar;
    }

    public static C7040a a(Context context, K k10, String str, String str2, List list, f fVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strG = k10.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strB = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C7040a(str, str2, list, strG, packageName, strB, str3, fVar);
    }

    private static String b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
