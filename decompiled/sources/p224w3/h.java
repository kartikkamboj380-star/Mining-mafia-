package p224w3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f50271a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f50272b = new h();

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private h() {
    }

    @Override // p224w3.g
    public boolean a() {
        return false;
    }

    @Override // p224w3.g
    public int b() {
        throw new IllegalStateException("Should not retrieve delay as canRetry is: " + a());
    }

    @Override // p224w3.g
    public g c() {
        throw new IllegalStateException("Should not update as canRetry is: " + a());
    }

    @Override // p224w3.g
    public g copy() {
        return this;
    }
}
