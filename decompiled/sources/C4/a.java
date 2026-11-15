package C4;

import com.google.android.gms.ads.AdRequest;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends AdRequest {
    /* synthetic */ a(C0013a c0013a, byte[] bArr) {
        super(c0013a);
    }

    /* JADX INFO: renamed from: C4.a$a, reason: collision with other inner class name */
    public static final class C0013a extends com.google.android.gms.ads.a {
        public C0013a n(String str) {
            this.f16811a.r(str);
            return this;
        }

        public a o() {
            return new a(this, null);
        }

        public C0013a p(String str) {
            this.f16811a.n(str);
            return this;
        }

        @Override // com.google.android.gms.ads.a
        public final /* bridge */ /* synthetic */ com.google.android.gms.ads.a e() {
            return this;
        }
    }
}
