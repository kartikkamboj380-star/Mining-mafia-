package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes2.dex */
final class Z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f26066c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26068e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Y f26064a = new Y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Y f26065b = new Y();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f26067d = -9223372036854775807L;

    public final void a() {
        this.f26064a.a();
        this.f26065b.a();
        this.f26066c = false;
        this.f26067d = -9223372036854775807L;
        this.f26068e = 0;
    }

    public final void b(long j10) {
        this.f26064a.f(j10);
        if (this.f26064a.b()) {
            this.f26066c = false;
        } else if (this.f26067d != -9223372036854775807L) {
            if (!this.f26066c || this.f26065b.c()) {
                this.f26065b.a();
                this.f26065b.f(this.f26067d);
            }
            this.f26066c = true;
            this.f26065b.f(j10);
        }
        if (this.f26066c && this.f26065b.b()) {
            Y y9 = this.f26064a;
            this.f26064a = this.f26065b;
            this.f26065b = y9;
            this.f26066c = false;
        }
        this.f26067d = j10;
        this.f26068e = this.f26064a.b() ? 0 : this.f26068e + 1;
    }

    public final boolean c() {
        return this.f26064a.b();
    }

    public final int d() {
        return this.f26068e;
    }

    public final long e() {
        if (this.f26064a.b()) {
            return this.f26064a.d();
        }
        return -9223372036854775807L;
    }

    public final long f() {
        if (this.f26064a.b()) {
            return this.f26064a.e();
        }
        return -9223372036854775807L;
    }

    public final float g() {
        if (this.f26064a.b()) {
            return (float) (1.0E9d / this.f26064a.e());
        }
        return -1.0f;
    }
}
