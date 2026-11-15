package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.play.core.integrity.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C6687a extends ApiException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Throwable f39832a;

    C6687a(int i10, Throwable th) {
        super(new Status(i10, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i10), U5.a.a(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f39832a = th;
    }

    public int a() {
        return super.getStatusCode();
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f39832a;
    }
}
