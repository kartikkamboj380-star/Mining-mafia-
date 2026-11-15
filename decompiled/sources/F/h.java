package F;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h extends f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Class f671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final Constructor f672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final Method f673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final Method f674j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected final Method f675k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected final Method f676l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final Method f677m;

    public h() {
        Class clsV;
        Constructor constructorW;
        Method methodS;
        Method methodT;
        Method methodX;
        Method methodR;
        Method methodU;
        try {
            clsV = v();
            constructorW = w(clsV);
            methodS = s(clsV);
            methodT = t(clsV);
            methodX = x(clsV);
            methodR = r(clsV);
            methodU = u(clsV);
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e10.getClass().getName(), e10);
            clsV = null;
            constructorW = null;
            methodS = null;
            methodT = null;
            methodX = null;
            methodR = null;
            methodU = null;
        }
        this.f671g = clsV;
        this.f672h = constructorW;
        this.f673i = methodS;
        this.f674j = methodT;
        this.f675k = methodX;
        this.f676l = methodR;
        this.f677m = methodU;
    }

    private Object l() {
        try {
            return this.f672h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private void m(Object obj) {
        try {
            this.f676l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    private boolean n(Context context, Object obj, String str, int i10, int i11, int i12, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f673i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean o(Object obj, ByteBuffer byteBuffer, int i10, int i11, int i12) {
        try {
            return ((Boolean) this.f674j.invoke(obj, byteBuffer, Integer.valueOf(i10), null, Integer.valueOf(i11), Integer.valueOf(i12))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean p(Object obj) {
        try {
            return ((Boolean) this.f675k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    private boolean q() {
        if (this.f673i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f673i != null;
    }

    @Override // F.f, F.k
    public Typeface a(Context context, E.e.c cVar, Resources resources, int i10) {
        if (!q()) {
            return super.a(context, cVar, resources, i10);
        }
        Object objL = l();
        if (objL == null) {
            return null;
        }
        E.e.d[] dVarArrA = cVar.a();
        int length = dVarArrA.length;
        int i11 = 0;
        while (i11 < length) {
            E.e.d dVar = dVarArrA[i11];
            Context context2 = context;
            if (!n(context2, objL, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                m(objL);
                return null;
            }
            i11++;
            context = context2;
        }
        if (p(objL)) {
            return i(objL);
        }
        return null;
    }

    @Override // F.f, F.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, L.g.b[] bVarArr, int i10) {
        Typeface typefaceI;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!q()) {
            L.g.b bVarG = g(bVarArr, i10);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarG.d(), AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarG.e()).setItalic(bVarG.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map mapH = l.h(context, bVarArr, cancellationSignal);
        Object objL = l();
        if (objL == null) {
            return null;
        }
        int length = bVarArr.length;
        int i11 = 0;
        boolean z9 = false;
        while (i11 < length) {
            L.g.b bVar = bVarArr[i11];
            ByteBuffer byteBuffer = (ByteBuffer) mapH.get(bVar.d());
            if (byteBuffer == null) {
                obj = objL;
            } else {
                boolean zO = o(objL, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0);
                obj = objL;
                if (!zO) {
                    m(obj);
                    return null;
                }
                z9 = true;
            }
            i11++;
            objL = obj;
            z9 = z9;
        }
        Object obj2 = objL;
        if (!z9) {
            m(obj2);
            return null;
        }
        if (p(obj2) && (typefaceI = i(obj2)) != null) {
            return Typeface.create(typefaceI, i10);
        }
        return null;
    }

    @Override // F.k
    public Typeface d(Context context, Resources resources, int i10, String str, int i11) {
        if (!q()) {
            return super.d(context, resources, i10, str, i11);
        }
        Object objL = l();
        if (objL == null) {
            return null;
        }
        if (!n(context, objL, str, 0, -1, -1, null)) {
            m(objL);
            return null;
        }
        if (p(objL)) {
            return i(objL);
        }
        return null;
    }

    protected Typeface i(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f671g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f677m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    protected Method r(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    protected Method s(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    protected Method t(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    protected Method u(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    protected Class v() {
        return Class.forName("android.graphics.FontFamily");
    }

    protected Constructor w(Class cls) {
        return cls.getConstructor(null);
    }

    protected Method x(Class cls) {
        return cls.getMethod("freeze", null);
    }
}
