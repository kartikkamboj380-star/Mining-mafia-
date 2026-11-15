package V7;

/* JADX INFO: loaded from: classes3.dex */
public class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.unity3d.scar.adapter.common.a f6134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private f f6135b;

    public d(com.unity3d.scar.adapter.common.a aVar, f fVar) {
        this(aVar, null, fVar);
    }

    @Override // V7.a
    public void a(String str) {
        this.f6135b.d(str);
        this.f6134a.b();
    }

    @Override // V7.a
    public void b(String str, String str2, Object obj) {
        this.f6135b.a(str, str2);
        this.f6134a.b();
    }

    public d(com.unity3d.scar.adapter.common.a aVar, g gVar, f fVar) {
        this.f6134a = aVar;
        this.f6135b = fVar;
    }
}
