package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {
    private WeakReference<kq> kq;

    public void kq(kq kqVar) {
        this.kq = new WeakReference<>(kqVar);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("theme_status_change", 0);
        WeakReference<kq> weakReference = this.kq;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.kq.get().onThemeChanged(intExtra);
    }
}
