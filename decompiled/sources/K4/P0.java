package K4;

import android.app.Activity;
import android.graphics.Rect;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.DisplayCutout;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC3892ii;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class P0 extends L0 {
    static final /* synthetic */ WindowInsets m(Activity activity, View view, WindowInsets windowInsets) {
        if (G4.t.l().r().zzu() == null) {
            DisplayCutout displayCutout = windowInsets.getDisplayCutout();
            String strConcat = "";
            if (displayCutout != null) {
                InterfaceC0790q0 interfaceC0790q0R = G4.t.l().r();
                for (Rect rect : displayCutout.getBoundingRects()) {
                    String str = String.format(Locale.US, "%d,%d,%d,%d", Integer.valueOf(rect.left), Integer.valueOf(rect.top), Integer.valueOf(rect.right), Integer.valueOf(rect.bottom));
                    if (!TextUtils.isEmpty(strConcat)) {
                        strConcat = strConcat.concat("|");
                    }
                    strConcat = strConcat.concat(str);
                }
                interfaceC0790q0R.b0(strConcat);
            } else {
                G4.t.l().r().b0("");
            }
        }
        n(false, activity);
        return view.onApplyWindowInsets(windowInsets);
    }

    private static final void n(boolean z9, Activity activity) {
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i10 = attributes.layoutInDisplayCutoutMode;
        int i11 = true != z9 ? 2 : 1;
        if (i11 != i10) {
            attributes.layoutInDisplayCutoutMode = i11;
            window.setAttributes(attributes);
        }
    }

    @Override // K4.R0
    public final void i(final Activity activity) {
        if (((Boolean) H4.B.c().d(AbstractC3892ii.f29621M1)).booleanValue() && G4.t.l().r().zzu() == null && !activity.isInMultiWindowMode()) {
            n(true, activity);
            activity.getWindow().getDecorView().setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(this) { // from class: K4.M0
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final /* synthetic */ WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    return P0.m(activity, view, windowInsets);
                }
            });
        }
    }

    @Override // K4.R0
    public final int j(AudioManager audioManager) {
        return audioManager.getStreamMinVolume(3);
    }
}
