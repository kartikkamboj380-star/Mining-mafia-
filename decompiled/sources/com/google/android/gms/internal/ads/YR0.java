package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class YR0 extends RuntimeException {
    public YR0(int i10) {
        super(i10 != 1 ? i10 != 2 ? "Detaching surface timed out." : "Setting foreground mode timed out." : "Player release timed out.");
    }
}
