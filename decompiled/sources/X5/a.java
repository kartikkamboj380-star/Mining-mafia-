package X5;

/* JADX INFO: loaded from: classes2.dex */
final class a extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final a f6708a = new a();

    private a() {
    }

    static g e() {
        return f6708a;
    }

    @Override // X5.g
    public Object b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // X5.g
    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}
