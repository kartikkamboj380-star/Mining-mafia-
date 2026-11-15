package p039d8;

import T4.b;

/* JADX INFO: loaded from: classes3.dex */
public class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V7.a f43180b;

    public a(String str, V7.a aVar) {
        this.f43179a = str;
        this.f43180b = aVar;
    }

    @Override // T4.b
    public void a(String str) {
        this.f43180b.a(str);
    }

    @Override // T4.b
    public void b(T4.a aVar) {
        this.f43180b.b(this.f43179a, aVar.b(), aVar);
    }
}
