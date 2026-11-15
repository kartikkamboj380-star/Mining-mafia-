package O5;

import android.content.Context;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends P5.o {
    public i(Context context) {
        super(new P5.p("AppUpdateListenerRegistry"), new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), context);
    }
}
