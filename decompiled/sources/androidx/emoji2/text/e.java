package androidx.emoji2.text;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Object f9715o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Object f9716p = new Object();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static volatile e f9717q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f9719b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f9722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final h f9723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f9724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f9725h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final boolean f9726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int[] f9727j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f9728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f9729l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f9730m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final InterfaceC0154e f9731n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReadWriteLock f9718a = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile int f9720c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f9721d = new Handler(Looper.getMainLooper());

    private static final class a extends b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile androidx.emoji2.text.h f9732b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile l f9733c;

        /* JADX INFO: renamed from: androidx.emoji2.text.e$a$a, reason: collision with other inner class name */
        class C0153a extends i {
            C0153a() {
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th) {
                a.this.f9735a.n(th);
            }

            @Override // androidx.emoji2.text.e.i
            public void b(l lVar) {
                a.this.d(lVar);
            }
        }

        a(e eVar) {
            super(eVar);
        }

        @Override // androidx.emoji2.text.e.b
        void a() {
            try {
                this.f9735a.f9723f.a(new C0153a());
            } catch (Throwable th) {
                this.f9735a.n(th);
            }
        }

        @Override // androidx.emoji2.text.e.b
        CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z9) {
            return this.f9732b.h(charSequence, i10, i11, i12, z9);
        }

        @Override // androidx.emoji2.text.e.b
        void c(EditorInfo editorInfo) {
            editorInfo.extras.putInt("android.support.text.emoji.emojiCompat_metadataVersion", this.f9733c.e());
            editorInfo.extras.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", this.f9735a.f9725h);
        }

        void d(l lVar) {
            if (lVar == null) {
                this.f9735a.n(new IllegalArgumentException("metadataRepo cannot be null"));
                return;
            }
            this.f9733c = lVar;
            l lVar2 = this.f9733c;
            j jVar = this.f9735a.f9724g;
            InterfaceC0154e interfaceC0154e = this.f9735a.f9731n;
            e eVar = this.f9735a;
            this.f9732b = new androidx.emoji2.text.h(lVar2, jVar, interfaceC0154e, eVar.f9726i, eVar.f9727j, androidx.emoji2.text.g.a());
            this.f9735a.o();
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e f9735a;

        b(e eVar) {
            this.f9735a = eVar;
        }

        abstract void a();

        abstract CharSequence b(CharSequence charSequence, int i10, int i11, int i12, boolean z9);

        abstract void c(EditorInfo editorInfo);
    }

    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final h f9736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        j f9737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f9738c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f9739d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int[] f9740e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Set f9741f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f9742g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f9743h = -16711936;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f9744i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        InterfaceC0154e f9745j = new androidx.emoji2.text.d();

        protected c(h hVar) {
            N.f.h(hVar, "metadataLoader cannot be null.");
            this.f9736a = hVar;
        }

        protected final h a() {
            return this.f9736a;
        }

        public c b(int i10) {
            this.f9744i = i10;
            return this;
        }
    }

    public static class d implements j {
        @Override // androidx.emoji2.text.e.j
        public p031d0.b a(m mVar) {
            return new p031d0.d(mVar);
        }
    }

    /* JADX INFO: renamed from: androidx.emoji2.text.e$e, reason: collision with other inner class name */
    public interface InterfaceC0154e {
        boolean a(CharSequence charSequence, int i10, int i11, int i12);
    }

    public static abstract class f {
        public void a(Throwable th) {
        }

        public void b() {
        }
    }

    private static class g implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f9746a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f9747b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f9748c;

        g(f fVar, int i10) {
            this(Arrays.asList((f) N.f.h(fVar, "initCallback cannot be null")), i10, null);
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f9746a.size();
            int i10 = 0;
            if (this.f9748c != 1) {
                while (i10 < size) {
                    ((f) this.f9746a.get(i10)).a(this.f9747b);
                    i10++;
                }
            } else {
                while (i10 < size) {
                    ((f) this.f9746a.get(i10)).b();
                    i10++;
                }
            }
        }

        g(Collection collection, int i10) {
            this(collection, i10, null);
        }

        g(Collection collection, int i10, Throwable th) {
            N.f.h(collection, "initCallbacks cannot be null");
            this.f9746a = new ArrayList(collection);
            this.f9748c = i10;
            this.f9747b = th;
        }
    }

    public interface h {
        void a(i iVar);
    }

    public static abstract class i {
        public abstract void a(Throwable th);

        public abstract void b(l lVar);
    }

    public interface j {
        p031d0.b a(m mVar);
    }

    private e(c cVar) {
        this.f9725h = cVar.f9738c;
        this.f9726i = cVar.f9739d;
        this.f9727j = cVar.f9740e;
        this.f9728k = cVar.f9742g;
        this.f9729l = cVar.f9743h;
        this.f9723f = cVar.f9736a;
        this.f9730m = cVar.f9744i;
        this.f9731n = cVar.f9745j;
        p190t.b bVar = new p190t.b();
        this.f9719b = bVar;
        j jVar = cVar.f9737b;
        this.f9724g = jVar == null ? new d() : jVar;
        Set set = cVar.f9741f;
        if (set != null && !set.isEmpty()) {
            bVar.addAll(cVar.f9741f);
        }
        this.f9722e = new a(this);
        m();
    }

    public static e c() {
        e eVar;
        synchronized (f9715o) {
            eVar = f9717q;
            N.f.i(eVar != null, "EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
        }
        return eVar;
    }

    public static boolean f(InputConnection inputConnection, Editable editable, int i10, int i11, boolean z9) {
        return androidx.emoji2.text.h.b(inputConnection, editable, i10, i11, z9);
    }

    public static boolean g(Editable editable, int i10, KeyEvent keyEvent) {
        return androidx.emoji2.text.h.c(editable, i10, keyEvent);
    }

    public static e h(c cVar) {
        e eVar;
        e eVar2 = f9717q;
        if (eVar2 != null) {
            return eVar2;
        }
        synchronized (f9715o) {
            try {
                eVar = f9717q;
                if (eVar == null) {
                    eVar = new e(cVar);
                    f9717q = eVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    public static boolean i() {
        return f9717q != null;
    }

    private boolean k() {
        return e() == 1;
    }

    private void m() {
        this.f9718a.writeLock().lock();
        try {
            if (this.f9730m == 0) {
                this.f9720c = 0;
            }
            this.f9718a.writeLock().unlock();
            if (e() == 0) {
                this.f9722e.a();
            }
        } catch (Throwable th) {
            this.f9718a.writeLock().unlock();
            throw th;
        }
    }

    public int d() {
        return this.f9729l;
    }

    public int e() {
        this.f9718a.readLock().lock();
        try {
            return this.f9720c;
        } finally {
            this.f9718a.readLock().unlock();
        }
    }

    public boolean j() {
        return this.f9728k;
    }

    public void l() {
        N.f.i(this.f9730m == 1, "Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        if (k()) {
            return;
        }
        this.f9718a.writeLock().lock();
        try {
            if (this.f9720c == 0) {
                this.f9718a.writeLock().unlock();
                return;
            }
            this.f9720c = 0;
            this.f9718a.writeLock().unlock();
            this.f9722e.a();
        } catch (Throwable th) {
            this.f9718a.writeLock().unlock();
            throw th;
        }
    }

    void n(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f9718a.writeLock().lock();
        try {
            this.f9720c = 2;
            arrayList.addAll(this.f9719b);
            this.f9719b.clear();
            this.f9718a.writeLock().unlock();
            this.f9721d.post(new g(arrayList, this.f9720c, th));
        } catch (Throwable th2) {
            this.f9718a.writeLock().unlock();
            throw th2;
        }
    }

    void o() {
        ArrayList arrayList = new ArrayList();
        this.f9718a.writeLock().lock();
        try {
            this.f9720c = 1;
            arrayList.addAll(this.f9719b);
            this.f9719b.clear();
            this.f9718a.writeLock().unlock();
            this.f9721d.post(new g(arrayList, this.f9720c));
        } catch (Throwable th) {
            this.f9718a.writeLock().unlock();
            throw th;
        }
    }

    public CharSequence p(CharSequence charSequence) {
        return q(charSequence, 0, charSequence == null ? 0 : charSequence.length());
    }

    public CharSequence q(CharSequence charSequence, int i10, int i11) {
        return r(charSequence, i10, i11, Api.BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public CharSequence r(CharSequence charSequence, int i10, int i11, int i12) {
        return s(charSequence, i10, i11, i12, 0);
    }

    public CharSequence s(CharSequence charSequence, int i10, int i11, int i12, int i13) {
        boolean z9;
        N.f.i(k(), "Not initialized yet");
        N.f.e(i10, "start cannot be negative");
        N.f.e(i11, "end cannot be negative");
        N.f.e(i12, "maxEmojiCount cannot be negative");
        N.f.b(i10 <= i11, "start should be <= than end");
        if (charSequence == null) {
            return null;
        }
        N.f.b(i10 <= charSequence.length(), "start should be < than charSequence length");
        N.f.b(i11 <= charSequence.length(), "end should be < than charSequence length");
        if (charSequence.length() == 0 || i10 == i11) {
            return charSequence;
        }
        if (i13 != 1) {
            z9 = i13 != 2 ? this.f9725h : false;
        } else {
            z9 = true;
        }
        return this.f9722e.b(charSequence, i10, i11, i12, z9);
    }

    public void t(f fVar) {
        N.f.h(fVar, "initCallback cannot be null");
        this.f9718a.writeLock().lock();
        try {
            if (this.f9720c == 1 || this.f9720c == 2) {
                this.f9721d.post(new g(fVar, this.f9720c));
            } else {
                this.f9719b.add(fVar);
            }
        } finally {
            this.f9718a.writeLock().unlock();
        }
    }

    public void u(f fVar) {
        N.f.h(fVar, "initCallback cannot be null");
        this.f9718a.writeLock().lock();
        try {
            this.f9719b.remove(fVar);
        } finally {
            this.f9718a.writeLock().unlock();
        }
    }

    public void v(EditorInfo editorInfo) {
        if (!k() || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        this.f9722e.c(editorInfo);
    }
}
