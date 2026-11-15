package com.apm.insight;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface ICrashCallback {
    void onCrash(@NonNull CrashType crashType, String str, Thread thread);
}
