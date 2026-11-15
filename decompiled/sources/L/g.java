package L;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f3020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b[] f3021b;

        public a(int i10, b[] bVarArr) {
            this.f3020a = i10;
            this.f3021b = bVarArr;
        }

        static a a(int i10, b[] bVarArr) {
            return new a(i10, bVarArr);
        }

        public b[] b() {
            return this.f3021b;
        }

        public int c() {
            return this.f3020a;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f3022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f3023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f3024c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f3025d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f3026e;

        public b(Uri uri, int i10, int i11, boolean z9, int i12) {
            this.f3022a = (Uri) N.f.g(uri);
            this.f3023b = i10;
            this.f3024c = i11;
            this.f3025d = z9;
            this.f3026e = i12;
        }

        static b a(Uri uri, int i10, int i11, boolean z9, int i12) {
            return new b(uri, i10, i11, z9, i12);
        }

        public int b() {
            return this.f3026e;
        }

        public int c() {
            return this.f3023b;
        }

        public Uri d() {
            return this.f3022a;
        }

        public int e() {
            return this.f3024c;
        }

        public boolean f() {
            return this.f3025d;
        }
    }

    public static class c {
        public abstract void a(int i10);

        public abstract void b(Typeface typeface);
    }

    public static Typeface a(Context context, CancellationSignal cancellationSignal, b[] bVarArr) {
        return F.e.b(context, cancellationSignal, bVarArr, 0);
    }

    public static a b(Context context, CancellationSignal cancellationSignal, e eVar) {
        return d.e(context, eVar, cancellationSignal);
    }

    public static Typeface c(Context context, e eVar, int i10, boolean z9, int i11, Handler handler, c cVar) {
        L.a aVar = new L.a(cVar, handler);
        return z9 ? f.e(context, eVar, aVar, i10, i11) : f.d(context, eVar, i10, null, aVar);
    }
}
