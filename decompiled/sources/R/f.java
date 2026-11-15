package R;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f5080a;

    private interface c {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public f(Uri uri, ClipDescription clipDescription, Uri uri2) {
        if (Build.VERSION.SDK_INT >= 25) {
            this.f5080a = new a(uri, clipDescription, uri2);
        } else {
            this.f5080a = new b(uri, clipDescription, uri2);
        }
    }

    public static f f(Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new f(new a(obj));
        }
        return null;
    }

    public Uri a() {
        return this.f5080a.b();
    }

    public ClipDescription b() {
        return this.f5080a.getDescription();
    }

    public Uri c() {
        return this.f5080a.d();
    }

    public void d() {
        this.f5080a.c();
    }

    public Object e() {
        return this.f5080a.a();
    }

    private static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final InputContentInfo f5081a;

        a(Object obj) {
            this.f5081a = (InputContentInfo) obj;
        }

        @Override // R.f.c
        public Object a() {
            return this.f5081a;
        }

        @Override // R.f.c
        public Uri b() {
            return this.f5081a.getContentUri();
        }

        @Override // R.f.c
        public void c() {
            this.f5081a.requestPermission();
        }

        @Override // R.f.c
        public Uri d() {
            return this.f5081a.getLinkUri();
        }

        @Override // R.f.c
        public ClipDescription getDescription() {
            return this.f5081a.getDescription();
        }

        a(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f5081a = new InputContentInfo(uri, clipDescription, uri2);
        }
    }

    private f(c cVar) {
        this.f5080a = cVar;
    }

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f5082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ClipDescription f5083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Uri f5084c;

        b(Uri uri, ClipDescription clipDescription, Uri uri2) {
            this.f5082a = uri;
            this.f5083b = clipDescription;
            this.f5084c = uri2;
        }

        @Override // R.f.c
        public Object a() {
            return null;
        }

        @Override // R.f.c
        public Uri b() {
            return this.f5082a;
        }

        @Override // R.f.c
        public Uri d() {
            return this.f5084c;
        }

        @Override // R.f.c
        public ClipDescription getDescription() {
            return this.f5083b;
        }

        @Override // R.f.c
        public void c() {
        }
    }
}
