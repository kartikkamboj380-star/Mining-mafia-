package C6;

import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
class i implements p257z6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f409a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f410b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p257z6.c f411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f412d;

    i(f fVar) {
        this.f412d = fVar;
    }

    private void b() {
        if (this.f409a) {
            throw new p257z6.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f409a = true;
    }

    @Override // p257z6.g
    public p257z6.g a(String str) throws IOException {
        b();
        this.f412d.o(this.f411c, str, this.f410b);
        return this;
    }

    void c(p257z6.c cVar, boolean z9) {
        this.f409a = false;
        this.f411c = cVar;
        this.f410b = z9;
    }

    @Override // p257z6.g
    public p257z6.g g(boolean z9) {
        b();
        this.f412d.l(this.f411c, z9, this.f410b);
        return this;
    }
}
