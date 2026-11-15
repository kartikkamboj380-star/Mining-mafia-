package L;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import p190t.j;
import p190t.k;

/* JADX INFO: loaded from: classes.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final j f3004a = new j(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f3005b = h.a("fonts-androidx", 10, UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Object f3006c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final k f3007d = new k();

    class a implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f3009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ L.e f3010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3011d;

        a(String str, Context context, L.e eVar, int i10) {
            this.f3008a = str;
            this.f3009b = context;
            this.f3010c = eVar;
            this.f3011d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            return f.c(this.f3008a, this.f3009b, this.f3010c, this.f3011d);
        }
    }

    class b implements N.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ L.a f3012a;

        b(L.a aVar) {
            this.f3012a = aVar;
        }

        @Override // N.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            if (eVar == null) {
                eVar = new e(-3);
            }
            this.f3012a.b(eVar);
        }
    }

    class c implements Callable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f3014b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ L.e f3015c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f3016d;

        c(String str, Context context, L.e eVar, int i10) {
            this.f3013a = str;
            this.f3014b = context;
            this.f3015c = eVar;
            this.f3016d = i10;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e call() {
            try {
                return f.c(this.f3013a, this.f3014b, this.f3015c, this.f3016d);
            } catch (Throwable unused) {
                return new e(-3);
            }
        }
    }

    class d implements N.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3017a;

        d(String str) {
            this.f3017a = str;
        }

        @Override // N.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(e eVar) {
            synchronized (f.f3006c) {
                try {
                    k kVar = f.f3007d;
                    ArrayList arrayList = (ArrayList) kVar.get(this.f3017a);
                    if (arrayList == null) {
                        return;
                    }
                    kVar.remove(this.f3017a);
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        ((N.a) arrayList.get(i10)).accept(eVar);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    private static String a(L.e eVar, int i10) {
        return eVar.d() + "-" + i10;
    }

    private static int b(g.a aVar) {
        int i10 = 1;
        if (aVar.c() != 0) {
            return aVar.c() != 1 ? -3 : -2;
        }
        g.b[] bVarArrB = aVar.b();
        if (bVarArrB != null && bVarArrB.length != 0) {
            i10 = 0;
            for (g.b bVar : bVarArrB) {
                int iB = bVar.b();
                if (iB != 0) {
                    if (iB < 0) {
                        return -3;
                    }
                    return iB;
                }
            }
        }
        return i10;
    }

    static e c(String str, Context context, L.e eVar, int i10) {
        j jVar = f3004a;
        Typeface typeface = (Typeface) jVar.c(str);
        if (typeface != null) {
            return new e(typeface);
        }
        try {
            g.a aVarE = L.d.e(context, eVar, null);
            int iB = b(aVarE);
            if (iB != 0) {
                return new e(iB);
            }
            Typeface typefaceB = F.e.b(context, null, aVarE.b(), i10);
            if (typefaceB == null) {
                return new e(-3);
            }
            jVar.d(str, typefaceB);
            return new e(typefaceB);
        } catch (PackageManager.NameNotFoundException unused) {
            return new e(-1);
        }
    }

    static Typeface d(Context context, L.e eVar, int i10, Executor executor, L.a aVar) {
        String strA = a(eVar, i10);
        Typeface typeface = (Typeface) f3004a.c(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        b bVar = new b(aVar);
        synchronized (f3006c) {
            try {
                k kVar = f3007d;
                ArrayList arrayList = (ArrayList) kVar.get(strA);
                if (arrayList != null) {
                    arrayList.add(bVar);
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(bVar);
                kVar.put(strA, arrayList2);
                c cVar = new c(strA, context, eVar, i10);
                if (executor == null) {
                    executor = f3005b;
                }
                h.b(executor, cVar, new d(strA));
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static Typeface e(Context context, L.e eVar, L.a aVar, int i10, int i11) {
        String strA = a(eVar, i10);
        Typeface typeface = (Typeface) f3004a.c(strA);
        if (typeface != null) {
            aVar.b(new e(typeface));
            return typeface;
        }
        if (i11 == -1) {
            e eVarC = c(strA, context, eVar, i10);
            aVar.b(eVarC);
            return eVarC.f3018a;
        }
        try {
            e eVar2 = (e) h.c(f3005b, new a(strA, context, eVar, i10), i11);
            aVar.b(eVar2);
            return eVar2.f3018a;
        } catch (InterruptedException unused) {
            aVar.b(new e(-3));
            return null;
        }
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Typeface f3018a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f3019b;

        e(int i10) {
            this.f3018a = null;
            this.f3019b = i10;
        }

        boolean a() {
            return this.f3019b == 0;
        }

        e(Typeface typeface) {
            this.f3018a = typeface;
            this.f3019b = 0;
        }
    }
}
