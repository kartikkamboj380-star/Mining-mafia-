package O;

import android.content.ClipData;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: renamed from: O.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0846d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f3815a;

    /* JADX INFO: renamed from: O.d$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f3816a;

        public a(ClipData clipData, int i10) {
            if (Build.VERSION.SDK_INT >= 31) {
                this.f3816a = new b(clipData, i10);
            } else {
                this.f3816a = new C0067d(clipData, i10);
            }
        }

        public C0846d a() {
            return this.f3816a.build();
        }

        public a b(Bundle bundle) {
            this.f3816a.setExtras(bundle);
            return this;
        }

        public a c(int i10) {
            this.f3816a.b(i10);
            return this;
        }

        public a d(Uri uri) {
            this.f3816a.a(uri);
            return this;
        }
    }

    /* JADX INFO: renamed from: O.d$b */
    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo.Builder f3817a;

        b(ClipData clipData, int i10) {
            this.f3817a = AbstractC0852g.a(clipData, i10);
        }

        @Override // O.C0846d.c
        public void a(Uri uri) {
            this.f3817a.setLinkUri(uri);
        }

        @Override // O.C0846d.c
        public void b(int i10) {
            this.f3817a.setFlags(i10);
        }

        @Override // O.C0846d.c
        public C0846d build() {
            return new C0846d(new e(this.f3817a.build()));
        }

        @Override // O.C0846d.c
        public void setExtras(Bundle bundle) {
            this.f3817a.setExtras(bundle);
        }
    }

    /* JADX INFO: renamed from: O.d$c */
    private interface c {
        void a(Uri uri);

        void b(int i10);

        C0846d build();

        void setExtras(Bundle bundle);
    }

    /* JADX INFO: renamed from: O.d$d, reason: collision with other inner class name */
    private static final class C0067d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ClipData f3818a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f3819b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f3820c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Uri f3821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Bundle f3822e;

        C0067d(ClipData clipData, int i10) {
            this.f3818a = clipData;
            this.f3819b = i10;
        }

        @Override // O.C0846d.c
        public void a(Uri uri) {
            this.f3821d = uri;
        }

        @Override // O.C0846d.c
        public void b(int i10) {
            this.f3820c = i10;
        }

        @Override // O.C0846d.c
        public C0846d build() {
            return new C0846d(new g(this));
        }

        @Override // O.C0846d.c
        public void setExtras(Bundle bundle) {
            this.f3822e = bundle;
        }
    }

    /* JADX INFO: renamed from: O.d$e */
    private static final class e implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ContentInfo f3823a;

        e(ContentInfo contentInfo) {
            this.f3823a = AbstractC0844c.a(N.f.g(contentInfo));
        }

        @Override // O.C0846d.f
        public int a() {
            return this.f3823a.getSource();
        }

        @Override // O.C0846d.f
        public ContentInfo b() {
            return this.f3823a;
        }

        @Override // O.C0846d.f
        public ClipData c() {
            return this.f3823a.getClip();
        }

        @Override // O.C0846d.f
        public int d() {
            return this.f3823a.getFlags();
        }

        public String toString() {
            return "ContentInfoCompat{" + this.f3823a + "}";
        }
    }

    /* JADX INFO: renamed from: O.d$f */
    private interface f {
        int a();

        ContentInfo b();

        ClipData c();

        int d();
    }

    /* JADX INFO: renamed from: O.d$g */
    private static final class g implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClipData f3824a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3825b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3826c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Uri f3827d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Bundle f3828e;

        g(C0067d c0067d) {
            this.f3824a = (ClipData) N.f.g(c0067d.f3818a);
            this.f3825b = N.f.c(c0067d.f3819b, 0, 5, "source");
            this.f3826c = N.f.f(c0067d.f3820c, 1);
            this.f3827d = c0067d.f3821d;
            this.f3828e = c0067d.f3822e;
        }

        @Override // O.C0846d.f
        public int a() {
            return this.f3825b;
        }

        @Override // O.C0846d.f
        public ContentInfo b() {
            return null;
        }

        @Override // O.C0846d.f
        public ClipData c() {
            return this.f3824a;
        }

        @Override // O.C0846d.f
        public int d() {
            return this.f3826c;
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("ContentInfoCompat{clip=");
            sb.append(this.f3824a.getDescription());
            sb.append(", source=");
            sb.append(C0846d.e(this.f3825b));
            sb.append(", flags=");
            sb.append(C0846d.a(this.f3826c));
            if (this.f3827d == null) {
                str = "";
            } else {
                str = ", hasLinkUri(" + this.f3827d.toString().length() + ")";
            }
            sb.append(str);
            sb.append(this.f3828e != null ? ", hasExtras" : "");
            sb.append("}");
            return sb.toString();
        }
    }

    C0846d(f fVar) {
        this.f3815a = fVar;
    }

    static String a(int i10) {
        return (i10 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i10);
    }

    static String e(int i10) {
        if (i10 == 0) {
            return "SOURCE_APP";
        }
        if (i10 == 1) {
            return "SOURCE_CLIPBOARD";
        }
        if (i10 == 2) {
            return "SOURCE_INPUT_METHOD";
        }
        if (i10 == 3) {
            return "SOURCE_DRAG_AND_DROP";
        }
        if (i10 != 4) {
            return i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT";
        }
        return "SOURCE_AUTOFILL";
    }

    public static C0846d g(ContentInfo contentInfo) {
        return new C0846d(new e(contentInfo));
    }

    public ClipData b() {
        return this.f3815a.c();
    }

    public int c() {
        return this.f3815a.d();
    }

    public int d() {
        return this.f3815a.a();
    }

    public ContentInfo f() {
        ContentInfo contentInfoB = this.f3815a.b();
        Objects.requireNonNull(contentInfoB);
        return AbstractC0844c.a(contentInfoB);
    }

    public String toString() {
        return this.f3815a.toString();
    }
}
