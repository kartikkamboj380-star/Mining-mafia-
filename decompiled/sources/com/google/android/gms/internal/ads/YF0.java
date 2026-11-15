package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public class YF0 extends C2066Ly0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25576b;

    public YF0(C4454nA0 c4454nA0, int i10, int i11) {
        super(b(2008, 1));
        this.f25576b = 1;
    }

    public static YF0 a(IOException iOException, C4454nA0 c4454nA0, int i10) {
        int i11;
        String message = iOException.getMessage();
        if (iOException instanceof SocketTimeoutException) {
            i11 = 2002;
        } else if (iOException instanceof InterruptedIOException) {
            i11 = 1004;
        } else {
            i11 = (message == null || !AbstractC1483As0.a(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
        }
        return i11 == 2007 ? new C5723xF0(iOException, c4454nA0) : new YF0(iOException, c4454nA0, i11, i10);
    }

    private static int b(int i10, int i11) {
        if (i10 == 2000) {
            return i11 != 1 ? 2000 : 2001;
        }
        return i10;
    }

    public YF0(IOException iOException, C4454nA0 c4454nA0, int i10, int i11) {
        super(iOException, b(i10, i11));
        this.f25576b = i11;
    }

    public YF0(String str, C4454nA0 c4454nA0, int i10, int i11) {
        super(str, b(i10, i11));
        this.f25576b = i11;
    }

    public YF0(String str, IOException iOException, C4454nA0 c4454nA0, int i10, int i11) {
        super(str, iOException, b(i10, i11));
        this.f25576b = i11;
    }
}
