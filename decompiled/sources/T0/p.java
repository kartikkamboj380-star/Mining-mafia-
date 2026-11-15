package T0;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f5590a = androidx.work.q.i("PackageManagerHelper");

    public static void a(Context context, Class cls, boolean z9) {
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z9 ? 1 : 2, 1);
            androidx.work.q qVarE = androidx.work.q.e();
            String str = f5590a;
            StringBuilder sb = new StringBuilder();
            sb.append(cls.getName());
            sb.append(" ");
            sb.append(z9 ? "enabled" : "disabled");
            qVarE.a(str, sb.toString());
        } catch (Exception e10) {
            androidx.work.q qVarE2 = androidx.work.q.e();
            String str2 = f5590a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cls.getName());
            sb2.append("could not be ");
            sb2.append(z9 ? "enabled" : "disabled");
            qVarE2.b(str2, sb2.toString(), e10);
        }
    }
}
