package p248y7;

import android.app.UiModeManager;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.learnium.RNDeviceInfo.a;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f50805a;

    public b(Context context) {
        this.f50805a = context;
    }

    private a b() {
        WindowManager windowManager = (WindowManager) this.f50805a.getSystemService("window");
        if (windowManager == null) {
            return a.UNKNOWN;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        double dSqrt = Math.sqrt(Math.pow(((double) displayMetrics.widthPixels) / ((double) displayMetrics.xdpi), 2.0d) + Math.pow(((double) displayMetrics.heightPixels) / ((double) displayMetrics.ydpi), 2.0d));
        if (dSqrt < 3.0d || dSqrt > 6.9d) {
            return (dSqrt <= 6.9d || dSqrt > 18.0d) ? a.UNKNOWN : a.TABLET;
        }
        return a.HANDSET;
    }

    private a c() {
        int i10 = this.f50805a.getResources().getConfiguration().smallestScreenWidthDp;
        if (i10 == 0) {
            return a.UNKNOWN;
        }
        return i10 >= 600 ? a.TABLET : a.HANDSET;
    }

    public a a() {
        if (this.f50805a.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            return a.TV;
        }
        UiModeManager uiModeManager = (UiModeManager) this.f50805a.getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return a.TV;
        }
        a aVarC = c();
        return (aVarC == null || aVarC == a.UNKNOWN) ? b() : aVarC;
    }

    public boolean d() {
        return a() == a.TABLET;
    }
}
