package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
public final class PV0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f22117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f22119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22120d = 0;

    public final PV0 a(boolean z9) {
        this.f22117a = z9;
        return this;
    }

    public final PV0 b(boolean z9) {
        this.f22118b = z9;
        return this;
    }

    public final PV0 c(boolean z9) {
        this.f22119c = z9;
        return this;
    }

    public final PV0 d(int i10) {
        this.f22120d = i10;
        return this;
    }

    public final QV0 e() {
        if (this.f22117a || !(this.f22118b || this.f22119c)) {
            return new QV0(this, null);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }

    final /* synthetic */ boolean f() {
        return this.f22117a;
    }

    final /* synthetic */ boolean g() {
        return this.f22118b;
    }

    final /* synthetic */ boolean h() {
        return this.f22119c;
    }

    final /* synthetic */ int i() {
        return this.f22120d;
    }
}
