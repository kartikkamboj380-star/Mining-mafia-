package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
abstract class v {
    static void a(Throwable th) {
        X5.j.h(th);
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
