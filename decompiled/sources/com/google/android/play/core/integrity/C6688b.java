package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C6688b extends ApiException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f39833a;

    C6688b(int i10, Throwable th) {
        super(new Status(i10, String.format(Locale.ROOT, "Standard Integrity API error (%d): %s.", Integer.valueOf(i10), U5.b.a(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f39833a = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f39833a;
    }
}
