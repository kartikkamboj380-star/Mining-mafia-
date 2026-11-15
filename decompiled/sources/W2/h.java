package W2;

/* JADX INFO: loaded from: classes.dex */
public class h implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f6561a;

    public h(int i10) {
        this.f6561a = i10;
    }

    @Override // W2.d
    public c createImageTranscoder(D2.c cVar, boolean z9) {
        return new g(z9, this.f6561a);
    }
}
