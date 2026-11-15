package F;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import com.google.android.gms.common.api.Api;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap f678a = new ConcurrentHashMap();

    class a implements b {
        a() {
        }

        @Override // F.k.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public int b(L.g.b bVar) {
            return bVar.e();
        }

        @Override // F.k.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(L.g.b bVar) {
            return bVar.f();
        }
    }

    private interface b {
        boolean a(Object obj);

        int b(Object obj);
    }

    k() {
    }

    private static Object e(Object[] objArr, int i10, b bVar) {
        return f(objArr, (i10 & 1) == 0 ? CommonGatewayClient.CODE_400 : 700, (i10 & 2) != 0, bVar);
    }

    private static Object f(Object[] objArr, int i10, boolean z9, b bVar) {
        Object obj = null;
        int i11 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (Object obj2 : objArr) {
            int iAbs = (Math.abs(bVar.b(obj2) - i10) * 2) + (bVar.a(obj2) == z9 ? 0 : 1);
            if (obj == null || i11 > iAbs) {
                obj = obj2;
                i11 = iAbs;
            }
        }
        return obj;
    }

    public abstract Typeface a(Context context, E.e.c cVar, Resources resources, int i10);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, L.g.b[] bVarArr, int i10);

    protected Typeface c(Context context, InputStream inputStream) {
        File fileE = l.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (l.d(fileE, inputStream)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        File fileE = l.e(context);
        if (fileE == null) {
            return null;
        }
        try {
            if (l.c(fileE, resources, i10)) {
                return Typeface.createFromFile(fileE.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            fileE.delete();
        }
    }

    protected L.g.b g(L.g.b[] bVarArr, int i10) {
        return (L.g.b) e(bVarArr, i10, new a());
    }
}
