package p117l6;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46125a;

    M() {
    }

    private static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    synchronized String a(Context context) {
        try {
            if (this.f46125a == null) {
                this.f46125a = b(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return "".equals(this.f46125a) ? null : this.f46125a;
    }
}
