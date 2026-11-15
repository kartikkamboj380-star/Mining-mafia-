package F;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class f extends k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Class f662b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Constructor f663c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f664d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f665e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f666f = false;

    f() {
    }

    private static boolean h(Object obj, String str, int i10, boolean z9) throws NoSuchMethodException {
        k();
        try {
            return ((Boolean) f664d.invoke(obj, str, Integer.valueOf(i10), Boolean.valueOf(z9))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private static Typeface i(Object obj) throws NoSuchMethodException {
        k();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f662b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f665e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File j(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String str = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(str).st_mode)) {
                return new File(str);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    private static void k() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f666f) {
            return;
        }
        f666f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e10) {
            Log.e("TypefaceCompatApi21Impl", e10.getClass().getName(), e10);
            method = null;
            cls = null;
            method2 = null;
        }
        f663c = constructor;
        f662b = cls;
        f664d = method2;
        f665e = method;
    }

    private static Object l() throws NoSuchMethodException {
        k();
        try {
            return f663c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // F.k
    public Typeface a(Context context, E.e.c cVar, Resources resources, int i10) throws NoSuchMethodException {
        Object objL = l();
        for (E.e.d dVar : cVar.a()) {
            File fileE = l.e(context);
            if (fileE == null) {
                return null;
            }
            try {
                if (!l.c(fileE, resources, dVar.b())) {
                    return null;
                }
                if (!h(objL, fileE.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                fileE.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileE.delete();
            }
        }
        return i(objL);
    }

    @Override // F.k
    public Typeface b(Context context, CancellationSignal cancellationSignal, L.g.b[] bVarArr, int i10) {
        Typeface typefaceC;
        if (bVarArr.length < 1) {
            return null;
        }
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
                File fileJ = j(parcelFileDescriptorOpenFileDescriptor);
                if (fileJ == null || !fileJ.canRead()) {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                    try {
                        typefaceC = super.c(context, fileInputStream);
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } else {
                    typefaceC = Typeface.createFromFile(fileJ);
                }
                parcelFileDescriptorOpenFileDescriptor.close();
                return typefaceC;
            } catch (Throwable th3) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
