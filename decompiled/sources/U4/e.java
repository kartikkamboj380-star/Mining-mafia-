package U4;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6030b;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f6031a = "";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f6032b = "";

        public e a() {
            return new e(this, null);
        }

        public a b(String str) {
            this.f6032b = str;
            return this;
        }

        public a c(String str) {
            this.f6031a = str;
            return this;
        }

        final /* synthetic */ String d() {
            return this.f6031a;
        }

        final /* synthetic */ String e() {
            return this.f6032b;
        }
    }

    /* synthetic */ e(a aVar, byte[] bArr) {
        this.f6029a = aVar.d();
        this.f6030b = aVar.e();
    }

    public String a() {
        return this.f6030b;
    }

    public String b() {
        return this.f6029a;
    }
}
