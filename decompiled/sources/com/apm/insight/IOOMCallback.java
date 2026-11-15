package com.apm.insight;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface IOOMCallback {
    void onCrash(@NonNull CrashType crashType, Throwable th, Thread thread, long j10);
}
