package p125m4;

/* JADX INFO: loaded from: classes2.dex */
final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Integer f46406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f46407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f46408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final g f46409d;

    a(Integer num, Object obj, f fVar, g gVar, e eVar) {
        this.f46406a = num;
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f46407b = obj;
        if (fVar == null) {
            throw new NullPointerException("Null priority");
        }
        this.f46408c = fVar;
        this.f46409d = gVar;
    }

    @Override // p125m4.d
    public Integer a() {
        return this.f46406a;
    }

    @Override // p125m4.d
    public e b() {
        return null;
    }

    @Override // p125m4.d
    public Object c() {
        return this.f46407b;
    }

    @Override // p125m4.d
    public f d() {
        return this.f46408c;
    }

    @Override // p125m4.d
    public g e() {
        return this.f46409d;
    }

    public boolean equals(Object obj) {
        g gVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            Integer num = this.f46406a;
            if (num != null ? num.equals(dVar.a()) : dVar.a() == null) {
                if (this.f46407b.equals(dVar.c()) && this.f46408c.equals(dVar.d()) && ((gVar = this.f46409d) != null ? gVar.equals(dVar.e()) : dVar.e() == null)) {
                    dVar.b();
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.f46406a;
        int iHashCode = ((((((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ this.f46407b.hashCode()) * 1000003) ^ this.f46408c.hashCode()) * 1000003;
        g gVar = this.f46409d;
        return (iHashCode ^ (gVar != null ? gVar.hashCode() : 0)) * 1000003;
    }

    public String toString() {
        return "Event{code=" + this.f46406a + ", payload=" + this.f46407b + ", priority=" + this.f46408c + ", productData=" + this.f46409d + ", eventContext=" + ((Object) null) + "}";
    }
}
