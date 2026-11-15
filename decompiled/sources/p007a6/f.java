package p007a6;

import K.p;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.AbstractC1169o;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import com.unity3d.ads.metadata.MediationMetaData;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p057f6.C6982c;
import p057f6.C6985f;
import p057f6.n;
import p057f6.w;
import p067g6.l;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Object f7290k = new Object();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Map f7291l = new p190t.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f7292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n f7294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final n f7295d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final w f7298g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final G6.b f7299h;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f7296e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f7297f = new AtomicBoolean();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final List f7300i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f7301j = new CopyOnWriteArrayList();

    public interface a {
        void onBackgroundStateChanged(boolean z9);
    }

    private static class b implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static AtomicReference f7302a = new AtomicReference();

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
                Application application = (Application) context.getApplicationContext();
                if (f7302a.get() == null) {
                    b bVar = new b();
                    if (AbstractC1169o.a(f7302a, null, bVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(bVar);
                    }
                }
            }
        }

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public void onBackgroundStateChanged(boolean z9) {
            synchronized (f.f7290k) {
                try {
                    ArrayList arrayList = new ArrayList(f.f7291l.values());
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        f fVar = (f) obj;
                        if (fVar.f7296e.get()) {
                            fVar.A(z9);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static class c extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static AtomicReference f7303b = new AtomicReference();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f7304a;

        public c(Context context) {
            this.f7304a = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void b(Context context) {
            if (f7303b.get() == null) {
                c cVar = new c(context);
                if (AbstractC1169o.a(f7303b, null, cVar)) {
                    context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                }
            }
        }

        public void c() {
            this.f7304a.unregisterReceiver(this);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (f.f7290k) {
                try {
                    Iterator it = f.f7291l.values().iterator();
                    while (it.hasNext()) {
                        ((f) it.next()).t();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            c();
        }
    }

    protected f(final Context context, String str, n nVar) {
        this.f7292a = (Context) Preconditions.checkNotNull(context);
        this.f7293b = Preconditions.checkNotEmpty(str);
        this.f7294c = (n) Preconditions.checkNotNull(nVar);
        o oVarB = FirebaseInitProvider.b();
        p088i7.c.b("Firebase");
        p088i7.c.b("ComponentDiscovery");
        List listB = C6985f.c(context, ComponentDiscoveryService.class).b();
        p088i7.c.a();
        p088i7.c.b("Runtime");
        n.b bVarF = n.m(l.INSTANCE).d(listB).c(new FirebaseCommonRegistrar()).c(new ExecutorsRegistrar()).b(C6982c.q(context, Context.class, new Class[0])).b(C6982c.q(this, f.class, new Class[0])).b(C6982c.q(nVar, n.class, new Class[0])).f(new p088i7.b());
        if (p.a(context) && FirebaseInitProvider.c()) {
            bVarF.b(C6982c.q(oVarB, o.class, new Class[0]));
        }
        n nVarE = bVarF.e();
        this.f7295d = nVarE;
        p088i7.c.a();
        this.f7298g = new w(new G6.b() { // from class: a6.d
            @Override // G6.b
            public final Object get() {
                return f.b(this.f7287a, context);
            }
        });
        this.f7299h = nVarE.f(E6.f.class);
        g(new a() { // from class: a6.e
            @Override // a6.f.a
            public final void onBackgroundStateChanged(boolean z9) {
                f.a(this.f7289a, z9);
            }
        });
        p088i7.c.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A(boolean z9) {
        Log.d("FirebaseApp", "Notifying background state change listeners.");
        Iterator it = this.f7300i.iterator();
        while (it.hasNext()) {
            ((a) it.next()).onBackgroundStateChanged(z9);
        }
    }

    private void B() {
        Iterator it = this.f7301j.iterator();
        while (it.hasNext()) {
            ((g) it.next()).a(this.f7293b, this.f7294c);
        }
    }

    public static /* synthetic */ void a(f fVar, boolean z9) {
        if (z9) {
            fVar.getClass();
        } else {
            ((E6.f) fVar.f7299h.get()).h();
        }
    }

    public static /* synthetic */ L6.a b(f fVar, Context context) {
        return new L6.a(context, fVar.s(), (D6.c) fVar.f7295d.a(D6.c.class));
    }

    private void i() {
        Preconditions.checkState(!this.f7297f.get(), "FirebaseApp was deleted");
    }

    private static List l() {
        ArrayList arrayList = new ArrayList();
        synchronized (f7290k) {
            try {
                Iterator it = f7291l.values().iterator();
                while (it.hasNext()) {
                    arrayList.add(((f) it.next()).q());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static List n(Context context) {
        ArrayList arrayList;
        synchronized (f7290k) {
            arrayList = new ArrayList(f7291l.values());
        }
        return arrayList;
    }

    public static f o() {
        f fVar;
        synchronized (f7290k) {
            try {
                fVar = (f) f7291l.get("[DEFAULT]");
                if (fVar == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
                ((E6.f) fVar.f7299h.get()).h();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static f p(String str) {
        f fVar;
        String str2;
        synchronized (f7290k) {
            try {
                fVar = (f) f7291l.get(z(str));
                if (fVar == null) {
                    List listL = l();
                    if (listL.isEmpty()) {
                        str2 = "";
                    } else {
                        str2 = "Available app names: " + TextUtils.join(", ", listL);
                    }
                    throw new IllegalStateException(String.format("FirebaseApp with name %s doesn't exist. %s", str, str2));
                }
                ((E6.f) fVar.f7299h.get()).h();
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t() {
        if (!p.a(this.f7292a)) {
            Log.i("FirebaseApp", "Device in Direct Boot Mode: postponing initialization of Firebase APIs for app " + q());
            c.b(this.f7292a);
            return;
        }
        Log.i("FirebaseApp", "Device unlocked: initializing all Firebase APIs for app " + q());
        this.f7295d.p(y());
        ((E6.f) this.f7299h.get()).h();
    }

    public static f u(Context context) {
        synchronized (f7290k) {
            try {
                if (f7291l.containsKey("[DEFAULT]")) {
                    return o();
                }
                n nVarA = n.a(context);
                if (nVarA == null) {
                    Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                    return null;
                }
                return v(context, nVarA);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static f v(Context context, n nVar) {
        return w(context, nVar, "[DEFAULT]");
    }

    public static f w(Context context, n nVar, String str) {
        f fVar;
        b.b(context);
        String strZ = z(str);
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f7290k) {
            Map map = f7291l;
            Preconditions.checkState(!map.containsKey(strZ), "FirebaseApp name " + strZ + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            fVar = new f(context, strZ, nVar);
            map.put(strZ, fVar);
        }
        fVar.t();
        return fVar;
    }

    private static String z(String str) {
        return str.trim();
    }

    public void C(boolean z9) {
        i();
        if (this.f7296e.compareAndSet(!z9, z9)) {
            boolean zIsInBackground = BackgroundDetector.getInstance().isInBackground();
            if (z9 && zIsInBackground) {
                A(true);
            } else {
                if (z9 || !zIsInBackground) {
                    return;
                }
                A(false);
            }
        }
    }

    public void D(Boolean bool) {
        i();
        ((L6.a) this.f7298g.get()).e(bool);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f7293b.equals(((f) obj).q());
        }
        return false;
    }

    public void g(a aVar) {
        i();
        if (this.f7296e.get() && BackgroundDetector.getInstance().isInBackground()) {
            aVar.onBackgroundStateChanged(true);
        }
        this.f7300i.add(aVar);
    }

    public void h(g gVar) {
        i();
        Preconditions.checkNotNull(gVar);
        this.f7301j.add(gVar);
    }

    public int hashCode() {
        return this.f7293b.hashCode();
    }

    public void j() {
        if (this.f7297f.compareAndSet(false, true)) {
            synchronized (f7290k) {
                f7291l.remove(this.f7293b);
            }
            B();
        }
    }

    public Object k(Class cls) {
        i();
        return this.f7295d.a(cls);
    }

    public Context m() {
        i();
        return this.f7292a;
    }

    public String q() {
        i();
        return this.f7293b;
    }

    public n r() {
        i();
        return this.f7294c;
    }

    public String s() {
        return Base64Utils.encodeUrlSafeNoPadding(q().getBytes(Charset.defaultCharset())) + "+" + Base64Utils.encodeUrlSafeNoPadding(r().c().getBytes(Charset.defaultCharset()));
    }

    public String toString() {
        return Objects.toStringHelper(this).add(MediationMetaData.KEY_NAME, this.f7293b).add("options", this.f7294c).toString();
    }

    public boolean x() {
        i();
        return ((L6.a) this.f7298g.get()).b();
    }

    public boolean y() {
        return "[DEFAULT]".equals(q());
    }
}
