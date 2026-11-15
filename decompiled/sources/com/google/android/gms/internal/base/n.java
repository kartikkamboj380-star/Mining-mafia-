package com.google.android.gms.internal.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes2.dex */
public abstract class n extends C.b {
    public static Intent p(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        if (m.a()) {
            return context.registerReceiver(broadcastReceiver, intentFilter, true != m.a() ? 0 : 2);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
