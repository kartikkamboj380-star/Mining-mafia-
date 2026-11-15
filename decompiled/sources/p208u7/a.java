package p208u7;

import android.app.UiModeManager;
import android.content.Context;
import p158p7.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UiModeManager f49995a;

    public static g a() {
        UiModeManager uiModeManager = f49995a;
        if (uiModeManager == null) {
            return g.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? g.OTHER : g.CTV;
        }
        return g.MOBILE;
    }

    public static void b(Context context) {
        if (context != null) {
            f49995a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
