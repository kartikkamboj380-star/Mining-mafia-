package com.google.android.gms.internal.ads;

import android.app.UiModeManager;
import android.content.Context;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.bh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3012bh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UiModeManager f26894a;

    public static void a(Context context) {
        if (context != null) {
            f26894a = (UiModeManager) context.getSystemService("uimode");
        }
    }

    public static EnumC4518ng0 b() {
        UiModeManager uiModeManager = f26894a;
        if (uiModeManager == null) {
            return EnumC4518ng0.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        if (currentModeType != 1) {
            return currentModeType != 4 ? EnumC4518ng0.OTHER : EnumC4518ng0.CTV;
        }
        return EnumC4518ng0.MOBILE;
    }
}
