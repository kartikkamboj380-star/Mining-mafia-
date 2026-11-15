package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1150v {
    public ComponentCallbacksC1144o b(Context context, String str, Bundle bundle) {
        return ComponentCallbacksC1144o.instantiate(context, str, bundle);
    }

    public abstract View c(int i10);

    public abstract boolean d();
}
