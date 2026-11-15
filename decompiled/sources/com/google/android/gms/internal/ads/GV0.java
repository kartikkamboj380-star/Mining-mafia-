package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class GV0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f19058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f19059b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f19060c;

    public final GV0 a(boolean z9) {
        this.f19058a = z9;
        return this;
    }

    public final GV0 b(boolean z9) {
        this.f19059b = z9;
        return this;
    }

    public final GV0 c(boolean z9) {
        this.f19060c = z9;
        return this;
    }

    public final HV0 d() {
        if (this.f19058a || !(this.f19059b || this.f19060c)) {
            return new HV0(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    final /* synthetic */ boolean e() {
        return this.f19058a;
    }

    final /* synthetic */ boolean f() {
        return this.f19059b;
    }

    final /* synthetic */ boolean g() {
        return this.f19060c;
    }
}
