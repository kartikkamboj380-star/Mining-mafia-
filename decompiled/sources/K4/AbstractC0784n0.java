package K4;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.AbstractC2471Tt;
import com.google.android.gms.internal.ads.AbstractC3643gj;

/* JADX INFO: renamed from: K4.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0784n0 {
    public static void a(Context context) {
        int i10 = L4.m.f3131g;
        if (((Boolean) AbstractC3643gj.f28718a.e()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || L4.m.i()) {
                    return;
                }
                com.google.common.util.concurrent.p pVarB = new C0764d0(context).b();
                int i11 = AbstractC0786o0.f2696b;
                L4.p.e("Updating ad debug logging enablement.");
                AbstractC2471Tt.a(pVarB, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e10) {
                L4.p.g("Fail to determine debug setting.", e10);
            }
        }
    }
}
