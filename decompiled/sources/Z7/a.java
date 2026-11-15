package Z7;

/* JADX INFO: loaded from: classes3.dex */
public class a extends T4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V7.a f7171b;

    public a(String str, V7.a aVar) {
        this.f7170a = str;
        this.f7171b = aVar;
    }

    @Override // T4.b
    public void a(String str) {
        this.f7171b.a(str);
    }

    @Override // T4.b
    public void b(T4.a aVar) {
        this.f7171b.b(this.f7170a, aVar.b(), aVar);
    }
}
