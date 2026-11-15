package com.google.android.gms.common;

/* JADX INFO: loaded from: classes2.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f17187a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Boolean f17188b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Boolean f17189c = null;

    /* synthetic */ v(byte[] bArr) {
    }

    final v a(String str) {
        this.f17187a = str;
        return this;
    }

    final v b(boolean z9) {
        this.f17188b = Boolean.valueOf(z9);
        return this;
    }

    final v c(boolean z9) {
        this.f17189c = Boolean.valueOf(z9);
        return this;
    }

    final w d() {
        Boolean bool = this.f17188b;
        if (bool == null) {
            throw new IllegalStateException("allowTestKeys must be set");
        }
        if (this.f17189c != null) {
            return new w(this.f17187a, bool.booleanValue(), false, false, this.f17189c.booleanValue(), false, null);
        }
        throw new IllegalStateException("isGoogleOrPlatformOnly must be set");
    }
}
